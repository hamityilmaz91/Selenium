package day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_ClassWork {
    public static void main(String[] args) {


        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

/*
   https://www.amazon.com/ sayfasına gidin.
   “city bike” araması yapın
   Arama sonuç metnini yazdırın
   Sonuç sayısını yazdırın
   Sonuc sayısını LAMBDA ile yazdırın
   Çıkan ilk sonucun resmine tıklayın.
   Sayfayı kapatın
*/




//
//            https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");
//
//          “city bike” araması yapın
       WebElement arama_kutusu =driver.findElement(By.id("twotabsearchtextbox"));
       arama_kutusu.sendKeys("city bike"+ Keys.ENTER);

//           Arama sonuç metnini yazdırın
       List<WebElement> arama_sonuc= driver.findElements(By.className("sg-col-inner"));
        System.out.println("arama_sonuc.get(0).getText() = " + arama_sonuc.get(0).getText());
    // list icersinden birinci elemani alarak degerini yazdiriyorum

//          Sonuç sayısını yazdırın
    //    System.out.println("arama_sonuc.getText().split(\" \")[2] = " + arama_sonuc.getText().split(" ")[2]);


//          Sonuc sayısını LAMBDA ile yazdırın

arama_sonuc.stream().skip(2).limit(1).forEach(System.out::println);

//          Çıkan ilk sonucun resmine tıklayın.
//          Sayfayı kapatın
//


    }


}
