package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterSuccessPageUpdate;

public class TC02_LoginUserTestUpdated extends TC01_RegisterUserTestUpdate {

    @Test(dependsOnMethods = "TC01")  // Ensure TC01 runs first
    public void TC02_LoginUser() throws InterruptedException {

        // Stay on the success page and click the Sign In button
        RegisterSuccessPageUpdate registerSuccessPageUpdate = new RegisterSuccessPageUpdate(driver);
        Thread.sleep(2000);

        String actualSuccessTxt = registerSuccessPageUpdate.selectSignInMenu()  // Clicks Sign In button
                .setUsername_loc("Kaveesha")
                .setPassword_loc("111")
                .setSubmit_loc()
                .LoginSuccessText();

        Assert.assertTrue(actualSuccessTxt.contains("Thank you"), "Login attempt failed");
    }

    // Do NOT close the browser here
}
