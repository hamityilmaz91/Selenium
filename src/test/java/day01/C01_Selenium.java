package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01_Selenium {
    public static void main(String[] args) {

     //   System.setProperty("webdriver.chrome.driver",
        //        "C:\\Users\\hmtyl\\OneDrive\\Belgeler\\selenium dependencies\\drivers\\chromedriver.exe");

       System.setProperty("webdriver.http.factory", "jdk-http-client");


     //  WebDriver driver =new ChromeDriver();
     //   driver.get("https://www.google.com");
        WebDriver driver1 =new EdgeDriver();
        driver1.get("https://www.google.com");




    }
}
