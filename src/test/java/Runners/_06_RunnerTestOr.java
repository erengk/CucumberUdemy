package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@RegressionTest and @SmokeTest", // or veya and kullanılabilir. or kullanıldığında bu iki tag'den en az birini içerenler
                                                // çalıştırılır. and kullanıldığında ise iki tag aynı anda barındırılan feature dosyaları çalıştırılır.
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions"},
        //plugin = {"json:target/cucumber/cucumber.json"}
        plugin = {"html:target/site/cucumber-basic.html"}
)
public class _06_RunnerTestOr extends AbstractTestNGCucumberTests {
}
