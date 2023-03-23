package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiveceecec {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver= new ChromeDriver();

        // Pencereyi maximize yapiniz

        driver.manage().window().maximize();


        // "https://www.amazon.com/" adresine gidiniz.
        driver.get("https://www.amazon.com/");

        // "https://www.n11.com/" adresine gidiniz.
        driver.get("https://www.n11.com");
        // amazon adresine geri donunuz

        driver.navigate().back();
        // n11 adresine ilerleyiniz

        driver.navigate().forward();
        Thread.sleep(2000);
        // sayfayi yenileyiniz
        driver.navigate().refresh();

        // pencereyi kapat
        driver.close();
        // Konsola "HER ŞEY YOLUNDA" yazdir






    }
}
