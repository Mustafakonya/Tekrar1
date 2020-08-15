package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http:/google.com");

        driver.get("http:/amazon.com");

        String title = driver.getTitle();

        String url = driver.getCurrentUrl();

        System.out.println(title);
        System.out.println(url);







    }
}
