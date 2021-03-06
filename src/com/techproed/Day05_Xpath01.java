package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day05_Xpath01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Documents\\Selenium dependencies\\drives\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        //xpath kullanimi: input[@type='email']
        WebElement emailKutusu = driver.findElement(By.xpath("//input[@type='email']"));
        emailKutusu.sendKeys("fjdhvs@gmail.com");
        WebElement sifreKutusu = driver.findElement(By.xpath("//input[@id='session_password']"));
        sifreKutusu.sendKeys("dfgskrmwbt");
        WebElement signInButonu = driver.findElement(By.xpath("//input[@name='commit']"));
        signInButonu.click();

    }
}
