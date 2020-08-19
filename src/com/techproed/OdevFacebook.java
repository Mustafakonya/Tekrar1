package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OdevFacebook {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http:/facebook.com");
        String face = driver.getTitle();
        if(face.contains("facebook")){
            System.out.println("Iceriyor");
        }else{
            System.out.println(face);
        }
        String url = driver.getCurrentUrl();
        if(url.contains("facebook")){
            System.out.println("Iceriyor");
        }else{
            System.out.println(url);
        }

        driver.navigate().to("http:/walmart.com");
        String url2 = driver.getTitle();
        if (url2.contains("Walmart.com")){
            System.out.println("Iceriyor");
        }else{
            System.out.println(url2);
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();





    }
}
