package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Post;
import starter.user.Get;


public class stepdefinition {


    @Steps
    Post post;

    @Steps
    Get get;

    @Given("I set an endpoint to create user")
    public void iSetAnEndpointToCreateUser() {
        post.setPostEndpoint();
    }

    @When("I request POST create user")
    public void iRequestPOSTCreateUser() {
        post.requestPostCreateUser();
    }

    @Then("I validate the status code is {int}")
    public void iValidateTheStatusCodeIs(int arg0) {
        get.validateStatusCode(201);
    }


    @And("I validate the data that just created")
    public void iValidateTheDataThatJustCreated() {
            post.validateDataJustCreated();
    }
}
