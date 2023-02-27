package starter.page;

import net.serenitybdd.screenplay.targets.Target;

public class SearchPage {
    public static Target SEARCH_INPUT = Target.the("").locatedBy("//div[@id='live-search']/input");
    public static Target PROPERTY_TYPE = Target.the("").locatedBy("//a[@id='type-combobox']/i");
    public static Target APARTMENT_TYPE = Target.the("").locatedBy("//li[@data-value='apartamentos']");
    public static Target SEARCH_BUTTON = Target.the("").locatedBy("//div[contains(@class, 'search-button-area')]/button");
//    public static Target SEARCH_INPUT = Target.the("").locatedBy("");
}
