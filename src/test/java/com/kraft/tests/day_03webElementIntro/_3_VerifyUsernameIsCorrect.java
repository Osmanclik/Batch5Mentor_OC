package com.kraft.tests.day_03webElementIntro;

import com.kraft.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _3_VerifyUsernameIsCorrect {
    /**
     * Task
     * open chrome browser
     * go to "https://demoqa.com/login"
     * enter "test" into the username box
     * VERIFY that "test" is displayed in the username box
     * enter "Test.!123" into the password box
     * click on login button
     * VERIFY that username is "test"
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/login");
        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("test");

        //lazy way
        driver.findElement(By.id("password")).sendKeys("Test.!123");

        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(2000);

        String actualUsername = driver.findElement(By.id("userName-value")).getText();
        String expectedUserName="test";

        if (actualUsername.equals(expectedUserName)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }

        driver.quit();
    }
}
