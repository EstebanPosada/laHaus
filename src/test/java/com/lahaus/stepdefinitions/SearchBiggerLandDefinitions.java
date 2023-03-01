package com.lahaus.stepdefinitions;

import com.lahaus.page.SearchResult;
import com.lahaus.task.SearchBiggerLandTask;
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

import static com.lahaus.page.SearchResult.RESULT_VALUE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchBiggerLandDefinitions {
    @When("{actor} is searching for bigger land at {string}")
    public void search_bigger_land(Actor actor, String place) {
        actor.attemptsTo(SearchBiggerLandTask.search(place));
    }

    @Then("it should found a place bigger than {int} m2")
    public void should_find_option_bigger_than(int size) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(SearchResult.RESULT_LIST, isVisible()).forNoMoreThan(Duration.ofSeconds(8))
        );
        String readValue = OnStage.theActorInTheSpotlight().asksFor(Text.of(RESULT_VALUE));
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(readValue);
        String stringValue = "0";
        if (m.find()) stringValue = m.group();
        Integer intValue = Integer.parseInt(stringValue);
        Ensure.that(intValue).isGreaterThan(size);
    }
}
