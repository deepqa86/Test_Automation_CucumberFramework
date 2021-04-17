package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
    WebDriver driver;
    Home_Page page = PageFactory.initElements(driver,Home_Page.class);
    //Elemnt Identifier

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    WebElement Lnk_Tshirt;
    @FindBy(xpath="//span[contains(text(),'Add to cart')]")
    WebElement Btn_AddCart;
    @FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/i")
    WebElement Msg_Success;


    //method

    public void SelectTshirt(){
        Lnk_Tshirt.click();
    }

    public void AddtoCart(){
        Btn_AddCart.click();
    }

    public boolean Addtocart_verify()
    {
        if (Msg_Success.isDisplayed()){
            return true;
        }
        else {
            return false;
        }
    }



}
