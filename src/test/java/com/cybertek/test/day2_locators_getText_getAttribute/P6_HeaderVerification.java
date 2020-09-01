package com.cybertek.test.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_HeaderVerification {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");


        String actualText=driver.findElement(By.tagName("h3")).getText();
        String expectedText="Log in to ZeroBank";

        if(actualText.equals(expectedText)){
            System.out.println("Header Verification PASSED!!");
        }else{
            System.out.println("Header Verification FAILED!!");
        }



       // driver.quit();









    }
}
