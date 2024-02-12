package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@RegressionTest",
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions"}
)
public class _05_RunnerTestRegression extends AbstractTestNGCucumberTests {
}
