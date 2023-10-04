package StepDefinitions;

import Pages.DialogContent;
import Pages.Header;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class _05_DataTableExampleSteps extends Parent {
    Header h = new Header();
    DialogContent dc = new DialogContent();
    @When("Enter item name as DataTable")
    public void enterItemNameAsDataTable(DataTable dt) {
        List<String> itemList = dt.asList(String.class);

        for (int i = 0; i < itemList.size(); i++) {
            sendKeysFunction(h.searchInput,itemList.get(i));
            clickFunction(h.searchButton);
            clickFunction(dc.item1);
        }
    }

    @Then("Should be added new item with DataTable in Shop Cart")
    public void shouldBeAddedNewItemWithDataTableInShopCart() {
        clickFunction(h.addCart);
        clickFunction(h.viewCart);
        verifyContainsTextFunction(dc.assertMessage, "Gift");
    }
}
