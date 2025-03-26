package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class TC02_LoginUserTest {

    WebDriver driver;

    @BeforeMethod
    public void OpenLinkTestPage() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/newtours/index.php");

    }

    @Test
    public void TC02() {
        HomePage homePage = new HomePage(driver);
        homePage.selectRegisterMenu();


        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.setFirstname_loc("Hareen");
        registerPage.setLastname_loc("Wijethunga");
        registerPage.setEmail_loc("wijethunga@gmail.com");
        registerPage.setCountry_loc();
        registerPage.setUsername_loc("Hareen");
        registerPage.setPassword_loc("111");
        registerPage.setConfirmPassword_loc("111");
        registerPage.setSubmitbtn_loc();

        RegisterSuccessPage successTxt = new RegisterSuccessPage(driver);
        String actualText = successTxt.successText();
        Assert.assertTrue(actualText.contains("Dear"), "Registration attempt failed");

        RegisterSuccessPage signInTxt = new RegisterSuccessPage(driver);
        signInTxt.selectSignInMenu();


        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername_loc("Hareen");
        loginPage.setPassword_loc("111");
        loginPage.setSubmit_loc();

        RegisterLoginSuccessPage successText = new RegisterLoginSuccessPage(driver);
        String actualSuccessTxt = successText.LoginSuccessText();
        Assert.assertTrue(actualSuccessTxt.contains("Thank you"), "Login attempt failed");


    }

    public void closeBrowser() {
        driver.quit();
    }


}