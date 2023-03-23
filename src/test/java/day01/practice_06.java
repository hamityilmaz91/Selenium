package day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_06 {

    public static void main(String[] args) {

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();

        // pencere konumunu ve pencere olcusunu yazdiriniz

        System.out.println("baslangic pencere konumu"+driver.manage().window().getPosition());
        System.out.println("baslangic pencere olcusu"+driver.manage().window().getSize());

        // pencere konumunu 20,20 yapiniz, pencere olcusunu 900,600 olarak degistirelim

        driver.manage().window().setPosition(new Point(20,20));
        driver.manage().window().setSize(new Dimension(1900,600));
        // yeni pencere konumunu ve yeni pencere olcusunu yazdiriniz
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());


    }
}
