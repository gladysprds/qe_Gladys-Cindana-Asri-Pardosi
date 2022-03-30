package starter.pages;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actions.Scroll.to;


public class LoginPage extends PageObject {

    private By usernameField(){

        return By.id("userName");
    }
    private By passwordField(){

        return By.id("password");
    }
    private By loginButton(){
        return By.id("login");
    }

    private By closeAds(){
        return By.xpath("//*[@id=\"close-fixedban\"]");
    }

    private By span(){
        return By.xpath("//div[text() = '© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.']");
    }

    private By errorMessage(){
        return By.id("name");
    }
    private By loginHeader(){
        return By.className("main-header");
    }

    @Step
    public void openUrl(){
        openUrl("https://demoqa.com/login");
    }

    @Step
    public boolean validateIfButtonLoginIsAppear(){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUsernameToField(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputPasswordToField(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLogin(){
        to(span());
        $(closeAds()).click();
        $(loginButton()).click();
    }

    @Step
    public void wrongUsernameField(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void errorMessageAlert(){
        $(errorMessage()).getText().equals("Invalid username or password!");
    }

    @Step
    public void wrongPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void nullPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void nullUsername(String username){
        $(passwordField()).type(username);
    }

    @Step
    public boolean headerTextLogin(){
        return $(loginHeader()).getText().equals("Login");
    }

}
