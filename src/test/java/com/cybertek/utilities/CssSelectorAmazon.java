package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssSelectorAmazon {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("http://www.amazon.com");

        WebElement element = driver.findElement(By.cssSelector("a[id='nav-logo-sprites']"));
        // need to finish at home this one, revew class, cause i didnt understand

    }
}
