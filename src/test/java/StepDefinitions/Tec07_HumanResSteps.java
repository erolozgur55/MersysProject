package StepDefinitions;

import Pages.Parent;
import Pages.Tec7_HumanResourcesLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tec07_HumanResSteps extends Parent {

    Tec7_HumanResourcesLocators lc=new Tec7_HumanResourcesLocators();
    @When("Click to Human Resources ,Setup and Positions")
    public void clickToHumanResourcesSetupAndPositions() {
        lc.findAndClick("HumanRes");
        lc.findAndClick("Setup3");
        lc.findAndClick("Positions");

    }
    @And("Add New Position")
    public void addNewPosition() {
        lc.findAndClick("PositionsAdd");
    }
    @Then("Enter {string}  {string} and Click Save Button")
    public void enterAndClickSaveButton(String Name, String ShortName) {
        lc.findAndSend("NamePosition",Name);
        lc.findAndSend("ShortName",ShortName);
        lc.findAndClick("SavePosition");
    }

    @And("Click Edit Button and Change {string} and Save")
    public void clickEditButtonAndChangeAndSave(String NameEdit) {
        lc.findAndClick("EditButton");
        lc.findAndSend("EditName",NameEdit);
        lc.findAndClick("SaveEdit");
    }

    @And("Search Input and Click Search Button")
    public void searchInputAndClickSearchButton() {
        lc.findAndSend("SearchInputName","ulduz");
        lc.findAndClick("SearchButton");
    }

    @Then("Delete Click Search")
    public void searchInputAndDeleteClickSearch() {
        lc.findAndClick("DeleteTrash");
        lc.findAndClick("deleteDialogBtn");
    }
}
