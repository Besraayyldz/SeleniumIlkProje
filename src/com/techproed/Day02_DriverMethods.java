package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Documents\\Selenium dependencies\\drives\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://google.com");
        webDriver.navigate().to("https://amazon.com");//.get ile ayni islemi yapar

        String sayfaTitle = webDriver.getTitle();
        String sayfaUrl =webDriver.getCurrentUrl();

        System.out.println();//sout+enter =syso
        System.out.println(sayfaTitle);

        System.out.println(sayfaUrl);

        webDriver.quit();
    }
}
