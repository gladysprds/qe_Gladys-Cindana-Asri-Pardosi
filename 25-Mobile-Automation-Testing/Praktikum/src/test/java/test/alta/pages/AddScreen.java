package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class AddScreen extends BasePageObject {

    private By calculator(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Calculator\"]");
    }
    private By button1 () {
        return MobileBy.xpath("//android.view.View[@content-desc=\"1\"]");
    }

    private By button2 () {
        return MobileBy.xpath("//android.view.View[@content-desc=\"2\"]");
    }

    private By hasilPenjumlahan () {
        return MobileBy.xpath("(//android.view.View[@content-desc=\"3\"])[1]");
    }

    private By addbutton () {
        return MobileBy.xpath("//android.view.View[@content-desc=\" + \"]");
    }
    private By subtractbutton () {
        return MobileBy.xpath("//android.view.View[@content-desc=\" - \"]");
    }
    private By hasilPengurangan () {
        return MobileBy.xpath("//android.view.View[@content-desc=\"-2\"]");
    }
    private By dividebutton () {
        return MobileBy.xpath("//android.view.View[@content-desc=\" ÷ \"]");
    }
    private By hasilPembagian () {
        return MobileBy.xpath("//android.view.View[@content-desc=\"0.5\"]");
    }

    private By multiplicationbutton () {
        return MobileBy.xpath("//android.view.View[@content-desc=\" x \"]");
    }
    private By hasilPerkalian () {
        return MobileBy.xpath("//android.view.View[@content-desc=\" \"]");
    }

    @Step
    public boolean isOnCaculatorPage() {
        return calculator().equals("Calculator");
    }

    @Step
    public void clickButton1(){
        onClick(button1());
    }

    @Step
    public void clickPlusButton(){
        onClick(addbutton());
    }

    @Step
    public void clickButton2(){
        onClick(button2());
    }

    @Step
    public void hasilJumlah(){
        hasilPenjumlahan().equals("3");
    }

    @Step
    public void clickSubtractButton(){
        onClick(subtractbutton());
    }

    @Step
    public void hasilKurang(){
        hasilPengurangan().equals("-2");
    }

    @Step
    public void clickDivideButton(){
        onClick(dividebutton());
    }

    @Step
    public void hasilBagi(){
        hasilPembagian().equals("0.5");
    }

    @Step
    public void clickMultiplicationButton(){
        onClick(multiplicationbutton());
    }

    @Step
    public void hasilKali(){
        hasilPerkalian().equals("2");
    }
}
