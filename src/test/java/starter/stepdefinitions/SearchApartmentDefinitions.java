package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.task.SearchApartmentTask;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static starter.page.SearchResult.RESULT_LIST;

public class SearchApartmentDefinitions {

    @When("{actor} is searching for an apartment at {string}")
    public void search_apartment(Actor actor, String destination) {
        actor.attemptsTo(
                SearchApartmentTask.search(destination)
        );
    }

    @Then("it should be at least one option available")
    public void should_find_option_available(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(RESULT_LIST, isVisible()).forNoMoreThan(Duration.ofSeconds(3))
        );
        Ensure.that(RESULT_LIST).values().hasSizeGreaterThan(1);
    }
}
