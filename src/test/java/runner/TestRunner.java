package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions(
        features = "src/test/java/features",
        glue = "step/definition",
        stepNotifications = true,
        tags = "@canvas"
)

public class TestRunner {

}
