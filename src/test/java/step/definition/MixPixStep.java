package step.definition;

import configurator_page.ConfiguratorPage;
import confirm_order_page.ConfirmOrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.MainClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import pages.mixpix.MixPixPage;
import order_address_page.OrderAddressPage;
import payment_method.PaymentMethodPage;
import shopingcart_page.ShopingcartPage;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class MixPixStep extends MainClass {

    private MainClass main;

    String mixpixPage = "https://www.meinfoto.de/mixpix/";

    public MixPixStep(MainClass main) {
        this.main = main;
    }

    @Given("^User opens Chrome browser, and moving to the meinfoto shop Mix-pix page$")
    public void userOpensChromeBrowserAndMovingToTheMeinfotoShopMixPixPage() throws Throwable{
        main.driver.navigate().to(mixpixPage);
        main.driver.manage().window().maximize();
        System.out.println(main.driver.getTitle());
    }

    @When("^User click on CTA \"([^\"]*)\" from MixPix teaser$")
    public void userClickOnCTAFromMixPixTeaser(String arg0) throws Throwable{
        main.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MixPixPage page  = new MixPixPage(main.driver);
        System.out.println(page.uploadMixPixBtn.getTagName());
//        JavascriptExecutor executor = (JavascriptExecutor)main.driver;
//        executor.executeScript(("arguments[0].click();"), page.uploadMixPixBtn);
        page.uploadMixPixBtn.click();
        main.driver.switchTo().activeElement().sendKeys("/home/vadim/Desktop/testtest");
//        main.driver.switchTo().activeElement().sendKeys(System.getProperty("user.dir") + "/src/main/resources/test_image_1.jpg");
//        Alert alert = main.driver.switchTo().alert();
//        alert.sendKeys(System.getProperty("user.dir") + "/src/main/resources/test_image_1.jpg");
//        page.uploadMixPixBtn.sendKeys("/home/vadim/Desktop/test_image.jpg");
    }

    @And("^User in configurator and clicks to the CTA \"([^\"]*)\" button$")
    public void userInConfiguratorAndClicksToTheCTAButton(String arg0) throws Throwable {
        main.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(4000);
        ConfiguratorPage page = new ConfiguratorPage(main.driver);
        page.continueMutiuploadConfBtn.click();

    }

    @And("^User in shoppingcart page and clicks On CTA \"([^\"]*)\" button$")
    public void userInShoppingcartPageAndClicksOnCTAButton(String arg0) throws Throwable{
        main.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(4000);
        ShopingcartPage page = new ShopingcartPage(main.driver);
        page.orderAddressPage.click();
    }

    @And("^User in loginCheckout page and clicks to the CTA \"([^\"]*)\" button$")
    public void userInLoginCheckoutPageAndClicksToTheCTAButton(String arg0) throws Throwable {
        main.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(4000);
        ShopingcartPage page = new ShopingcartPage(main.driver);
        page.ContinueToCheckoutBtn.click();

    }

    @And("^User fills in valid data and clicks to the CTA \"([^\"]*)\" button$")
    public void userFillsInValidDataAndClicksToTheCTAButton(String arg0) throws InterruptedException{
        main.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        OrderAddressPage page = new OrderAddressPage(main.driver);
        Thread.sleep(2000);
        page.firstNameC.sendKeys("VGOTESTVGOTESTAUTOMATION");
        page.lastNameC.sendKeys("VDVTESTVDVTESTAUTOMATION");
        page.emailAddressC.sendKeys("vadim.golban@g.picanova.com");
        page.streetAddressC.sendKeys("#reject1");
        page.addressNameC.sendKeys("Apartment 34");
        page.zipCodeC.sendKeys("99999");
        page.cityNameC.sendKeys("TEST");
        page.phoneNumberC.sendKeys("+2214578132");
        page.birthDateC.sendKeys("11.11.2001");
        Thread.sleep(2000);
        page.paymentBtnC.click();
    }

    @And("^User clicks to the creditcard field, fills in with valid data and clicks to the CTA \"([^\"]*)\" button$")
    public void userClicksToTheCreditcardFieldFillsInWithValidDataAndClicksToTheCTAButton(String arg0) throws InterruptedException{
        main.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        PaymentMethodPage page = new PaymentMethodPage(main.driver);
        Thread.sleep(3000);
        page.creditCardPaymentC.click();
        main.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        page.cardName.sendKeys("Bijenkorf");
        page.cartNumber.sendKeys("5100 0600 0000 0002");
        page.monthsC.sendKeys("12");
//        page.months10C.click();
        page.yearsC.sendKeys("29");
//        page.year2020C.click();
        page.securityCode.sendKeys("737");

        Thread.sleep(2000);
        page.confirmOrderC.click();
    }


    @And("^User on confirmorder page and clicks to the CTA \"([^\"]*)\" button$")
    public void userOnConfirmorderPageAndClicksToTheCTAButton(String arg0) throws Throwable{
        main.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd_M_yyyy_hh_mm_ss");
        String fileName = format.format(dateNow)+ ".png";
        File screenshot = ((TakesScreenshot) main.driver).getScreenshotAs(OutputType.FILE);
        try{
            FileHandler.copy(screenshot, new File(System.getProperty("user.dir") + "/src/main/resources/screenshots//screenshot_" + fileName));
        } catch (IOException e){
            e.printStackTrace();
        }

        ConfirmOrderPage page = new ConfirmOrderPage(main.driver);
        Thread.sleep(3000);
        page.confirmOrderC.click();
        
    }
    @Then("^User will be redirected on ordersuccessfully page and \"([^\"]*)\" tracking order$")
    public void userWillBeRedirectedOnOrdersuccessfullyPageAndTrackingOrder(String arg0) throws Throwable{
        main.driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        Thread.sleep(4000);
//            main.driver.close();
    }


}
