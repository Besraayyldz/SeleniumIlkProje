package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day04_FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Documents\\Selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        //a tagName'ine sahip tum webelementleri bulalim
        List<WebElement> listem = driver.findElements(By.tagName("a"));





    }
}