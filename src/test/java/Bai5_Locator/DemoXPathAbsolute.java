package Bai5_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DemoXPathAbsolute {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://rise.anhtester.com");
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div[2]/form/div[1]/input")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div[2]/form/div[2]/input")).sendKeys("123456");
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div[2]/form/button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div/ul/li[2]/a")).click();
        Thread.sleep(4000);

        driver.get("https://ecommerce.anhtester.com");
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/form/div/input")).sendKeys("admin@example.com");
        Thread.sleep(4000);
        driver.quit();
    }
}
