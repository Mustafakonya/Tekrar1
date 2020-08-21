package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_Ec {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

            driver.get("http:/amazon.com");
            WebElement arama = driver.findElement(By.id("twotabsearchtextbox"));
            arama.sendKeys("babywippe");
            arama.submit();

            WebElement sec = driver.findElement(By.linkText("Gift Cards"));
            sec.click();
            driver.quit();







    }
}
