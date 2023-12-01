package com.kraft.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.oer.Switch;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    /**
     * write a static method
     * that is named getDriver
     * it takes a string parameter (browserType)
     * it will set up browser
     * it will return a driver based on parameter (chrome, firefox, safari, edge etc..)
     */
    public static WebDriver getDriver(String browserType) {
        WebDriver driver = null;
        switch (browserType.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }
        switch (browserType.toLowerCase()) {
            case "edge":
                WebDriverManager.chromedriver().setup();
                driver = new EdgeDriver();
                break;
        }
        switch (browserType.toLowerCase()) {
            case "firefox":
                WebDriverManager.chromedriver().setup();
                driver = new FirefoxDriver();
                break;
        }
        //driver.manage().window().setPosition(new Point(2000, 0));
        driver.manage().window().maximize();

        return driver;
    }

}
