package com.automation.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Where do you want to execute your test?");
        String platform = "Local";
        if (platform.equals("Local")){
            driver = getLocalDriver();
        } else {
            driver = getLocalDriver();
        }

        driver.get("https://www.google.com");

    }

    public WebDriver getCloudDriver() throws MalformedURLException {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, String> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "MyBuild");
        sauceOptions.put("name", "Chrome Browser Parallel Execution");
        browserOptions.setCapability("sauce:options", sauceOptions);
        URL url = new URL("https://oauth-temurbektumanbaev638-96a26:2bf0e25f-2a26-40d2-9121-5d707ad2d11c@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
        return driver;
    }

    public WebDriver getLocalDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }




    @AfterMethod
    public void cleanUp(){
        System.out.println("Close browser");
        driver.quit();
    }
}
