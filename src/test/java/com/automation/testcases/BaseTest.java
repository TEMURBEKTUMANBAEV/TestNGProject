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

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");

    }

    public void getCloudDriver() throws MalformedURLException {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, String> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "selenium-build-G3TT5");
        sauceOptions.put("name", "Chrome Browser Parallel Execution");
        browserOptions.setCapability("sauce:options", sauceOptions);
        URL url = new URL("https://oauth-seleniumtraining2015-e9cee:*****f698@ondemand.eu-central-1.saucelabs.com:443/wd/hub")
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
    }
    @AfterMethod
    public void cleanUp(){
        System.out.println("Close browser");
        driver.quit();
    }
}
