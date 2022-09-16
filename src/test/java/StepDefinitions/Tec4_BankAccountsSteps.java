package StepDefinitions;

import Pages.Tec34DialogContent;
import Pages.Tec34LeftNav;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tec4_BankAccountsSteps {

    Tec34LeftNav ln=new Tec34LeftNav();
    Tec34DialogContent dc=new Tec34DialogContent();
    Faker faker= Faker.instance();
    String accountName="Grup17 Campus";
    @When("The user clicks on the bank account")
    public void theUserClicksOnTheBankAccount() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("bankAccounts");
    }
    @When("Click the add button, fill in the blanks and click the save button")
    public void clickTheAddButtonFillInTheBlanksAndClickTheSaveButton() {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", accountName);
        dc.findAndSend("ibanInput", faker.finance().iban());
        dc.findAndClick("currencyClick");
        dc.findAndClick("currencyChoose");
        dc.findAndSend("integrationCode",String.valueOf(faker.number().numberBetween(100,500)));
        dc.findAndClick("saveButton");
    }
    @When("User searches added account name, user will edit account and click save")
    public void usersearchesAddedAccountNameUserWillEditAccountAndClickSave() {
           dc.findAndSend("searchInput", accountName);
            dc.findAndClick("searchButton");
            dc.findAndClick("editButton");
            dc.findAndSend("integrationCode","6000");
            dc.findAndClick("saveButton");
        }

    @And("User searches added account name, user will delete account and click save")
    public void usersearchesAddedAccountNameUserWillDeleteAccountAndClickSave() {
        dc.findAndSend("searchInput", accountName);
        dc.findAndClick("searchButton");
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
    }
    @Then("Successfully message")
    public void succesfullyMessage() {
        dc.findAndContainsText("success", "success");
    }
}
