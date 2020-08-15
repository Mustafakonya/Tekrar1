package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http:/google.com");

        driver.get("http:/youtube.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.quit();



    }
}
