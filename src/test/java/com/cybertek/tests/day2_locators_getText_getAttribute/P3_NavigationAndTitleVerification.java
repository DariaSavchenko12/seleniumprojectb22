package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        // driver.findElement(By.LinkText("Gmail")).click();

        driver.findElement(By.partialLinkText("mail")).click();
        String expextedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expextedTitle)) {
            System.out.println("Title verification PASSED");


        } else {
            System.out.println("Title verification FAILED");
        }
        driver.navigate().back();
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();
        if (actualGoogleTitle.contains(expectedGoogleTitle)) {
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");


        }



        Thread.sleep(3000);
        driver.close();


    }
}
