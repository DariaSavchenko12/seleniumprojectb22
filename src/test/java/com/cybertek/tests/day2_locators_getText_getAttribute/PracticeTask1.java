package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTask1 {
    public static void main(String[] args) {
        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance and open browser
        WebDriver driver = new ChromeDriver();

        // use the 'driver' object created to use selenium methods
        //maximize window
        driver.manage().window().maximize();

        // go to actual page http://www.facebook.com
        driver.get("http://www.facebook.com");

        //expected title coming rom documentation
        String expectedTitle = "Facebook - Log In or Sign Up";

        // actual title coming from browser
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED!");
        }else{
            System.out.println("Title verification is FAILED!");
        }

    }
}
