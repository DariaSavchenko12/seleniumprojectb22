package com.cybertek.tests.day3_reviews_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAPageLink {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");

       // Verify create a page" link href value contains text:

        // Locating the " Create a page" link
        WebElement createAPageLink = driver.findElement(By.linkText("Create a Page"));
        //Expected " registration form"

        String expectedInHref = "registration_form";
        String actualInHref = createAPageLink.getAttribute("href");
        System.out.println("actualInhref" + actualInHref);

        if(actualInHref.contains(expectedInHref)){
            System.out.println("Href verification is PASSEd");
        }else{
            System.out.println("Href verification is FAILED");
        }
    }

}
