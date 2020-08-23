package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http:/facebook.com/");
        String title =driver.getTitle();
        if (title.equals("facebook")){
            System.out.println("True");
        }else{
            System.out.println("False, the title is " + title);
        }

        String url = driver.getCurrentUrl();
        if (url.contains("facebook")){
            System.out.println("Url facebook iceriyor");
        }else{
            System.out.println("Url facebook icermiyor, dogru Url " + url);
        }

        driver.navigate().to("http:/www.walmart.com");
        String baslik = driver.getTitle();
        if(baslik.contains("Walmart.com")){
            System.out.println("Baslik Walmart.com iceriyor");
        }else{
            System.out.println("Baslik Walmart.com icermiyor, baslik " + baslik);
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();




    }
}
