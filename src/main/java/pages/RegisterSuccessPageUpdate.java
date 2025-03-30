package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterSuccessPageUpdate {

    WebDriver driver;

    public RegisterSuccessPageUpdate(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By successText_loc = By.xpath("//b[contains(text(),'Dear')]");

    @FindBy(xpath = "//b[contains(text(),'Dear')]")
     public WebElement successText_ele;

    public String successText() {
        return successText_ele.getText();


    }
    @FindBy(linkText = "sign-in")
    public WebElement signInText_ele;

    public  LoginPageUpdated selectSignInMenu() {
        signInText_ele.click();
        return new LoginPageUpdated(driver);
    }
}
