package com.lahaus.task;

import com.lahaus.page.SearchPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class SearchLandTask {
    public static Performable search(String typing, String destination) {
        return Task.where("{0} searches for a land at '" + destination + "' by typing '" + typing + "'",
                Open.url("https://www.lahaus.com/"),
                Click.on(SearchPage.SEARCH_INPUT),
                Enter.theValue(typing).into(SearchPage.SEARCH_INPUT),
                Click.on(SearchPage.CITY_FROM_LIST),
                Click.on(SearchPage.LAND_TYPE),
                Click.on(SearchPage.SEARCH_BUTTON)
        );
    }
}
