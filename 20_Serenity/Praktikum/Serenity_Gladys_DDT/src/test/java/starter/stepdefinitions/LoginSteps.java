package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;
    @Steps
    HomePage homePage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openUrl();
        loginPage.validateIfButtonLoginIsAppear();
    }

    @When("I input {string} username")
    public void iInputUsername(String username) {
        loginPage.inputUsernameToField(username);
    }

    @And("I input {string} password")
    public void iInputPassword(String password) {
        loginPage.inputPasswordToField(password);
    }

    @And("click login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("I get the {string}")
    public void iGetThe(String result) {
        if(result.equals("home page")){
            homePage.validateHomePageAppear();
            homePage.headerTextEqual();
        } else {
            loginPage.errorMessageAlert();
            loginPage.headerTextLogin();
        }
    }


}
