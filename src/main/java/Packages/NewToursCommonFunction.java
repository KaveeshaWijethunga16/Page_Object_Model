package Packages;

import org.openqa.selenium.WebDriver;
import pages.*;

public class NewToursCommonFunction {

    WebDriver driver;
    public NewToursCommonFunction(WebDriver driver) {
        this.driver = driver;
    }

    public String registerUser(String fname, String lname, String email ,String username, String password,String confirmPassword) {

        HomePageUpdate homePage = new HomePageUpdate(driver);
        homePage.selectRegisterMenu();


        RegisterPageUpdate registerPage = new RegisterPageUpdate(driver);
        registerPage.setFirstname_loc(fname);
        registerPage.setLastname_loc(lname);
        registerPage.setEmail_loc(email);
        registerPage.setCountry_loc();
        registerPage.setUsername_loc(username);
        registerPage.setPassword_loc(password);
        registerPage.setConfirmPassword_loc(confirmPassword);
        registerPage.setSubmitbtn_loc();

        RegisterSuccessPageUpdate successTxt = new RegisterSuccessPageUpdate(driver);
        String successText  = successTxt.successText();
        return successText;


    }
}
