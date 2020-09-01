package com.cybertek.test.SeleniumPractice;
/*
TC #3: Facebook header verification1.Open Chrome browser
2.Go to https://www.facebook.com3.Verify header text is as expected:
Expected: “Connect with friends and the world around you on Facebook.
 */


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        String actualText=driver.findElement(By.tagName("h2")).getText();
        String expectedText="Connect with friends and the world around you on Facebook.";

        if(actualText.equals(expectedText)){
            System.out.println("Header Verification PASSED!!");
        }else{
            System.out.println("Header Verification FAILED!!");
        }




    }



}
