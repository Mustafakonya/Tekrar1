package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Day02_DriverOdev {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http:/google.com");

        String title = driver.getTitle();
        System.out.println(title);

        driver.get("http:/youtube.com");
        String title2 = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title2);
        System.out.println(url);

        driver.navigate().back();
        String url2 = driver.getCurrentUrl();
        driver.quit();

    }

}
