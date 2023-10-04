package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent {

    public FormContent(){

        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(id = "input-firstname")
    public WebElement firstName;

    @FindBy(id = "input-lastname")
    public WebElement lastName;

    @FindBy(id = "input-address-1")
    public WebElement address1;

    @FindBy(id = "input-city")
    public WebElement city;

    @FindBy(id = "input-postcode")
    public WebElement postCode;

    @FindBy(id = "input-country")
    public WebElement selectCountry;

    @FindBy(id = "input-zone")
    public WebElement selectRegionState;

    @FindBy(css = "input[value='Continue']")
    public WebElement continueButton;



}
