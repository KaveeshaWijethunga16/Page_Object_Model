package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUpdated {

    WebDriver driver;

    public LoginPageUpdated(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "userName")
    public WebElement username_ele;
    @FindBy(name = "password")
    public WebElement password_ele;
    @FindBy(name = "submit")
    public WebElement submitBtn_ele;




    public LoginPageUpdated setUsername_loc(String username) {
        username_ele.sendKeys(username);
        return this;
    }

    public LoginPageUpdated setPassword_loc(String password) {
        password_ele.sendKeys(password);
        return this;
    }

    public RegisterLoginSuccessPageUpdate setSubmit_loc() {
       submitBtn_ele.click();
        return new RegisterLoginSuccessPageUpdate(driver);

    }


}
