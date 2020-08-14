package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
    public static void main(String[] args) {

    //1- ilk ondce google.com a gidiniz
    //2- oyden youtube.com a gidiniz
    //3- googel.com'a back methodu ile geri donun
    //4- youtube.com'a geri giniz.(forward methodu ile)
    //5- youtube.com'u yenileyiniz (refresh methodu ile)
    //6- driver'i kapatin quit ile

        System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Documents\\Selenium dependencies\\drives\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
        webDriver.get("https://youtube.com");//webDriver.navigate("https://youtube.com"); olarak da yazilabilir
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.quit();





    }
}
