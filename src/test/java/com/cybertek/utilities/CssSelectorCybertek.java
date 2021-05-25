package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssSelectorCybertek {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));

        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));

        WebElement inputBox = driver.findElement(By.cssSelector("input[name='email']"));

        WebElement retrieveButton = driver.findElement(By.cssSelector("button[id='form_submit']"));

        WebElement powerByText = driver.findElement(By.cssSelector("div[style= 'text-align: center;']"));

        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());

        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());

        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());

        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());

        System.out.println("retrieveButton.isDisplayed() = " + retrieveButton.isDisplayed());

        System.out.println("powerByText.isDisplayed() = " + powerByText.isDisplayed());

        driver.close();


    }
}
