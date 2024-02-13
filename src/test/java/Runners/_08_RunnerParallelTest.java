package Runners;

import Utilities.GWD_second;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@SmokeTest and @RegressionTest",
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _08_RunnerParallelTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browserType")
    public void beforeClass(String browserType){
        GWD_second.threadBrowserType.set(browserType);
    }
}
