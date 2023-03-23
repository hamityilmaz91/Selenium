package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class pracrice_07 {
    public static void main(String[] args) {

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();


        // https://www.amazon.com/ adresine gidin

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");

        // arama motorunda nutella yazip aratınız
        //bunun icin once arama motorunu locate etmemiz lazim
        WebElement arama_motoru = driver.findElement(By.id("twotabsearchtextbox"));
        arama_motoru.sendKeys("nutella"+ Keys.ENTER);
      //  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nutella"+Keys.ENTER);

        // sayfada kac tane link oldugunu bulunuz

            List<WebElement> linklerlistesi =driver.findElements(By.tagName("a"));
        System.out.println(linklerlistesi.size());




        // linkleri yazdiriniz




        // pencereyi kapatiniz


    }
}
