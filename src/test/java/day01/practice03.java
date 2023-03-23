package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice03 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();


            //max yapin

        driver.manage().window().maximize();
        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin

        driver.get("https://testpages.herokuapp.com/styled/calculator");


        // ilk kutucuga 20 giriniz
       WebElement ilk_kutucuk= driver.findElement(By.id("number1"));
       ilk_kutucuk.sendKeys("20");
       Thread.sleep(2000);
        // ikinci kutucuga 30 giriniz
        WebElement ikinci_kutucuk=         driver.findElement(By.id("number2"));
        ikinci_kutucuk.sendKeys("30");

        // calculate'e tıklayınız
      WebElement calculate=  driver.findElement(By.id("calculate"));
      calculate.click();
        // sonucu yazdırınız

        WebElement sonuc = driver.findElement(By.id("answer"));
        System.out.println("toplama isleminin sonucu = "+sonuc.getText());

        // sayfayi kapatiniz
        driver.close();


    }//main


}
