package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Documents\\Selenium dependencies\\drives\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://youtube.com");
        String youtubeTitle = driver.getTitle();

        if(youtubeTitle.contains("Video")){
            System.out.println("Video kelimesini iceriyor");
        }else{
            System.out.println("Video kelimesi icermiyor");
        }
        driver.quit();








    }
}
