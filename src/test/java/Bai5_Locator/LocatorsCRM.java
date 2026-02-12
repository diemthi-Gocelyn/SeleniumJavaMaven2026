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








}
