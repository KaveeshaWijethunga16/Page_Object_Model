package testcase;

import Packages.NewToursCommonFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class TC01_RegisterUserTestUpdate {

    WebDriver driver;

    @BeforeMethod
    public void OpenLinkTestPage() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/newtours/index.php");

    }
    @Test
    public void TC01() {

//        NewToursCommonFunction newToursCommonFunction = new NewToursCommonFunction(driver);
//        String actualText = newToursCommonFunction.registerUser("kaveesha","Wijethunga","kavee@gmail.com","kaveesha","111","111");
//        Assert.assertTrue(actualText.contains("Dear"), "Registration attempt failed");



        //method chaining

        HomePageUpdate homePage = new HomePageUpdate(driver);
        String actualText =  homePage.selectRegisterMenu()
                .setFirstname_loc("Hareen")
                .setLastname_loc("Wijethunga")
                .setEmail_loc("wijethunga@gmail.com")
                .setCountry_loc()
                .setUsername_loc("Hareen")
                .setPassword_loc("111")
                .setConfirmPassword_loc("111")
                .setSubmitbtn_loc()
                .successText();



        Assert.assertTrue(actualText.contains("Dear"), "Registration attempt failed");


    }


@AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

}
