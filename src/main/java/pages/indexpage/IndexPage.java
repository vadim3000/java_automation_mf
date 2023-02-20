package pages.indexpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
    public IndexPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Accept Cookies btn
    @FindBy(xpath = "//span[contains(text(),'Alle akzeptieren')]")
    public WebElement AcceptCookieBtn;
}
