package com.kraft.tests.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_WindowMethods {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.krafttechnologie.com/tr/index");
        //driver.manage().window().maximize();
        //driver.manage().window().fullscreen(); //full yapar
        Point position=driver.manage().window().getPosition();  //ekranın koordinatını x,y ekseninde verir.
        System.out.println(position);

        //driverı ikinci ekrana gönderme
        driver.manage().window().setPosition(new Point(2000,0)); //açılan driverı ikinci ekrana doğru kaydırır

        Dimension size = driver.manage().window().getSize();
        System.out.println(size);

        driver.manage().window().setSize(new Dimension(1250,999));

        int width = driver.manage().window().getSize().width;
        int height= driver.manage().window().getSize().height;

        System.out.println("width = " + width);
        System.out.println("height = " + height);
        driver.manage().window().maximize();
    }
}
