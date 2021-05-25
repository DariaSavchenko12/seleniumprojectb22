package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        //1 step is: we need to setup chrome driver , in order to
        // use chrome browser
        WebDriverManager.chromedriver().setup();

        // 2 step we need to create an object from chrome driver
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

      //  String url = "http://www.google.com";
    //    String url2 = "http://www.amazon.com";



     //   driver.get(url);
     //   Thread.sleep(3000);
      //  driver.navigate().to(url2);
     //   Thread.sleep(3000);
      //  driver.navigate().back();
     //   Thread.sleep(3000);
     //   driver.navigate().forward();
     //   Thread.sleep(3000);
     //   driver.navigate().refresh();
     //   Thread.sleep(3000);


        driver.get("http://www.amazon.com");
        String title = driver.getTitle();
        System.out.println(title);


        driver.quit();



    }
}
