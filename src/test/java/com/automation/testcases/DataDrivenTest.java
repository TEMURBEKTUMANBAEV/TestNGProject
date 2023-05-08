package com.automation.testcases;

import com.ebay.LoginFeatures;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataDrivenTest {
    LoginFeatures loginFeatures = new LoginFeatures();

    @Test
    public void verifyLoginUnsuccessfulWithInvalidCredentials(){
        // Test Data
       String username = "Chirag", password = "admin@123";

       // Testing the Method with Test Data
       boolean result = loginFeatures.doLogin(username, password);

       // Checking the output
        Assert.assertEquals(result, false);
    }
    @Test
    public void verifyLoginUnsuccessfulWithInvalidCredentials2(){
        // Test Data
        String username = "admin", password = "admin@111";

        // Testing the Method with Test Data
        boolean result = loginFeatures.doLogin(username, password);

        // Checking the output
        Assert.assertEquals(result, false);
    }
    @Test
    public void verifyLoginUnsuccessfulWithInvalidCredentials3(){
        // Test Data
        String username = "Admin", password = "admin@111";

        // Testing the Method with Test Data
        boolean result = loginFeatures.doLogin(username, password);

        // Checking the output
        Assert.assertEquals(result, false);
    }

    @Test
    public void verifyLoginSuccessfulWithValidCred(){

    }
}
