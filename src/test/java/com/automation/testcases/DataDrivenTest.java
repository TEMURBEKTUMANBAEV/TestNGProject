package com.automation.testcases;

import com.ebay.LoginFeatures;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataDrivenTest {
    LoginFeatures loginFeatures = new LoginFeatures();

    @Test
    public void verifyLoginUnsuccessfulWithInvalidCredentials(){
       String username = "Chirag", password = "admin@123";
       boolean result = loginFeatures.doLogin(username, password);
        Assert.assertEquals(result, false);
    }

    @Test
    public void verifyLoginSuccessfulWithValidCred(){

    }
}
