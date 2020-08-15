package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http:/amazon.com");

        String title = driver.getTitle();

        if(title.toLowerCase().contains("Car")){
            System.out.println("Car kelimesi geciyor");
        }else{
            System.out.println("Car kelimesi gecmiyor");
        }



        driver.quit();





    }
}
