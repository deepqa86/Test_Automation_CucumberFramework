package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LogIn_Page {
    WebDriver driver;
    LogIn_Page page = PageFactory.initElements(driver,LogIn_Page.class);
    //Elemnt Identifier

    @FindBy(xpath="//a[contains(text(),'Sign in')]")
    WebElement btn_Signin;
    @FindBy(xpath="//input[@id='email']")
    WebElement txt_EmailId;
    @FindBy(xpath="//input[@id='passwd']")
    WebElement txt_Password;
    @FindBy(xpath="//button[@id='SubmitLogin']")
    WebElement btn_LogIn;

    //Methods

    private void AppsLaunch()
    {
        //String driverpath=System.setProperty("webdriver.chrome.driver","C:\\Users\\DEEPAKUM\\Downloads\\chromedriver.exe");
        //String driverpath = System.getProperty("user.dir") + "\\Driver\\chromedriver.exe";
       // System.setProperty("webdriver.chrome.driver", driverpath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }
    public boolean AppsLogIn(String Username, String Password){
        AppsLaunch();
        btn_Signin.click();
        txt_EmailId.sendKeys(Username);
        txt_Password.sendKeys(Password);
        btn_LogIn.click();
        return true;
    }

}
