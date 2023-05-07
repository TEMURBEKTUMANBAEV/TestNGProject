package com.automation.testcases;

import org.testng.annotations.*;

public class LoginTest extends BaseTest{

    @Test(groups = {"SmokeTest", "ChiragTest"})
    public void verifyUserCanLogin() {

        System.out.println("verify login successful");
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
