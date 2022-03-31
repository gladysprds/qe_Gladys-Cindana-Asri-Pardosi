package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    private By booksHeader(){
        return By.xpath("//*[@id=\"userName-label\"]");
    }

    @Step
    public boolean validateHomePageAppear(){
        return $(booksHeader()).isDisplayed();
    }

    @Step
    public boolean headerTextEqual(){
        return $(booksHeader()).getText().equals("Books");
    }

}
