package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
    public static void main(String [] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.id("gbqfbb"));
        String actualText = element.getAttribute("value");
        String expextedText = "I'm Feeling Lucky";
        if(actualText.equals(expextedText)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
            System.out.println("Expected text: "  + expextedText);
            System.out.println("Actual text: " + actualText);
        }
        Thread.sleep(3000);
        driver.close();









    }

}
