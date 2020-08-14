package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_DriverOdev {
    public static void main(String[] args) {
        // 1- driver'ımızı ekranı kaplayacak şekilde kullanalım.
        // 2- ilk önce google.com'a gidelim.
        // 3- sayfanın title'ını alalım ve ekrana yazdıralım.
        // 4- daha sonra youtube.com'a gidelim.
        // 5- sayfanın title'ını ve url'ini alalım ekrana yazdıralım.
        // 6- google.com'a geri gelelim ve sayfanın url'ini alıp ekrana yazdıralım.
        // 7- driver'ımızı kapatalım.

        System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Documents\\Selenium dependencies\\drives\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        // 1- driver'ımızı ekranı kaplayacak şekilde kullanalım.
        webDriver.manage().window().maximize();

        // 2- ilk önce google.com'a gidelim.
        webDriver.get("https://google.com");

        // 3- sayfanın title'ını alalım ve ekrana yazdıralım.
        String googleTitle = webDriver.getTitle();
        System.out.println(googleTitle);

        // 4- daha sonra youtube.com'a gidelim.
        webDriver.navigate().to("https://youtube.com");

        // 5- sayfanın title'ını ve url'ini alalım ekrana yazdıralım.
        String youtubeTitle = webDriver.getTitle();
        System.out.println(youtubeTitle);
        String youtubeUrl = webDriver.getCurrentUrl();
        System.out.println(youtubeUrl);

        // 6- google.com'a geri gelelim ve sayfanın url'ini alıp ekrana yazdıralım.
        webDriver.navigate().back();
        String sayfaUrl2 = webDriver.getCurrentUrl();
        System.out.println(sayfaUrl2);

        // 7- driver'ımızı kapatalım.
        webDriver.quit();

    }
}
