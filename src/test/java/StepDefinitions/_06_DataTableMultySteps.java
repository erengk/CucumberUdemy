package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _06_DataTableMultySteps {
    @And("Send this items with Data Table")
    public void sendThisItemsWithDataTable(DataTable dt) {
        List<List<String>> urunModelListesi = dt.asLists(String.class);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(urunModelListesi.get(i).get(j));
            }
        }
    }
}
/*

0.0 0.1 0.2
1.0 1.1 1.2
2.0 2.1 2.2

 */