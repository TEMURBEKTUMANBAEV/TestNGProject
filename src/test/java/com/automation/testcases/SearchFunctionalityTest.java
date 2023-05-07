package com.automation.testcases;

import org.testng.annotations.*;

public class SearchFunctionalityTest extends BaseTest {
    @Test(groups = "SmokeTest")
    public void verifySearchResultsAreDisplayed(){

        System.out.println("verify search result");
    }
    @Test(groups = "AidaiTest")
    public void verifyMessageWhenThereAreNoResult() {

        System.out.println("verify no result message");
    }
    @Test(groups = "AidaiTest")
    public void verifySearchResultHasSearchKeyword() {
        System.out.println("verify search result has search keyword");
    }
}
