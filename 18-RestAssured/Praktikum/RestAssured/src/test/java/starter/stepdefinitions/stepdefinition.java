package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;
import starter.user.Get;
import starter.user.Post;
import starter.user.PostGenerateToken;


public class stepdefinition{


    @Steps
    Get get;

    @Steps
    Post post;

    @Steps
    PostGenerateToken postGenerateToken;

    private String userId;


    @Given("I set an endpoint for POST new user")
    public void iSetAnEndpointForPOSTNewUser() {
        post.setPostEndpoint();
    }

    @When("I request POST detail user")
    public void iRequestPOSTDetailUser() {
        post.requestPostDetailUser();
    }

    @Then("I validate the status code is {int}")
    public void iValidateTheStatusCodeIs201(int arg0) {
        get.validateStatusCode(201);
    }

    @And("validate the data detail after create user")
    public void validateTheDataDetailAfterCreateUser() {
        post.validateDataDetail();
    }

    @And("get userId for other request")
    public void getUserIdForOtherRequest() {
        this.userId = post.getUserId();
    }


    @When("I request post detail user with invalid password")
    public void iRequestPostDetailUserWithInvalidPassword() {
                post.requestDetailInvalidPassword();
    }


    @And("I validate the error message")
    public void iValidateTheErrorMessage() {
            post.validateErrorMess();
    }

    @Then("I validate the invalid status code is {int}")
    public void iValidateTheInvalidStatusCodeIs(int arg0) {
        get.validateStatusCode400(400);

    }

    @When("I request POST detail user with existing account")
    public void iRequestPOSTDetailUserWithExistingAccount() {

        post.requestPostDetailUser();
    }

    @Then("I validate the exist status code is {int}")
    public void iValidateTheExistStatusCodeIs(int arg0) {
        get.validateExistingStatusCode406(406);
    }

    @And("I validate the exist message")
    public void iValidateTheExistMessage() {
        post.validateExistMessage();
    }

    @Given("I set an endpoint for POST generate token")
    public void iSetAnEndpointForPOSTGenerateToken() {
        get.setAnEndpointForGet(this.userId);
    }

    @When("I request POST generate token")
    public void iRequestPOSTGenerateToken() {
            postGenerateToken.requestPostGenerateToken();
    }

    @Then("I validate the status code generate token is {int}")
    public void iValidateTheStatusCodeGenerateTokenIs(int arg0) {
        get.validateStatusCode(200);
    }


    @And("validate the data detail after generate token")
    public void validateTheDataDetailAfterGenerateToken() {
        postGenerateToken.validateDataDetailGenerateToken();
    }

    @And("get token for other request")
    public void getTokenForOtherRequest() {
        postGenerateToken.getToken();
    }


    @Given("I set an endpoint for GET detail user")
    public void iSetAnEndpointForGETDetailUser() {
            get.setAnEndpointForGet(this.userId);
    }

    @When("I request GET detail user")
    public void iRequestGETDetailUser() {
        get.requestGetDetailUser(this.userId, postGenerateToken.getToken());
    }

    @And("validate the data detail")
    public void validateTheDataDetail() {
        get.validateDataDetail(this.userId);
    }



    @When("I request invalid generate Token")
    public void iRequestInvalidGenerateToken() {
        postGenerateToken.requestInvalidGenerateToken();
    }

    @Then("I validate the status code invalid generate Token is {int}")
    public void iValidateTheStatusCodeInvalidGenerateTokenIs(int arg0) {
        get.validateStatusCode(200);
    }

    @And("validate the data detail invalid token after generate")
    public void validateTheDataDetailInvalidTokenAfterGenerate() {
        get.validateInvalidGenerateToken();
    }


}