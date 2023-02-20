package configurator_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfiguratorPage {

    public ConfiguratorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Single Upload configurator continue button
    //@FindBy(linkText = "In den Warenkorb legen")
    @FindBy(xpath= "//a[@id='UploadFileDesktop']")
    public WebElement continueConfiguratorBtn;

    //Multi upload button
    @FindBy(id = "itemConfiguratorForm:addToCartBtn")
    public WebElement continueMutiuploadConfBtn;

}
