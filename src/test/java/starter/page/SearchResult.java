package starter.page;

import net.serenitybdd.screenplay.targets.Target;

public class SearchResult {
    public static Target RESULT_LIST = Target.the("").locatedBy("//article[@real_estate_code='listing_result']");
}
