package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskTwoFacebook {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.get("http://www.facebook.com");
        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("3474662522");
        WebElement inputPassword = driver.findElement(By.cssSelector("input[type='password']"));
        inputPassword.sendKeys("dariaQW1206");
        WebElement inputButton = driver.findElement(By.cssSelector("input[type='password']"));
        inputButton.click();
        // verify Title
        String expectedTitle = "Facebook";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification is PASSED!");
        } else {
            System.out.println("Title verification is FAILED!");
        }

    }

}
