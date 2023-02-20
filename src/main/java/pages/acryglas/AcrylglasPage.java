package pages.acryglas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcrylglasPage {
    public AcrylglasPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
//      Acryglas CTA Button
        @FindBy(xpath = "//div[@class='upload-button']//input[@class='js-du-file fileinput']")
        public WebElement acryglasUplaodButton;
    }

