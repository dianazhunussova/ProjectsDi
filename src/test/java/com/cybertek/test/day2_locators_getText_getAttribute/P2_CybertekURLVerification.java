package com.cybertek.test.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com");

        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(expectedInUrl)){
            System.out.println("URL Verification PASSED!");
        }else{
            System.out.println("URL Verification FAILED!!!");
        }


        if(driver.getTitle().equals("Practice")) {
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAIlED");
        }






    }


}
