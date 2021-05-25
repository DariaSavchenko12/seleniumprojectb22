package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2CybertekUrlVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");

        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedInUrl)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        driver.close();
    }
}
