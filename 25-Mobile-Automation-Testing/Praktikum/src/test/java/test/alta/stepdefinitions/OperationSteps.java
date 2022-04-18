package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.AddScreen;

public class OperationSteps {
    @Steps
    AddScreen addScreen;


    @Given("I am on calculator page")
    public void onCalculatorPage() {
        addScreen.isOnCaculatorPage();
    }

    @When("I click button 1")
    public void clickButton1() {
        addScreen.clickButton1();
    }

    @And("I click operator add button")
    public void clickOperatorAddButton() {
        addScreen.clickPlusButton();
    }

    @And("I click button 2")
    public void clickButton2() {
        addScreen.clickButton2();
    }

    @Then("I got 3")
    public void got3() {
        addScreen.hasilJumlah();
    }

    @And("I click operator subtract button")
    public void clickOperatorSubtractButton() {
        addScreen.clickSubtractButton();
    }

    @Then("I got -1")
    public void gotMinus() {
        addScreen.hasilKurang();
    }

    @And("I click operator divide button")
    public void clickOperatorDivideButton() {
        addScreen.clickDivideButton();
    }

    @Then("I got 0.5")
    public void gotDivide() {
        addScreen.hasilBagi();
    }

    @And("I click operator multiplication button")
    public void clickOperatorMultiplyButton() {
        addScreen.clickMultiplicationButton();
    }

    @Then("I got 2")
    public void gotMultiply() {
        addScreen.hasilKali();
    }
}
