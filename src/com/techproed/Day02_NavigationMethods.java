package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");

        WebDriver webdriver = new ChromeDriver();

        webdriver.manage().window().maximize();

        webdriver.get("http:/google.com");

        webdriver.navigate().to("http:/amazon.com");

        webdriver.navigate().back();

        webdriver.navigate().forward();

        webdriver.navigate().refresh();





    }
}
