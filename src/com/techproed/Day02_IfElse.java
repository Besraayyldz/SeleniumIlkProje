package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Documents\\Selenium dependencies\\drives\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");

        //title de Car varmi yok mu bak (title:baslik)
        //contains -> bir kelimenin bir metin icersinde gecip gecmedigini belirler
        String amazonTitle = driver.getTitle();//car kelimesi var mi diye bak

        if(amazonTitle.contains("Car")){
            System.out.println("Car kelimesini iceriyor");
        }else{
            System.out.println("Car kelimesi icermiyor");
        }
        driver.quit();


    }
}
