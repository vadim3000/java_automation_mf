package pages.mixpix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MixPixPage {

    public MixPixPage(WebDriver driver) {PageFactory.initElements(driver, this); }

    //MixPix CTA Button
    @FindBy(xpath = "//button[@class='js-du-button action button -action -arrow filebutton shortbutton']")
    public WebElement uploadMixPixBtn;

}