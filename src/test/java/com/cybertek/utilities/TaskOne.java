package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TaskOne {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://qa3.vytrack.com/user/login");

        WebElement usernameTextBox = driver.findElement(By.id("prependedInput"));
        usernameTextBox.sendKeys("user7");

        WebElement passwordTextBox = driver.findElement(By.id("prependedInput2"));
        passwordTextBox.sendKeys("UserUser123");

        WebElement loginButton = driver.findElement(By.id("submit"));
        loginButton.click();

        List<WebElement> list = driver.findElements(By.id("user-menu"));
        if(list.size()==0){
            System.out.println("Login failed");
        }else{
            System.out.println("Login is passed");
        }


    }
}
