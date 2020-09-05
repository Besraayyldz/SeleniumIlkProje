package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Day02_Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Documents\\Selenium dependencies\\drives\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        String facebookTitle = driver.getTitle();
        if (facebookTitle.contains("Facebook")) {
            System.out.println("Tile'da de Facebook var");
        } else {
            System.out.println("Tile'da de Facebook yok");
            System.out.println("Asil baslik: " + " facebook");
        }
        String facebookUrl = driver.getCurrentUrl();
        if (facebookUrl.contains("Facebook")) {
            System.out.println("Url de Facebook var");
        } else {
            System.out.println("Url de Facebook yok");
            System.out.println("Asil baslik: " + "facebook");
        }
        driver.navigate().to("http://Walmart.com");
        String walmartTitle = driver.getTitle();
        if (walmartTitle.contains("walmart")) {
            System.out.println("Title'de walmart var");
        } else {
            System.out.println("Title'da walmart yok");
            System.out.println("Asil baslik: " + "Walmart");
        }
        String walmartUrl = driver.getCurrentUrl();
        if (walmartUrl.contains("Walmart")) {
            System.out.println("Url de Walmart var");
        } else {
            System.out.println("Url de Walmart yok");
            System.out.println("Asil baslik: " + "walmart");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();
    }
}
