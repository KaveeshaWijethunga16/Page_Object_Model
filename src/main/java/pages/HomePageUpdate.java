package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageUpdate {

    WebDriver driver;

    public HomePageUpdate(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //1st way
//   @FindBy(how = How.LINK_TEXT,using = "REGISTER")
//    public WebElement registerbtn_ele;

    //2nd way

    @FindBy(linkText = "REGISTER")
    public WebElement registerbtn_ele;


    public void selectRegisterMenu(){
        registerbtn_ele.click();
    }

}
