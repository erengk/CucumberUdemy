package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.Select;

public class _04_NewAddressCreateSteps extends Parent {
    DialogContent dc = new DialogContent();

    FormContent fc = new FormContent();


    @When("Click address book button")
    public void clickAddressBookButton() {
        clickFunction(dc.addressBookLink);
        clickFunction(dc.newAddressButton);
    }

    @And("Enter firstName {string} and lastName {string}")
    public void enterFirstNameAndLastName(String firstName, String lastName) {

        sendKeysFunction(fc.firstName,firstName);
        sendKeysFunction(fc.lastName,lastName);
        sendKeysFunction(fc.address1,"Eskisehir adres1");
        sendKeysFunction(fc.city,"Eskisehir");
        sendKeysFunction(fc.postCode,"12345");
//        Select select = new Select(fc.selectCountry);
//        select.selectByValue("215");
        Select select1 = new Select(fc.selectRegionState);
        select1.selectByIndex(10);
    }

    @And("full form and click continue button")
    public void fullFormAndClickContinueButton() {
        clickFunction(fc.continueButton);
    }



    @Then("Should be added new address")
    public void shouldBeAddedNewAddress() {
        verifyContainsTextFunction(dc.assertMessageAddress,"added");
    }

    @And("Enter firstName {string} and lastName {string} randomly")
    public void enterFirstNameAndLastNameRandomly(String firstName, String lastName) {

        String address1 = RandomStringUtils.randomAlphanumeric(3,10);
        String city = RandomStringUtils.randomAlphabetic(5,8);
        String num = RandomStringUtils.randomNumeric(6);
        //String ascii = RandomStringUtils.randomAscii(3);

        sendKeysFunction(fc.firstName,firstName);
        sendKeysFunction(fc.lastName,lastName);
        sendKeysFunction(fc.address1, address1);
        sendKeysFunction(fc.city,city);
        //sendKeysFunction(fc.postCode,num);
        Select select1 = new Select(fc.selectRegionState);
        select1.selectByIndex(10);
    }
}
