package com.cybertek.tests.day3_reviews_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");

        // verifi header text is as expected:
        WebElement header = driver.findElement(By.className("_8eso"));
        // short cut for auto-generated varible type
        // alt + ENTER  ->>> WINDOWS
        // option + ENTER ->>>> MAC



        //Expected: " Connect ......
        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = header.getText();

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Header verification is PASSED!");
        }else{
            System.out.println("Header  verification is FAILED!");

        }


    }
}
