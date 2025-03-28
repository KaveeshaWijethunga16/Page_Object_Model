package pages;

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



    public RegisterPageUpdate setFirstname_loc(String firstname) {

        firstname_ele.sendKeys(firstname);
        return this;

    }

    public RegisterPageUpdate setLastname_loc(String lastname) {
        lastname_ele.sendKeys(lastname);
        return this;
    }

    public RegisterPageUpdate setEmail_loc(String email) {
        email_ele.sendKeys(email);
        return this;
    }


     public RegisterPageUpdate setCountry_loc() {

         Select dropDownCountrySelect = new Select(country_ele);
         dropDownCountrySelect.selectByIndex(2);
         return this;
     }

    public RegisterPageUpdate setUsername_loc(String username) {

        username_ele.sendKeys(username);
        return this;
    }
     public RegisterPageUpdate setPassword_loc(String password) {

        password_ele.sendKeys(password);
         return this;
     }
     public RegisterPageUpdate setConfirmPassword_loc(String password) {

        confirm_password_ele.sendKeys(password);
         return this;
     }
     public RegisterSuccessPageUpdate setSubmitbtn_loc() {

        submit_ele.click();
         return new RegisterSuccessPageUpdate(driver);
     }
}
