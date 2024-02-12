package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/Features/_10_AddNewItemWithSO.feature",
                "src/test/java/Features/_04_NewAddressCreate.feature"
        },
        glue = {"StepDefinitions"}
)
public class _02_RunnerTestMulty extends AbstractTestNGCucumberTests {
}
