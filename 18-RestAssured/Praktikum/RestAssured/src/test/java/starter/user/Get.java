package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.Matchers.equalTo;




public class Get {


    @Steps
    Post post;

    private static String base_url = "https://demoqa.com/Account/v1/";


    @Step("I set an endpoint for GET detail user")
    public String setAnEndpointForGet(String userId){
        return base_url + "User/" + userId;
    }


    @Step
            ("I validate the status code is {int}")
    public void validateStatusCode(int statusCode){
        SerenityRest.then().statusCode(statusCode);
    }


    @Step("I validate the status code is {int}")
    public void validateStatusCode400(int statusCode){
        SerenityRest.then().statusCode(statusCode);
    }

    @Step("I validate the exist status code is {int}")
    public void validateExistingStatusCode406 (int statusCode){
        SerenityRest.then().statusCode(statusCode);
    }


    @Step("I request GET detail user")
    public void requestGetDetailUser(String userId, String token){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", token)
                .when()
                .get(setAnEndpointForGet(userId));
    }

    @Step("validate the data detail")
    public void validateDataDetail(String userId){
        SerenityRest.then().body("userId", equalTo(userId));
    }


    @Step("validate invalid generate token")
    public void validateInvalidGenerateToken(){
        SerenityRest.then().body("token", equalTo("null"));
        SerenityRest.then().body("result", equalTo("User authorization failed."));
    }
}
