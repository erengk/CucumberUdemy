package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps extends Parent {
//    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

    DialogContent dc = new DialogContent();

    @Given("Navigate to Opencart")
    public void navigateToOpencart() {
        GWD.getDriver().get("https://opencart.abstracta.us/index.php?route=account/login");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
//        wait.until(ExpectedConditions.elementToBeClickable(dc.loginButton));
//        dc.email.sendKeys("carlosSantana@gmail.com");
//        dc.password.sendKeys("1234");
//        dc.loginButton.click();
        sendKeysFunction(dc.email, "carlosSantana@gmail.com");
        sendKeysFunction(dc.password, "1234");
        clickFunction(dc.loginButton);

    }

    @Then("User should login succesfully")
    public void userShouldLoginSuccesfully() {
//        wait.until(ExpectedConditions.visibilityOf(dc.myAccount));
//        String message = dc.myAccount.getText();
//        Assert.assertTrue(message.equals("My Account"), "Login Başarısız");
        verifyContainsTextFunction(dc.myAccount, "My Account");
    }
}
