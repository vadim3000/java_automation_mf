package pages.canvas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CanvasPage {

    public CanvasPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    // Canvas CTA Button
    @FindBy(xpath = "//div[contains(@class,'info')]//form[@class='js-du']//input[contains(@class,'js-du-file fileinput')]")

    public WebElement canvasUploadButton;


}
