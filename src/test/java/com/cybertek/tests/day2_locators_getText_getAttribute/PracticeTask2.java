package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTask2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        // negative testing is when you enter incorrect data

        //locating the web element using id locator and
        // storing it in WebElement type.
        WebElement inputUserName = driver.findElement(By.id("email"));

        // enter incorrect username
        inputUserName.sendKeys("something1231@gmail.com");

        // locate the web element using
        WebElement inputPassword =  driver.findElement((By.id("pass")));

        inputPassword.sendKeys("some wrong password" + Keys.ENTER);

        // Verify title changed to:
        // expected "Log into Facebook"
         String expectedTitle = "Log into Facebook";

        System.out.println("expectedTitle = " + expectedTitle);

         Thread.sleep(5000);
         String actualTitle = driver.getTitle();
        System.out.println("actualTitle "+ actualTitle);

         if(actualTitle.equals(expectedTitle)){
             System.out.println("Title verification is PASSED!");
         }else{
             System.out.println("Title verification is FAILED!");
         }
         driver.close();
    }
}
