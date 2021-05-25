package com.cybertek.tests.day6_testng_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class PO_CheckBoxPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Practice from selenium task , day 5

        driver.get(" http://practice.cybertekschool.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        if (!checkbox1.isSelected()) {
            System.out.println("Checkbox 1 is not selected. Verification Passed!");
        } else {
            System.out.println("Checkbox 2 is  selected. Verification Failed!");
        }

        if (checkbox2.isSelected()) {
            System.out.println("Checkbox 2 is  selected. Verification Passed!");
        } else {
            System.out.println("Checkbox 2 is not selected. Verification Failed!");
        }
        Thread.sleep(2000);
        checkbox1.click();
        Thread.sleep(2000);
        checkbox2.click();

        if (checkbox1.isSelected()) {
            System.out.println("Checkbox 1 is  selected. Verification Passed!");
        } else {
            System.out.println("Checkbox 2 is not selected. Verification Failed!");
        }

        if (!checkbox2.isSelected()) {
            System.out.println("Checkbox 2 is not selected. Verification Passed!");
        } else {
            System.out.println("Checkbox 2 is selected. Verification Failed!");
        }
        driver.close();


    }

}
