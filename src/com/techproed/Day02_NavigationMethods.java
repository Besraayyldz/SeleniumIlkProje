package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {

        //driveri miza yavayi tanittik
        System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Documents\\Selenium dependencies\\drives\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();//driveri acar

        webDriver.manage().window().maximize();//ekrani tam ekran yapar
        webDriver.get("https://google.com");//tanimlanan sayfaya gider

        webDriver.navigate().to("https://amazon.com");//tanimlanan sayfata gider

        //s: string manasina geliyor.
        //yukardaki iki komut ayni anlama geliyor.

        webDriver.navigate().back();//.navigate().back() onceki sayfaya geri dinme islemini gerceklestirir

        // navigate().forward() methodu geri geldiğimiz sayfaya gitmemizi sağlıyor
        // örnek : google -> amazona gittik -> amazondan google'a geri geldik
        // eğer forward yaparsak, amazona geri gideriz.
        webDriver.navigate().forward();//ileri butonu

        webDriver.navigate().refresh();//sayfayi yenilemeye yariyor









    }

}
