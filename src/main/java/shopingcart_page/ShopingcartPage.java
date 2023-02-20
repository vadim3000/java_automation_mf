package shopingcart_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopingcartPage {

    public ShopingcartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

        //Shopping cart continue button

        //@FindBy(linkText = "Zur Kasse")
        @FindBy(id = "shoppingcartForm:proceedToCheckout")
        public WebElement orderAddressPage;

        @FindBy(xpath = "//a[@class='action-register button_action']")
        public WebElement ContinueToCheckoutBtn;

}
