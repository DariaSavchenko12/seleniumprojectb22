package com.cybertek.tests.day4_css_selector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebOrderLogin {
    public static void main(String[] args) {
      //  WebDriverManager.chromedriver().setup();
      //  WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle = "Web orders Login";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Login page titte verification is PASSED!");
        } else {
            System.out.println("Login page in title verification  is FAILED!");
        }
        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUsername.sendKeys("Tester");
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys(("test"));

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        String expectedHomePageTitle = "Web Orders";
        String actualHomePageTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Home page title verification is PASSED!");
        } else {
            System.out.println("Home page title verification is FAILED!");
        }


    }

}
