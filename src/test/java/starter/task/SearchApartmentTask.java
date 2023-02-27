package starter.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static starter.page.SearchPage.*;

public class SearchApartmentTask {

    public static Performable search(String destination) {
        return Task.where("{0} searches for an apartment at '" + "'",
                Open.url("https://www.lahaus.com/"),
                Enter.theValue(destination).into(SEARCH_INPUT),
                Click.on(PROPERTY_TYPE),
                Click.on(APARTMENT_TYPE),
                Click.on(SEARCH_BUTTON)
        );
    }
}
