package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C01_Examples {
    /*
       Browser'ı açıp maximize yapın
       Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
       Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
       Amazon sayfasına geri dönün
       Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine eşit olduğunu test edin
       Sayfanın konumunu ve boyutunu yazdırın
       Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın
       İstediğiniz şekilde olup olmadığını test edin
       Sayfayı kapatın
        */
    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        //  WebDriver driver =new ChromeDriver();
        //   driver.get("https://www.google.com");
        WebDriver driver =new ChromeDriver();

//         Browser'ı açıp maximize yapın
        driver.manage().window().maximize();

//         Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//         Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
        driver.get("https://amazon.com");
        driver.get("https://facebook.com");
        driver.get("https://youtube.com");

//         Amazon sayfasına geri dönün
        driver.navigate().back();
        driver.navigate().back();

//         Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine eşit olduğunu test edin
        String actualUrl = driver.getCurrentUrl();//Asıl URL
        String expectedUrl = "https://www.amazon.com/";//Beklenen URL

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Url Testi PASSED");
        } else {
            System.out.println("Url Testi FAILED");
        }

//         Sayfanın konumunu ve boyutunu yazdırın
//         Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın
//         İstediğiniz şekilde olup olmadığını test edin
//         Sayfayı kapatın

        driver.manage().window().getPosition();
        driver.manage().window().getSize();


    }
}