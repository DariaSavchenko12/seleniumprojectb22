package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practice {
    public static void main(String[] args) {
        //  TC #1: Yahoo Title Verification
        WebDriverManager.chromedriver().setup();
        // 2. Go to https://www.yahoo.com
        //  1. Open  Chrome browser

        WebDriver driver = new ChromeDriver();
        //Set up chrome  browser

        // 2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");
        //maximize browser
        driver.manage().window().maximize();


        //  3. Verify title:
        //Expected Yahoo
        String expectedTitle = "Yahoo";

        // actual title
        String actualTitle = driver.getTitle();

        // creating our verification
        if (actualTitle.equals((expectedTitle))) {
            System.out.println("Title is as expected .Verification PASSED!");
        } else {
            System.out.println("Title is  not expected.Verification FAILED!");
        }
        driver.close();

    }
}
