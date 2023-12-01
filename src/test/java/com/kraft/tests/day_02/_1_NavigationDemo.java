package com.kraft.tests.day_02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_NavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        /**
         * set up a firefox(chrome) driver
         * navigate to https://www.facebook.com/
         * then navigate to https://testrelic.com/
         * then navigate back
         * then navigate forward
         * then refresh page
         * then close driver
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        //driverı ikinci ekrana gönderme
        driver.manage().window().setPosition(new Point(2000,0)); //açılan driverı ikinci ekrana doğru kaydırır

        Dimension size = driver.manage().window().getSize();
        System.out.println(size);

        driver.manage().window().setSize(new Dimension(1250,999));
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().to("https://testrelic.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();
    }
}
