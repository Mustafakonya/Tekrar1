package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day2Review {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http:/youtube.com/");
        String baslik = driver.getTitle();
        if(baslik.equals("Youtube")){
            System.out.println("Dogru");
        }else {
            System.out.println(baslik);
        }

        String url = driver.getCurrentUrl();
        if(url.contains("Youtube")){
            System.out.println("Youtube iceriyor");
        }else {
            System.out.println("Youtube icermiyor dogru Url : " + url);
        }

        driver.navigate().to("http:/amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        String title = driver.getTitle();
        if (title.contains("Amazon")){
            System.out.println("Baslikta Amazon var.");
        }else{
            System.out.println("Baslikta Amazon yok." + title);
        }

        String AmazonUrl = driver.getCurrentUrl();
        if(AmazonUrl.contains("https://www.amazon.com/")){
            System.out.println("Url dogrudur");
        }else{
            System.out.println("Url yanlis. Dogru Url : " + AmazonUrl);
        }

        driver.quit();






    }
}
