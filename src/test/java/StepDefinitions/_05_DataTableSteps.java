package StepDefinitions;

import Pages.DialogContent;
import Pages.Header;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

import java.util.List;

public class _05_DataTableSteps extends Parent {
    DialogContent dc = new DialogContent();
    Header h = new Header();

    @When("Enter item name as DataTable")
    public void enterItemNameAsDataTable(DataTable dataTable) {
        List<String> itemList = dataTable.asList(String.class);

        for (String s: itemList
             ) {
            System.out.println("s = " + s);
            sendKeysFunction(h.searchInput,s);
            clickFunction(h.searchButton);
            clickFunction(dc.item1);
            clickFunction(h.addCart);
            clickFunction(h.viewCart);
            verifyContainsTextFunction(dc.assertMessage, "Gift");

        }

    }
}
