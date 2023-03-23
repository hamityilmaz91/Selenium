package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_05 {
    public static void main(String[] args) {


        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();

        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz

driver.manage().window().maximize();

        System.out.println("max pencere konumu= " + driver.manage().window().getPosition());
        System.out.println("maximize pencere olcusu " + driver.manage().window().getSize());

        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz

driver.manage().window().fullscreen();

        System.out.println("full screen pencere pozisyonu"+driver.manage().window().getPosition());
        System.out.println("full screen pencere olcusu "+driver.manage().window().getSize());
        // sayfayi kapatiniz
        driver.close();


    }
}
