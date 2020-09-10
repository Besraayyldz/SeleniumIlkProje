package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day04_GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Documents\\Selenium dependencies\\drives\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://google.com");
        WebElement google = driver.findElement(By.name("q"));
        google.click();
        google.sendKeys("city bike");
        google.submit();
        WebElement listele = driver.findElement(By.id("gsr"));
        System.out.println(listele.getText());
        WebElement shopping = driver.findElement(By.name("q"));
        shopping.click();




    }
}
