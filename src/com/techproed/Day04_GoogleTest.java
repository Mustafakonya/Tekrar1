package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http:/google.com");
        WebElement google = driver.findElement(By.name("q"));
        google.sendKeys("City Bike");
        google.submit();

        WebElement sonuc = driver.findElement(By.id("result-stats"));
        System.out.println(sonuc.getText());

        WebElement shopping = driver.findElement(By.partialLinkText("Shopping"));
        shopping.click();
    }
}