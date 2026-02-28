package Bai6_WebElement;

import Bai5_Locator.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_GetText_GettagName {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        //Nhập email
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        //get Attribule value của input email
        String getAttributeValueInputEmail=driver.findElement(By.xpath(LocatorsCRM.inputEmail)).getAttribute("value");
        System.out.println("Giá trị của input email là: "+getAttributeValueInputEmail);
        //Nhập password
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        //Dung submit để login
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).submit();
        //Get text của menu Dashboard
        String getTextMenuDashboard = driver.findElement(By.xpath(LocatorsCRM.menuDashboard)).getText();
        System.out.println("Text của menu Dashboard là: "+getTextMenuDashboard);
        //Get text của menu Customer
        String getTextMenuCustomer = driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).getText();
        System.out.println("Text của menu Customer là: "+getTextMenuCustomer);
        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();
        String getTextHeaderCustomerPage = driver.findElement(By.xpath(LocatorsCRM.headerCustomerPage)).getText();
        System.out.println("Text của header Customer Page là: "+getTextHeaderCustomerPage);
        if (getTextHeaderCustomerPage.equals("Customers Summary")){
            System.out.println("header Customer Page hiển thị đúng");
        }
        String getTextTotalCustomers = driver.findElement(By.xpath(LocatorsCRM.totalCustomers)).getText();
        if (getTextTotalCustomers.equals("131")){
            System.out.println("Số lượng khách hàng hiển thị đúng");
        }
        //get tag name của menu Dashboard
        String getTagNameMenuDashboard = driver.findElement(By.xpath(LocatorsCRM.menuDashboard)).getTagName();
        System.out.println("Tag name của menu Dashboard là: "+getTagNameMenuDashboard);
        // get Css value của menu Dashboard
        String getCssValueMenuDashboard = driver.findElement(By.xpath(LocatorsCRM.menuDashboard)).getCssValue("color");
        String getCssfontMenuDashboard = driver.findElement(By.xpath(LocatorsCRM.menuDashboard)).getCssValue("font-family");
        System.out.println("Color của menu Dashboard là: "+getCssValueMenuDashboard + " và font-family của menu Dashboard là: "+getCssfontMenuDashboard);





        Thread.sleep(2000);
        driver.quit();
    }
}
