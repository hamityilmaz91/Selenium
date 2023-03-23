package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class Aksam {

    public static void main(String[] args) throws InterruptedException {




        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new EdgeDriver();
        // WebDriver driver2 = new ChromeDriver();
        //  driver2.get("https://www.amazon.com");
        driver.get("https://www.amazon.com");


        driver.navigate().to("https://www.techproeducation.com");
        System.out.println("*****************************");

        System.out.println(driver.getTitle());

        driver.navigate().back();
        System.out.println("*****************************");

        System.out.println(driver.getTitle());

        driver.navigate().forward();

        driver.navigate().refresh();

        System.out.println("********************************");
        Thread.sleep(5000);
        System.out.println(driver.manage().window().getPosition());
        System.out.println();
        System.out.println(driver.manage().window().getSize());
        System.out.println();

        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().maximize();

        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());


    }
}
