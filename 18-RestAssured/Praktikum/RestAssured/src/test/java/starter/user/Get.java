package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class Get {

    @Step("I validate the status code is {int}")
    public void validateStatusCode(int statusCode) {
//        restAssuredThat(response -> response.statusCode(statusCode));
        SerenityRest.then().statusCode(statusCode);
    }
}