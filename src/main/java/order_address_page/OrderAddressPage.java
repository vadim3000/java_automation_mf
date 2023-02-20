package order_address_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderAddressPage {

    public OrderAddressPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Order Address Info
    @FindBy(xpath = "//input[@id='addressesForm:invoiceEmail']")
    public WebElement emailAddress;

    @FindBy(id = "addressesForm:invoiceForename")
    public WebElement firstName;

    @FindBy(id = "addressesForm:invoiceSurname")
    public WebElement lastName;

    @FindBy(id = "addressesForm:invoiceStreet")
    public WebElement streetAddress;

    @FindBy(id = "addressesForm:invoiceZipCode")
    public WebElement zipCode;

    @FindBy(id = "addressesForm:invoiceCity")
    public WebElement cityName;

    @FindBy(id = "addressesForm:invoicePhoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "addressesForm:j_id_8s")
    public WebElement paymentBtn;


    //Checkout Page
    @FindBy(id = "checkoutForm:invoiceForename")
    public WebElement firstNameC;

    @FindBy(id = "checkoutForm:invoiceSurname")
    public WebElement lastNameC;

    @FindBy(id = "checkoutForm:invoiceEmail")
    public WebElement emailAddressC;

    @FindBy(id = "checkoutForm:invoiceStreet")
    public WebElement streetAddressC;

    @FindBy(id = "checkoutForm:invoiceCompany")
    public WebElement addressNameC;

    @FindBy(id = "checkoutForm:invoiceZipCode")
    public WebElement zipCodeC;

    @FindBy(id = "checkoutForm:invoiceCity")
    public WebElement cityNameC;

    @FindBy(id = "checkoutForm:invoicePhoneNumber")
    public WebElement phoneNumberC;

    @FindBy(id = "checkoutForm:invoicedateOfBirth")
    public WebElement birthDateC;


    @FindBy(xpath = "//span[@class='ui-button-text ui-c']")
    public WebElement paymentBtnC;






}
