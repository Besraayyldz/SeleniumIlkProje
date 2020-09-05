package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Documents\\Selenium dependencies\\drives\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://facebook.com/");
        driver.findElement(By.name("email")).sendKeys("techproed@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("1234");
        
    }
}
