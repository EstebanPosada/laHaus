package com.lahaus.page;

import net.serenitybdd.screenplay.targets.Target;

public class SearchPage {
    public static Target SEARCH_INPUT = Target.the("search input for destination").locatedBy("//div[@id='live-search']/input");
    public static Target PROPERTY_TYPE = Target.the("property type").locatedBy("//a[@id='type-combobox']/i");
    public static Target APARTMENT_TYPE = Target.the("apartment type").locatedBy("//li[@data-value='apartamentos']");
    public static Target HOUSE_TYPE = Target.the("house type").locatedBy("//li[@data-value='casas']");
    public static Target SEARCH_BUTTON = Target.the("search button").locatedBy("//div[contains(@class, 'search-button-area')]/button");
    public static Target ADD_ROOM_ACTION = Target.the("add room action").locatedBy("//i[@class='fa fa-add-icon']");
    public static Target CITY_CHIP = Target.the("").locatedBy("//button[@data-city='medellin']");
    public static Target NEW_PROJECT = Target.the("").locatedBy("//div[@data-city='medellin']/a[@data-lh-id='home-card-where-do-you-want-to-live-section-proyectos-de-vivienda']");
    public static Target CITY_FROM_LIST = Target.the("").locatedBy("//li[@data-type='city']");
    public static Target LAND_TYPE = Target.the("land type").locatedBy("//li[@data-value='lotes']");
//    public static Target A = Target.the("").locatedBy("");
}
