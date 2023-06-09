package com.automation.testcases;

import com.ebay.LoginFeatures;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
    LoginFeatures loginFeatures = new LoginFeatures();

    @Test (dataProvider = "invalidData")
    public void verifyLoginUnsuccessfulWithInvalidCredentials(String username, String password, boolean value){

       // Testing the Method with Test Data
       boolean result = loginFeatures.doLogin(username, password);

       // Checking the output
        Assert.assertEquals(result, false);
    }

    @DataProvider (name = "invalidData")
    public  Object[][] getInvalidData(){
        Object[][] credentials = {
                {"admin", "admin@123", false},
                {"admin", "admin123", true},
                {"admin123", "admin123", false},
                {"chirag", "admin123",false},
                {"admin", "@123", false },
                {"devx", "devx@123",false},
                {"", "",false},
                {"", "admin123", false},

        };
        return credentials;
    }


    @Test
    public void verifyLoginSuccessfulWithValidCred(){

    }
}
