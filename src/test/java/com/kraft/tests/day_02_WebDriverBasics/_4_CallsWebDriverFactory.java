package com.kraft.tests.day_02_WebDriverBasics;

import com.kraft.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class _4_CallsWebDriverFactory {
    public static void main(String[] args) {


    /**
     * set up a chrome driver with WebDriverFactory
     * navigate to https://tr-tr.facebook.com/
     * verify that the url is correct
     */
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.get("https://tr-tr.facebook.com/");

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://tr-tr.facebook.com/";

        if (actualUrl.equals(expectedUrl))
            System.out.println("pass");
        else
            System.out.println("fail");

        driver.close();

}
}