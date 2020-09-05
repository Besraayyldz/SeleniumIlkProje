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
        String amazonTitle = driver.getTitle();

        if(amazonTitle.contains("Car")){ //car kelimesi var mi diye bak
            System.out.println("Car kelimesini iceriyor"); //iceriyorsa bunu yaz
        }else{
            System.out.println("Car kelimesi icermiyor"); //icermiyorsa bunu yaz
        }
        driver.quit();


    }
}
