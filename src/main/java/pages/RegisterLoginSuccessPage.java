package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterLoginSuccessPage {
    WebDriver driver;

    public RegisterLoginSuccessPage(WebDriver driver) {
        this.driver = driver;
    }

    By LoginSuccessTxt_loc = By.xpath("//b[contains(text(),'Thank you')]");

    public String LoginSuccessText() {
        String ThankUtext = driver.findElement(LoginSuccessTxt_loc).getText();
        return ThankUtext;
    }
}
