package com.lahaus.stepdefinitions;

import com.lahaus.task.SearchHouseTask;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.lahaus.page.SearchResult.RESULT_LIST;
import static com.lahaus.page.SearchResult.RESULT_VALUE;

public class SearchHouseDefinitions {
    @When("{actor} is searching for a house at {string} with {int} rooms")
    public void search_house_with_rooms(Actor actor, String destination, int rooms) {
        actor.attemptsTo(
                SearchHouseTask.search(destination, rooms)
        );
    }

    @Then("it should be at least one house available with price greater than {int}")
    public void should_find_house_available(Integer value) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(RESULT_LIST, isVisible()).forNoMoreThan(Duration.ofSeconds(30))
        );
        String readValue = OnStage.theActorInTheSpotlight().asksFor(Text.of(RESULT_VALUE));
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(readValue);
        String stringValue = "0";
        if (m.find()) stringValue = m.group();
        Integer intValue = Integer.parseInt(stringValue);
        Ensure.that(intValue).isGreaterThan(value);
    }
}
