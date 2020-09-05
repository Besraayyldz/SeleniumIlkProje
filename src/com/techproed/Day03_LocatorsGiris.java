package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class Day03_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Documents\\Selenium dependencies\\drives\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        // bu kod sasyfanin yuklenmesi icin sure verdik 3000 mmilisaniye (3sn) oncesinde yuklenirse beklemeyi birakiyor
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");
//ilk web elementimizi bulacagiz
        String name = "Hamza" ; //
        // web sayfasindaki elementlerin weri tipi   WebElement   tir syi da olsa  metin de olsa hepsi icin gecerli
//webelementimizi id kullanarak bulduk
        WebElement signInLink = driver.findElement(By.id("sign-in"));
        //bu kod la sign elementini bulduk
/*
<a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
 */
        signInLink.click();
//bu kodla sayfaya girip  sign in tusuna  kodla  tiklamis olsuk
        /*
        <input type="email" class="form-control" placeholder="Email" data-test="email"
        name="session[email]" id="session_email">
        simdi bu elementi bulmak icin bu elementin ver tipi nedir // id ile bulacagiz
         */
        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");
        // simdi passwort kutusunu bulacagiz id ile ariyoruz
        /*
        <input class="form-control" placeholder="Password" data-test="password" type="password"
         name="session[password]" id="session_password">
         */
        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
// sifre kutusunun icine parola gonderecegiz
        sifreKutusu.sendKeys("Test1234!");
/*
<input type="submit" name="commit" value="Sign in" class="btn btn-primary"
 data-test="submit" data-disable-with="Sign in">
 */
        // sign in butonunu buluyoruz. // name="commit" (burda id olmadigi icin name ile arama yapacagiz)
        WebElement signInButonu = driver.findElement(By.name("commit"));

        String baslik = driver.getTitle();


        if(baslik.equals("Address Book")){
            System.out.println("Giriş Başarılı.");
        }else{
            System.out.println("Giriş Başarısız.");
        }

        signInButonu.click();


    }
}






