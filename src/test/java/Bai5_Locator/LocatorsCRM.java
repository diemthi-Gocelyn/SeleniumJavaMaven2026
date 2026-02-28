package Bai5_Locator;

public class LocatorsCRM {
    public String url="https://crm.anhtester.com/admin/authentication";

    //Locator for login page
    public static String headerLoginpage = "//h1[normalize-space()='Login']";
    public static String inputEmail ="//input[@id=\"email\"]";
    public static String inputPassword ="//input[@id=\"password\"]";
    public static String buttonLogin="//button[@type=\"submit\" and normalize-space()='Login']";
    public static String checkBoxRememberMe ="//input[@id='remember']";
    public static String labelRememberMe ="//label[@for='remember']";
    public static String linkForgetPassword ="//a[normalize-space()='Forgot Password?']";
    public static String alertInvalidEmailOrPassword="//div[@id='alerts']/div";
    public static String alertRequirePassword ="//div[contains(@class,'alert-danger') and text()='The Password field is required.']";
    public static String alertRequireEmail="//div[contains(@class,'alert-danger') and text()='The Email Address field is required.']";

    public static String dropdownGroup="//button[@data-id=\'groups_in[]\']";
    public static String inputSearchCustomer ="//button[@data-id='groups_in[]']/following-sibling::div//input";
    public static String dropdownLangugage ="//button[@data-id='default_language']/child::div[contains(normalize-space(),'System Default')]";
    //trang dashboard
    public static String menuDashboard="//ul[@id='side-menu']/descendant::span[normalize-space()='Dashboard']";
    //Trang Customer
    public static String menuCustomer = "//ul[@id='side-menu']/descendant::span[normalize-space()='Customers']";
    public static String headerCustomerPage="//span[normalize-space()='Customers Summary']";
    public static String totalCustomers="//span[normalize-space()='Total Customers']/preceding-sibling::span";
    public static String labelTotalCustomers="//span[normalize-space()='Total Customers']";
    public static String ActiveCustomers="//span[normalize-space()='Active Customers']/preceding-sibling::span";
    public static String labelActiveCustomers="//span[normalize-space()='Active Customers']";
    public static String InactiveCustomers="//span[normalize-space()='Inactive Customers']/preceding-sibling::span";
    public static String labelInactiveCustomers="//span[normalize-space()='Inactive Customers']";
    public static String ActiveContacts="//span[normalize-space()='Active Contacts']/preceding-sibling::span";
    public static String labelActiveContacts="//span[normalize-space()='Active Contacts']";
    public static String InactiveContacts="//span[normalize-space()='Inactive Contacts']/preceding-sibling::span";
    public static String labelInactiveContacts="//span[normalize-space()='Inactive Contacts']";
    public static String contactsLoggedInToday="//span[normalize-space()='Contacts Logged In Today']/preceding-sibling::span";
    public static String labelContactsLoggedInToday="//span[normalize-space()='Contacts Logged In Today']";
    








}
