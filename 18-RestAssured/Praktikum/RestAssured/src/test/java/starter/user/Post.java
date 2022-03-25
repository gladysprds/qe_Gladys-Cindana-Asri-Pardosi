package starter.user;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;


import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Post {

    private static String base_url = "https://demoqa.com/Account/v1/";

    @Step("I set an endpoint for POST new user")
    public String setPostEndpoint() {
        return base_url + "User";
    }

    @Step("I request POST detail user")
    public void requestPostDetailUser() {
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "iloverestAAssured995");
        requestData.put("password", "iloverestAAssured65*");

        SerenityRest.given().header("Content-Type", "application/json").body(requestData.toJSONString());
        SerenityRest.when().post(setPostEndpoint());
    }

    @Step("validate the data detail after create user")
    public void validateDataDetail() {
        SerenityRest.then().body("username", equalTo("iloverestAAssured995"));
    }

    @Step("get userId for other request")
    public String getUserId() {
        Response response = SerenityRest.lastResponse();
        String userId = response.body().path("userID");
        System.out.println(userId);
        return userId;
    }

    @Step("I request post detail user with invalid password")
    public void requestDetailInvalidPassword() {
        JSONObject requestInvalid = new JSONObject();

        requestInvalid.put("userName", "mbokiyem");
        requestInvalid.put("password", "mbokiyem");

        SerenityRest.given().header("Content-Type", "application/json").body(requestInvalid.toJSONString());
        SerenityRest.when().post(setPostEndpoint());
    }

    @Step("I validate the error message")
    public void validateErrorMess(){
        SerenityRest.then().body("code", equalTo("1300"));
        SerenityRest.then().body("message", equalTo("Passwords must have at least one non alphanumeric character, one digit ('0'-'9'), one uppercase ('A'-'Z'), one lowercase ('a'-'z'), one special character and Password must be eight characters or longer."));
    }


        @Step("I validate the exist message")
        public void validateExistMessage() {
            SerenityRest.then().body("code", equalTo("1204"));
            SerenityRest.then().body("message", equalTo("User exists!"));

        }





}