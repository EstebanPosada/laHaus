package com.lahaus.stepdefinitions;

import com.lahaus.page.SearchResult;
import com.lahaus.task.SearchNewProjectTask;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchNewProjectDefinitions {
    @When("{actor} is searching in {string} for a new project")
    public void search_new_project(Actor actor, String place){
        actor.attemptsTo(SearchNewProjectTask.search(place));
    }
    @Then("it should find at least one option available")
    public void should_find_an_option_available() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(SearchResult.RESULT_LIST, isVisible()).forNoMoreThan(Duration.ofSeconds(8))
        );
        Ensure.that(SearchResult.RESULT_LIST).values().hasSizeGreaterThan(1);
    }
}
