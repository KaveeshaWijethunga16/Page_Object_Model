package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    By username_loc =By.name("userName");
    By password_loc =By.name("password");
    By submit_loc =By.name("submit");


    public void setUsername_loc(String username) {
        driver.findElement(username_loc).sendKeys(username);
    }

    public void setPassword_loc(String password) {
        driver.findElement(password_loc).sendKeys(password);
    }

    public void setSubmit_loc() {
        driver.findElement(submit_loc).click();
    }
}
