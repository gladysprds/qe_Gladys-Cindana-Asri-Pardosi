package starter.user;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import net.thucydides.core.annotations.Step;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    private static String base_url = "https://demoqa.com/swagger/Account/";

    @Step ("I set an endpoint to create user")
    public String setPostEndpoint(){
        return base_url + "Account/v1/User";
    }

    @Step ("I request POST create user")
    public void requestPostCreateUser(){
        JSONObject requestData = new JSONObject();

        requestData.put("username", "peekaboo1908");
        requestData.put("password", "peekaboo1908*");

        given().header("accept", "application/json")
                .header("connection", "keep-alive")
                .header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setPostEndpoint());
    }

    @Step ("I validate the data that just created")
    public void validateDataJustCreated(){

        then().body("username", equalTo("peekaboo1908"));
    }

}
