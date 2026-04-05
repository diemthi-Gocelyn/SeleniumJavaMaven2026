package Bai7_WebDriver;

import Bai5_Locator.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleCookies {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        Cookie cookieValue = driver.manage().getCookieNamed("sp_session");
        Thread.sleep(2000);
        driver.quit();

        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        WebDriver.Timeouts timeouts = driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver2.get("https://crm.anhtester.com/admin/");
        driver2.manage().addCookie(new Cookie(cookieValue.getName(), cookieValue.getValue()));
        driver2.get("https://crm.anhtester.com/admin/");
        driver2.navigate().refresh();
        //driver.manage().addCookie(new Cookie("sp_session","5c1b1e93e277af3c0699e93f549b52a82c0530e9"));
        Thread.sleep(2000);

        driver2.manage().deleteAllCookies();
        driver2.navigate().refresh();
        Thread.sleep(2000);
        driver2.quit();
    }
}
