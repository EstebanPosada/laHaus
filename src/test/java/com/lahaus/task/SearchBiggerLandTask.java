package com.lahaus.task;

import com.lahaus.page.SearchPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchBiggerLandTask {
    public static Performable search(String place) {
        return Task.where("{0} is searching for bigger land at '" + place + "'",
                Open.url("https://www.lahaus.com/"),
                Click.on(SearchPage.SEARCH_INPUT),
                Enter.theValue(place).into(SearchPage.SEARCH_INPUT),
                Click.on(SearchPage.CITY_FROM_LIST),
                Click.on(SearchPage.LAND_TYPE),
                Click.on(SearchPage.SEARCH_BUTTON)
        );
    }
}
