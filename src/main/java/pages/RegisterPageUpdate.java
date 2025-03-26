package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageUpdate {


    WebDriver driver;
    public RegisterPageUpdate(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }






    @FindBy(name = "firstName")
            public WebElement firstname_ele;

    @FindBy(xpath = "//input[@name='lastName']")
            public WebElement lastname_ele;

    @FindBy(xpath = "//input[@id='userName']")
            public WebElement email_ele;

    @FindBy(xpath = "//select[@name='country']")
            public WebElement country_ele;

    @FindBy(xpath = "//input[@id='email']")
            public WebElement username_ele;
    @FindBy(name = "password")
     public WebElement password_ele;

    @FindBy(xpath = "//input[@name='confirmPassword']")
            public WebElement confirm_password_ele;

    @FindBy(xpath = "//input[@name='submit']")
            public WebElement submit_ele;



    public void setFirstname_loc(String firstname) {

        firstname_ele.sendKeys(firstname);
    }

    public void setLastname_loc(String lastname) {
        lastname_ele.sendKeys(lastname);
    }

    public void setEmail_loc(String email) {
        email_ele.sendKeys(email);
    }


     public void setCountry_loc() {

         Select dropDownCountrySelect = new Select(country_ele);
         dropDownCountrySelect.selectByIndex(2);
     }

    public void setUsername_loc(String username) {

        username_ele.sendKeys(username);
    }
     public void setPassword_loc(String password) {

        password_ele.sendKeys(password);
     }
     public void setConfirmPassword_loc(String password) {

        confirm_password_ele.sendKeys(password);
     }
     public void setSubmitbtn_loc() {

        submit_ele.click();
     }
}
