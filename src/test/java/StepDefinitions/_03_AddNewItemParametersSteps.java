package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Header;
import Pages.Parent;
import io.cucumber.java.en.When;

public class _03_AddNewItemParametersSteps extends Parent {
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();
    Header h = new Header();

    @When("Enter itemname {string}")
    public void enterItemname(String itemname) {
        sendKeysFunction(h.searchInput,itemname);
        clickFunction(h.searchButton);
    }
}
