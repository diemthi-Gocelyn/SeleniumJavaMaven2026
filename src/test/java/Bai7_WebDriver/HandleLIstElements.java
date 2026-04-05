package Bai7_WebDriver;

import Bai5_Locator.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class HandleLIstElements {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();
        // get all elemen
        List<WebElement> listMenu = driver.findElements(By.xpath(LocatorsCRM.listOptionMenu));
        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println(listMenu.get(i).getText());
        }
        System.out.println(listMenu.get(0).getText().equals("Home"));
        System.out.println(listMenu.get(1).getText().equals("Customers"));
        List<WebElement> listWigetDashboard = driver.findElements(By.xpath(LocatorsCRM.listWidgetDashboard));
        for (int j = 0; j < listWigetDashboard.size(); j++) {
            System.out.println(listWigetDashboard.get(j).getText());
        }
        List<WebElement> listOverviewDashboard = driver.findElements(By.xpath(LocatorsCRM.listOverviewDashboard));
        for (int k = 0; k < listOverviewDashboard.size(); k++) {
            System.out.println(listOverviewDashboard.get(k).getText());
            driver.quit();
        }
    }
}
