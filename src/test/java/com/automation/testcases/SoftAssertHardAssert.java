package com.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssertHardAssert {
    
    @Test
    public void testSoftAssert(){

    }
    @Test
    public void testHardAssert(){
        Assert.assertEquals(2,2);
        Assert.assertEquals("Chirag","Chirag");
        Assert.assertEquals(10,10);
        Assert.assertEquals("Test","Test");
        Assert.assertEquals("Devx","Devx");
        Assert.assertEquals(true,true);
        System.out.println("Hard Assert Test Ends");
    }
}
