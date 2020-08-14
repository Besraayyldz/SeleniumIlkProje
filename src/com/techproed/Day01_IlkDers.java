package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {
        //Java projemize, chrome driver'i tanittik.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Documents\\Selenium dependencies\\drives\\chromedriver.exe");
        //seleneum ile ilgili ilk kodumuz
        //webDriver nesnesi olusturarak, chrome driverikullanabilir hale getirdik
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://google.com");//drive'mize google.com'a gitmesini soyledik

        webDriver.close();//driver'inizla acik olan pencereyi kapatir

        webDriver.quit();//driver'imizi kompe kapatiyor.

    }


}
