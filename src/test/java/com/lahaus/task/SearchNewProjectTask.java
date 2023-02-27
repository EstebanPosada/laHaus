package com.lahaus.task;

import com.lahaus.page.SearchPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class SearchNewProjectTask {
    public static Performable search(String destination) {
        return Task.where("{0} searches for a new project at '" + destination + "'",
                Open.url("https://www.lahaus.com/"),
                Click.on(SearchPage.CITY_CHIP),
                Click.on(SearchPage.NEW_PROJECT)
        );
    }
}
