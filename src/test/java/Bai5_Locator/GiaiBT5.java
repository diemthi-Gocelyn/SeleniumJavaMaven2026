package Bai5_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GiaiBT5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//img[@src=\"https://crm.anhtester.com/uploads/company/59665e5dc7692b2b9c5826eae5a71890.png\"]"));
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id=\"remember\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"remember\"]")).click();
        driver.findElement(By.xpath("//button[@type=\"submit\" and contains(normalize-space(),\"Login\")]")).click();

        driver.findElement(By.xpath("//div[@class=\"hide-menu tw-ml-1\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"hide-menu tw-ml-1\"]")).click();


        driver.findElement(By.xpath("//input[@id=\"search_input\"]")).sendKeys("abc");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id=\"top_search_button\"]/descendant::i")).click();

        driver.findElement(By.xpath("//i[@class=\"fa-regular fa-plus fa-lg\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//i[@class=\"fa-regular fa-plus fa-lg\"]")).click();

        driver.findElement(By.xpath("//li[@class=\"icon header-newsfeed\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//i[@class=\"fa fa-remove fa-lg tw-text-neutral-800\"]")).click();

        driver.findElement(By.xpath("//li[@class=\"icon header-todo\"]")).click();

        driver.findElement(By.xpath("//img[@src='https://crm.anhtester.com/uploads/staff_profile_images/2/small_Cartoon-Avatar-On-Circle-Background.png']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@src='https://crm.anhtester.com/uploads/staff_profile_images/2/small_Cartoon-Avatar-On-Circle-Background.png']")).click();

        //driver.findElement(By.xpath("//a[@id=\"top-timers\"]")).click();
        //driver.findElement(By.xpath("//a[@id=\"top-timers\"]")).click();

       driver.findElement(By.xpath("//ul[@id=\"side-menu\"]/descendant::span[normalize-space()=\"Customers\"]")).click();
        //div[@class='tw-grid tw-grid-cols-2 md:tw-grid-cols-3 lg:tw-grid-cols-6 tw-gap-2']/descendant::span[1]
        //span[text()='Total Customers']/preceding-sibling::span

        //span[text()='Active Customers']/preceding-sibling::span

        driver.findElement(By.xpath("//div[@id=\"clients_length\"]")).click();
        driver.findElement(By.xpath("//div[@id=\"clients_length\"]/descendant::option[text()='25']")).click();

        //div[@class='dt-buttons btn-group']/descendant::span[text()='Export']
        //div[@class='dt-buttons btn-group']/descendant::span[text()='Bulk Actions']
        //button[@class='btn btn-default btn-sm btn-default-dt-options btn-dt-reload']/descendant::i

        //input[@id="mass_select_all"]
        //th[@id="th-number"]

        driver.findElement(By.xpath("//a[@href=\"https://crm.anhtester.com/admin/clients/client\"and normalize-space()='New Customer']")).click();

        driver.findElement(By.xpath("//a[@href=\"#contact_info\" and normalize-space()=\"Customer Details\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"company\"]")).sendKeys("Check01");

        driver.findElement(By.xpath("//input[@id=\"vat\"]")).sendKeys("10%");
        driver.findElement(By.xpath("//input[@id=\"phonenumber\"]")).sendKeys("10%");
        driver.findElement(By.xpath("//input[@id=\"website\"]")).sendKeys("webcheck");
        driver.findElement(By.xpath("//div[@class='input-group-btn']/descendant::i")).click();
        driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Mycheck01");
        driver.findElement(By.xpath("//button[text()=\"Save\"]")).click();
        driver.findElement(By.xpath("//div[@id=\"bs-select-1\"]/descendant::span[text()=\"Mycheck01\"]")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
