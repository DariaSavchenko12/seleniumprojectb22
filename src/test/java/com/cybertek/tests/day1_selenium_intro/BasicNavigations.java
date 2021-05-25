package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1 - setup the browser driver

        WebDriverManager.chromedriver().setup();

        // 2_create instance of selenium web driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().window().fullscreen();


        // 3 get the page
        driver.get("https://www.tesla.com");
        Thread.sleep(3000);


        //.get method();->> this gets the given URL(link) in an already opened browser
        //Going back using navigations
        driver.navigate().back();
        //Going forward using navigations
        Thread.sleep(3000);
        driver.navigate().forward();
        //refreshing the page using navigations
        driver.navigate().refresh();
        // goint to another url using .to() method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current title:" + driver.getTitle());



        System.out.println(driver.getCurrentUrl());
        driver.close();







    }


    }

