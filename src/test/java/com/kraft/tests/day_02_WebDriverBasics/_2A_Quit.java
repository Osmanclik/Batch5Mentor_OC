package com.kraft.tests.day_02_WebDriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public record _2A_Quit() {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().setPosition(new Point(2000,0));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement clickHere=driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickHere.click();
        Thread.sleep(3000);
        //driver.close(); ilk segmeyi kapatır. çünkü driver onun üzerinde

        driver.quit();
    }
}
