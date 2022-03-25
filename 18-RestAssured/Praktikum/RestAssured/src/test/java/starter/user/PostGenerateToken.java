package starter.user;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class PostGenerateToken {
    private static String base_url = "https://demoqa.com/Account/v1/";

    @Step("I set an endpoint for POST generate token")
    public String setEndpointForGenerate(){
        return base_url + "GenerateToken";
    }

    @Step("I set an endpoint for POST new user")
    public String setPostEndpoint() {
        return base_url + "User";
    }

    @Step("I request POST generate token")
    public void requestPostGenerateToken(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "iloverestAAssured995");
        requestData.put("password", "iloverestAAssured995*");

        given().header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setEndpointForGenerate());
    }

    @Step("validate the data detail after generate token")
    public void validateDataDetailGenerateToken(){
        then().body("result", equalTo("User authorized successfully."));
    }

    @Step("get token for other request")
    public String getToken(){
        Response response = SerenityRest.lastResponse();
        String token = response.body().path("token");
        System.out.println(token);
        return token;
    }


    @Step("I request invalid generate Token")
    public void requestInvalidGenerateToken(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "SouthKorean988");
        requestData.put("password", "south*");

        SerenityRest.given().header("Content-Type", "application/json").body(requestData.toJSONString());
        SerenityRest.when().post(setPostEndpoint());
    }
}
