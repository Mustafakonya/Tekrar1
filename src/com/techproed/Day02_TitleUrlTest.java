package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http:/youtube.com");
        String title = driver.getTitle();
        if (title.contains("video")) {
            System.out.println("Video kelimesi geciyor");
        }else{
            System.out.println("Video kelimesi gecmiyor");
        }

        driver.quit();


    }
}
