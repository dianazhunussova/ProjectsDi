package com.cybertek.test.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankP2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedTitle = "index.html";
        String actualTitle = driver.findElement(By.linkText("Zero Bank")).getAttribute("href");


        if(actualTitle.contains(expectedTitle)){
            System.out.println("PASSED!!");
        }else{
            System.out.println("FAILED!!");
        }




    }
}
