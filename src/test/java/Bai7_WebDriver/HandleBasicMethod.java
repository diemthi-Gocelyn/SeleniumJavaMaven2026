package Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleBasicMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(100,100));
        driver.manage().window().setSize(new Dimension(1000,600));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().to("https://cms.anhtester.com/login");
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("admin@example.com");
        //driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).submit();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        String titilePage=driver.getTitle();
        System.out.println("Title của page là: "+titilePage);
        String currentUrl=driver.getCurrentUrl();
        System.out.println("Current Url của page là: "+currentUrl);
        //String currentPageSource=driver.getPageSource();
        //System.out.println("*********************");
        //System.out.println("Page source của page là: "+currentPageSource);
        System.out.println(driver.getPageSource().contains("123456"));

        driver.quit();
    }
}
