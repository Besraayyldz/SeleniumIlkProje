package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class Day04_LocatersGiris {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Documents\\Selenium dependencies\\drives\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("http://a.testaddressbook.com/");

            WebElement signiInLink = driver.findElement(By.id("sign-in"));
            signiInLink.click();
            WebElement emailKutusu = driver.findElement(By.className("form-control"));
            emailKutusu.sendKeys("sdasdca@gmail.com");
            WebElement sifreKutusu = driver.findElement(By.id("session_password"));
            sifreKutusu.sendKeys("adgshnyrt");
            WebElement signInButonu = driver.findElement(By.name("commit"));
            signInButonu.click();







    }
}
