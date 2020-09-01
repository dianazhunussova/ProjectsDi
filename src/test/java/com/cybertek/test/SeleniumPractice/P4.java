package com.cybertek.test.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        String actualText=driver.findElement(By.linkText("Create a Page")).getAttribute("href");
        String expectedText="registration_form";


        if (actualText.contains(expectedText)) {
            System.out.println("PASSED!!");
        } else {
            System.out.println("FAILED!");


        }
    }
}