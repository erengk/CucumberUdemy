package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class Parent {

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

    public void sendKeysFunction(WebElement element, String text){
        waitUntilVisible(element);
        scrollToElementFunction(element);
        element.clear();
        element.sendKeys(text);
    }

    public void clickFunction(WebElement element){
        waitUntilClicakble(element);
        scrollToElementFunction(element);
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].click();",element);
    }

    public void verifyContainsTextFunction(WebElement element, String text){
        wait.until(ExpectedConditions.textToBePresentInElement(element,text));
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()),"Doğrulanamadı");
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }

    public void scrollToElementFunction(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClicakble(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
