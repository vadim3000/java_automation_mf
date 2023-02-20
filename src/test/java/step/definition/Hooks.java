package step.definition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import main.MainClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Hooks extends MainClass{

    private MainClass main;
    public Hooks(MainClass main) { this.main = main; }

@Before
    public void InitializeTest(){

    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

    main.driver = new ChromeDriver();

}

@After
    public void TestDown(Scenario scenario){
    if(scenario.isFailed()) {
        System.out.println(scenario.getName());
        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd_M_yyyy_hh_mm_ss");
        String fileName = format.format(dateNow) + ".png";
        File screenshot = ((TakesScreenshot) main.driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot, new File(System.getProperty("user.dir") + "/src/main/resources/screenshots/screenshot" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

        main.driver.quit();
}

}
