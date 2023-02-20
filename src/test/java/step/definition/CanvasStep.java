package step.definition;

import io.cucumber.java.sl.In;
import pages.canvas.CanvasPage;
import configurator_page.ConfiguratorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import main.MainClass;
import pages.indexpage.IndexPage;

import java.util.concurrent.TimeUnit;

public class CanvasStep extends MainClass {

    private MainClass main;

    String canvasPage = "https://www.meinfoto.de/foto-in-gross/foto-auf-leinwand.jsf";

    public CanvasStep(MainClass main) {
        this.main = main;
    }


    @Given("User opens Chrome browser, and moving to the meinfoto shop Canvas page")
    public void userOpensChromeBrowserAndMovingToTheMeinfotoShopCanvasPage() {
        main.driver.navigate().to(canvasPage);
        main.driver.manage().window().maximize();
    }

    @When("User clicks on CTA {string} from Canvas teaser")
    public void userClicksOnCTAFromCanvasTeaser(String arg0) throws Throwable{

        main.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        IndexPage homePage = new IndexPage(main.driver);
        homePage.AcceptCookieBtn.click();

        CanvasPage page = new CanvasPage(main.driver);
        page.canvasUploadButton.sendKeys(System.getProperty("user.dir") + "/src/main/resources/test_image_1.jpg");
    }

    @And("User in single upload configurator and clicks to the {string} button")
    public void userInSingleUploadConfiguratorAndClicksToTheButton(String arg0) throws Throwable{
        main.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        ConfiguratorPage page = new ConfiguratorPage(main.driver);
        page.continueConfiguratorBtn.click();
    }

}
