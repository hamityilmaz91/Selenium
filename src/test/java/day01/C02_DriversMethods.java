package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C02_DriversMethods {

    public static void main(String[] args) {

        //   System.setProperty("webdriver.chrome.driver",
        //         "C:\\Users\\hmtyl\\OneDrive\\Belgeler\\selenium dependencies\\drivers\\chromedriver.exe");

        System.setProperty("webdriver.http.factory", "jdk-http-client");

          WebDriver driver =new ChromeDriver();
           driver.get("https://www.google.com");



        WebDriver driver1 =new EdgeDriver();// bos bir browser acer
        driver1.get("https://www.google.com");// gitmek istedigimiz sayfayi belirtiyoruz
        System.out.println(driver1.getTitle());
     System.out.println(driver1.getCurrentUrl());
        //System.out.println(driver1.getPageSource());  Sayfa kaynak kodlarini getirir

driver.manage().timeouts();
        System.out.println(driver1.getWindowHandle());// sayfanin hash degerlerini getirir
        // bu hash degeri ile sayfalar arasi gecis olur
    }



}
