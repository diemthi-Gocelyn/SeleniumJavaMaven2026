package Bai7_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleNewWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://cms.anhtester.com");
        Thread.sleep(1000);
        driver.switchTo().newWindow(WindowType.TAB );
        Thread.sleep(1000);
        //driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("http://google.com");
        Thread.sleep(2000);
        driver.quit();

    }
}
