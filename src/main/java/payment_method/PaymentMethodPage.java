package payment_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodPage {

    public PaymentMethodPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Payment method
    @FindBy(xpath = "//div[@id='ADYEN_BLOCK']//div[@class='head js-accordion-title -expandable']")
    public WebElement creditCardPayment;

    @FindBy(id = "cardHolder")
    public WebElement cardName;

    @FindBy(id = "cardNumber")
    public WebElement cartNumber;


    @FindBy(xpath = "//select[@id='cardExpirationMonth']")
    public WebElement months;
    @FindBy(xpath = "//option[contains(text(),'10 - Oktober')]")
    public WebElement months10;

    @FindBy(xpath = "//select[@id='cardExpirationYear']")
    public WebElement years;
    @FindBy(xpath = "//option[contains(text(),'2020')]")
    public WebElement year2020;

    @FindBy(id = "cardSecurityCode")
    public WebElement securityCode;

    @FindBy(xpath = "//button[@class='js-next-button action']")
    public WebElement confirmOrderPage;

    //Checkout Payment method

    @FindBy(xpath = "//p[normalize-space()='Kreditkarte']")
    public WebElement creditCardPaymentC;

    @FindBy(id = "cardExpirationMonth")
    public WebElement monthsC;
    @FindBy(xpath = "//option[contains(text(),'10 - Oktober')]")
    public WebElement months10C;

    @FindBy(id = "cardExpirationYear")
    public WebElement yearsC;
    @FindBy(xpath = "//option[contains(text(),'2020')]")
    public WebElement year2020C;


    @FindBy(xpath = "//button[@class='button action -action -filled -arrow']//span[@class='ui-button-text ui-c'][contains(text(),'Weiter')]")
    public WebElement confirmOrderC;


}
