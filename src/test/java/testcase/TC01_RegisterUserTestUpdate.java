package testcase;

import Packages.NewToursCommonFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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

        NewToursCommonFunction newToursCommonFunction = new NewToursCommonFunction(driver);
        String actualText = newToursCommonFunction.registerUser("kaveesha","Wijethunga","kavee@gmail.com","kaveesha","111","111");
        Assert.assertTrue(actualText.contains("Dear"), "Registration attempt failed");



    }



    public void closeBrowser() {
        driver.quit();
    }

}
