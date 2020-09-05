package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Documents\\Selenium dependencies\\drives\\chromedriver.exe");
        //Java projemize, chrome driver'i tanittik.

        WebDriver webDriver = new ChromeDriver(); //webDriver nesnesi olusturarak, chrome driverikullanabilir hale getirdik

        webDriver.get("http://google.com");//drive'mize google.com'a gitmesini soyledik

        webDriver.close();//driver'inizla acik olan pencereyi kapatir

        webDriver.quit();//driver'imizi kompe kapatiyor.

    }


}
