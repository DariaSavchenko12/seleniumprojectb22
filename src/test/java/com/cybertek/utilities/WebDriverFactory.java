package com.cybertek.utilities;


// Task: new method creation
// method name : getDriver
//Static method
// accepts String arg: browser type
//  --- this arg will determine what type of browser is opended
//


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType) {

        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();

            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();

            return new FirefoxDriver();


        } else {
            System.out.println("Given browser type does not exist.Driver = null");
            return null;
        }

    }
}





