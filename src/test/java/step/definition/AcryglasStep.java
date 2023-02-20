package step.definition;

import org.openqa.selenium.Dimension;
import pages.acryglas.AcrylglasPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import main.MainClass;
import pages.indexpage.IndexPage;

import java.util.concurrent.TimeUnit;

public class AcryglasStep extends MainClass{

    private MainClass main;

    String acryglasPage = "https://www.meinfoto.de/foto-in-gross/foto-hinter-acrylglas.jsf";

    public AcryglasStep(MainClass main) {this.main = main; }


    @Given("^User opens Chrome browser, and moving to the meinfoto shop Acryglas page$")
    public void userOpensChromeBrowserAndMovingToTheMeinfotoShopAcryglasPage() {
        main.driver.navigate().to(acryglasPage);
        main.driver.manage().window().maximize();
//        System.out.println(main.driver.getTitle());

    }

    @When("^User click on CTA \"([^\"]*)\" from Acryglas teaser$")
    public void userClickOnCTAFromAcryglasTeaser(String arg0) throws Throwable {
        main.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        IndexPage homePage = new IndexPage(main.driver);
        homePage.AcceptCookieBtn.click();

        AcrylglasPage page = new AcrylglasPage(main.driver);
        page.acryglasUplaodButton.sendKeys(System.getProperty("user.dir") + "/src/main/resources/test_image_1.jpg");
    }
}
