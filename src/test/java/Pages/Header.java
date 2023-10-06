package Pages;

import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Header extends Parent{
    public Header(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "div#search > input")
    public WebElement searchInput;

    @FindBy(css = "span.input-group-btn > button")
    public WebElement searchButton;

    @FindBy(css = "span#cart-total")
    public WebElement addCart;

    @FindBy(xpath = "(//a[contains(@href,'checkout/cart')])[2]")
    public WebElement viewCart;

    @FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
    public WebElement ipod4;

    public WebElement getWebElement(String element){
        switch (element){
            case "searchInput": return this.searchInput;
            case "searchButton": return this.searchButton;
            case "addCart": return this.addCart;
            case "viewCart": return this.viewCart;
            case "ipod4": return this.ipod4;
        }
        return null;
    }
}
