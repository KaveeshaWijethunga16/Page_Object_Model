package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {


    WebDriver driver;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }




    By firstname_loc = By.xpath("//input[@name='firstName']");
    By lastname_loc  =  By.xpath("//input[@name='lastName']");
    By phone_loc  =By.xpath("//input[@name='phone']");
    By username_loc =By.xpath("//input[@id='userName']");
    By country_loc = By.xpath("//select[@name='country']");
    By email_loc = By.xpath("//input[@id='email']");
    By password_loc =By.name("password");
    By confrimPassword_loc = By.name("confirmPassword");
    By submitbtn_loc = By.xpath("//input[@name='submit']");


    public void setFirstname_loc(String firstname) {
        driver.findElement(firstname_loc).sendKeys(firstname);
    }

    public void setLastname_loc(String lastname) {
        driver.findElement(lastname_loc).sendKeys(lastname);
    }

    public void setPhone_loc(String phone) {
        driver.findElement(phone_loc).sendKeys(phone);
    }
     public void setUsername_loc(String username) {
        driver.findElement(username_loc).sendKeys(username);
     }

     public void setCountry_loc(String country) {
         WebElement countrySelect_element = driver.findElement(country_loc);
         Select dropDownCountrySelect = new Select(countrySelect_element);
         dropDownCountrySelect.selectByVisibleText(country);
     }

     public void setEmail_loc(String email) {
        driver.findElement(email_loc).sendKeys(email);
     }

     public void setPassword_loc(String password) {
        driver.findElement(password_loc).sendKeys(password);
     }
     public void setConfirmPassword_loc(String password) {
        driver.findElement(confrimPassword_loc).sendKeys(password);
     }
     public void setSubmitbtn_loc() {
        driver.findElement(submitbtn_loc).click();
     }
}
