package com.lahaus.page;

import net.serenitybdd.screenplay.targets.Target;

public class SearchResult {
    public static Target RESULT_LIST = Target.the("").locatedBy("//article[@real_estate_code='listing_result']");
    public static Target RESULT_VALUE = Target.the("").locatedBy("//article[@real_estate_code='listing_result']/div/div/p");
}
