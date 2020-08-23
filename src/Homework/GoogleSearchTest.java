package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http:/www.google.com");

        WebElement arama = driver.findElement(By.name("q"));
        arama.sendKeys("City Bike");
        arama.submit();

        WebElement result = driver.findElement(By.id("result-stats"));
        System.out.println(result.getText());

        WebElement shopping = driver.findElement(By.linkText("Shopping"));
        shopping.click();

        WebElement velo = driver.findElement(By.id("srpresultimg_12829272291975038448_1_0"));
        velo.click();







    }
}
