package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfo_Page {
    WebDriver driver;
    PersonalInfo_Page Infopage = PageFactory.initElements(driver,PersonalInfo_Page.class);
    //Elemnt Identifier

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    WebElement Btn_UserName;
    @FindBy(xpath = "//span[contains(text(),'My personal information')]")
    WebElement Btn_PersonalInfo;
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement Txt_FirstNm;
    @FindBy(xpath = "//input[@id='old_passwd']")
    WebElement Txt_OldPass;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button")
    WebElement Btn_Save;
    @FindBy(xpath = "//p[contains(text(),'Your personal information has been successfully up')]")
    WebElement Msg_Success;



    //method

    public void NavigatetoInfopage()
    {
        Btn_UserName.click();
        Btn_PersonalInfo.click();
    }
    public void UpdateFirstname(String FirstName, String OldPass)
    {
        Txt_FirstNm.sendKeys(FirstName);
        Txt_OldPass.sendKeys(OldPass);
        Btn_Save.click();
    }

    public boolean VerifyUpdateMsg()
    {
        if (Msg_Success.isDisplayed())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
