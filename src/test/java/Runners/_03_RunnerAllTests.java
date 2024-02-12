package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions"},
        dryRun = true
)
public class _03_RunnerAllTests extends AbstractTestNGCucumberTests {
}
