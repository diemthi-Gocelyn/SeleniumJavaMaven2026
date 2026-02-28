package Bai6_WebElement;

import Bai5_Locator.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_Submit {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        //Nhập email
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        //Nhập password
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        //Dung submit để login
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).submit();
        Thread.sleep(2000);
        driver.quit();
    }
}
