package Bai6_WebElement;

import Bai5_Locator.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_isDisplayed_isEnable_isSelected {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        boolean checkHeaderLoginpage = driver.findElement(By.xpath(LocatorsCRM.headerLoginpage)).isDisplayed();
        System.out.println("Check display Header Login: "+checkHeaderLoginpage);
        boolean checCheckboxRemembermeIsSelected=driver.findElement(By.xpath(LocatorsCRM.checkBoxRememberMe)).isSelected();
        System.out.println("Check selected checkbox Remember me: "+checCheckboxRemembermeIsSelected);

        driver.findElement(By.xpath(LocatorsCRM.checkBoxRememberMe)).click();
        boolean checCheckboxRemembermeIsSelectedAfterClick=driver.findElement(By.xpath(LocatorsCRM.checkBoxRememberMe)).isSelected();
        System.out.println("Check selected checkbox Remember me after click: "+checCheckboxRemembermeIsSelectedAfterClick);

        Thread.sleep(1000);
        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");
        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();

        boolean checkButtonSumitIsDisplayed=driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isDisplayed();
        System.out.println("checkButtonSumitIsDisplayed: "+checkButtonSumitIsDisplayed);

        boolean checkButtonSumitEnable=driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("checkEnableButtonSumit: "+checkButtonSumitEnable);
        driver.quit();

    }
}
