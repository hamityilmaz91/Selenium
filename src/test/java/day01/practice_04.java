package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_04 {
    public static void main(String[] args) {


        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        // Kaynak Kodlarini konsola yazdiriniz
        String kaynak_kodlari =driver.getPageSource();
        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        System.out.println(kaynak_kodlari.contains("Gateway"));
        // sayfayi kapatiniz
        driver.close();











    }
}
