package com.lahaus.page;

import net.serenitybdd.screenplay.targets.Target;

public class SearchResult {
    public static Target RESULT_LIST = Target.the("list results").locatedBy("//article[@real_estate_code='listing_result']");
    public static Target RESULT_VALUE = Target.the("value result").locatedBy("//article[@real_estate_code='listing_result']/div/div/p");
    public static Target IMAGE_NO_FOUND = Target.the("image not found").locatedBy("//img[@title='Página no encontrada']");
}
