package confirm_order_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrderPage {

public ConfirmOrderPage(WebDriver driver)  { PageFactory.initElements(driver, this); }

    //ConfirmOrderPage
    @FindBy(id = "orderConfirmationForm:buyNowButton")
    public WebElement confirmOrder;

    //Checkout Confirm Order

    @FindBy(id = "checkoutForm:buyNowButton")
    public WebElement confirmOrderC;


}
