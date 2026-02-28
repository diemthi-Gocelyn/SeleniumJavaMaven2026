package Bai6_WebElement;

import Bai5_Locator.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_GetSize_GetLocation {
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
        // lay size login button & location login button
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize().height);
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize().width);
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getLocation().getX());
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getLocation().getY());


        Thread.sleep(2000);
        driver.quit();
    }
}
