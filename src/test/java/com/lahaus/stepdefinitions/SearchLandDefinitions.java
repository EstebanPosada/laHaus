package com.lahaus.stepdefinitions;

import com.lahaus.page.SearchResult;
import com.lahaus.task.SearchLandTask;
import com.lahaus.task.SearchNewProjectTask;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchLandDefinitions {
    @When("{actor} is searching for a land at {string}")
    public void search_new_project(Actor actor, String place) {
        actor.attemptsTo(SearchLandTask.search(place));
    }

    @Then("there is no results")
    public void no_results_found() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(SearchResult.IMAGE_NO_FOUND, isVisible()).forNoMoreThan(Duration.ofSeconds(8))
        );
        Ensure.that(SearchResult.IMAGE_NO_FOUND).isDisplayed();
    }
}
