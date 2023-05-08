package com.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertHardAssert {

    @Test
    public void testSoftAssert(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(2,2);
        softAssert.assertEquals("Chirag","Chriag");
        softAssert.assertEquals(10,10);
        softAssert.assertEquals("Test","Test");
        softAssert.assertEquals("Devx","Devx");
        softAssert.assertEquals(true,true);
        System.out.println("Hard Assert Test Ends");
    }

    @Test
    public void testHardAssert(){
        Assert.assertEquals(2,2);
        Assert.assertEquals("Chirag","Chriag");
        Assert.assertEquals(10,10);
        Assert.assertEquals("Test","Test");
        Assert.assertEquals("Devx","Devx");
        Assert.assertEquals(true,true);
        System.out.println("Hard Assert Test Ends");
    }
}
