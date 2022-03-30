package starter.stepdefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class loginSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;


    @Given("i am in the login page")
    public void iAmInTheLoginPage() {
        loginPage.openUrl();
        loginPage.validateIfButtonLoginIsAppear();

    }
    @When("i input valid username")
    public void iInputValidUsername() {
        loginPage.inputUsernameToField("gladysprds");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
            loginPage.inputPasswordToField("1!KinoSu#");
    }

    @And("click login button")
    public void clickLoginButton() {
        loginPage.clickLogin();

    }

    @Then("I go to homepage")
    public void iGoToHomepage() {
        homePage.validateHomePageAppear();
        homePage.headerTextEqual();
    }

    @When("i input wrong username")
    public void iInputWrongUsername() {
        loginPage.wrongUsernameField("yololo");
    }

    @Then("i have error message")
    public void iHaveErrorMessage() {
    loginPage.errorMessageAlert();
    }

    @Then("i input wrong password")
    public void iInputWrongPassword() {
        loginPage.wrongPassword("wrongpass");
    }

    @Then("i input null password")
    public void iInputNullPassword() {
        loginPage.nullPassword("");
    }

    @When("i input null username")
    public void iInputNullUsername() {
        loginPage.nullUsername("");
    }

    @Then("i still in login page")
    public void iStillInLoginPage() {
        loginPage.headerTextLogin();
    }


}
