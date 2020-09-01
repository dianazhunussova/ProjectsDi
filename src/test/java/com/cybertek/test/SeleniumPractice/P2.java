package com.cybertek.test.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.findElement(By.id("email")).sendKeys("djdjdjkd@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("passworD123"+ Keys.ENTER);

        Thread.sleep(3000);

        String expectedTitle = "Log into Facebook | Facebook";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED!");
        }

    }
}
