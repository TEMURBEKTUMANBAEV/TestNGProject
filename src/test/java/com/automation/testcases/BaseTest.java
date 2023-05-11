package com.automation.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setUp() throws MalformedURLException {
        String platform = "Cloud";


        if (platform.equals("Cloud")){
          getCloudDriver();
        } else {
         getLocalDriver();
        }

        driver.get("https://www.google.com");

    }

    public void getCloudDriver() throws MalformedURLException {
        String URL = "https://" + "bsuser_afZwLM" + ":" + "1NrSe6BCTjyzTPxA9asG" + "@hub-cloud.browserstack.com/wd/hub";
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        URL url = new URL(URL);
        driver = new RemoteWebDriver(url, browserOptions);
    }

    public void getLocalDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }




    @AfterMethod
    public void cleanUp(){
        System.out.println("Close browser");
        driver.quit();
    }
}
