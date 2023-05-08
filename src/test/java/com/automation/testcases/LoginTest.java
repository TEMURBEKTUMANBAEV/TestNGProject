package com.automation.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test(groups = {"SmokeTest", "ChiragTest"})
    @Parameters("browser")
    public void verifyUserCanLogin(String browser) {
        System.out.println("verify login successful");
        System.out.println("Opening browser " + browser);
    }

    @Test(groups = {"ChiragTest","WIPTest"})
    public void verifyUserCannotLoginWithInvalidCredentials() {
        System.out.println("verify login unsuccessful for invalid credentials");
    }

    @Test(groups = "SmokeTest")
    public void verifyUserCanResetPassword() {

        System.out.println("verify user can reset password");
    }
}
