package com.lahaus.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import static com.lahaus.page.SearchPage.*;

public class SearchHouseTask {
    public static Performable search(String destination, int rooms) {
        return Task.where("{0} searches for a house with '" + rooms + "' rooms at '" + destination + "'",
                actor -> {
                    actor.attemptsTo(Open.url("https://www.lahaus.com/"));
                    actor.attemptsTo(Enter.theValue(destination).into(SEARCH_INPUT));
                    actor.attemptsTo(Click.on(PROPERTY_TYPE));
                    actor.attemptsTo(Click.on(HOUSE_TYPE));
                    for (int room = 0; room < rooms; room++) {
                        actor.attemptsTo(Click.on(ADD_ROOM_ACTION));
                    }
                    actor.attemptsTo(Click.on(SEARCH_BUTTON));
                }
        );
    }
}
