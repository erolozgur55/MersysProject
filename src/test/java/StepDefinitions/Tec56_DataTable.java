package StepDefinitions;

import Pages.Tec56_DialogContent;
import Pages.Tec56_FormContent;
import Pages.Tec56_LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;

public class Tec56_DataTable {
    Tec56_DialogContent dc = new Tec56_DialogContent();
    Tec56_FormContent ftm = new Tec56_FormContent();
    Tec56_LeftNav ln = new Tec56_LeftNav();

    @When("Navigate to Human Resource Page")
    public void navigateToHumanResourcePage(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));
        }
    }

    @Then("Success message should be displayed.")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage", "success");
    }

    @When("Enter {string} and click search button.")
    public void enterAndAndClickSearchButton(String searchText) {
        dc.Search(searchText);
    }

    @And("Click Edit button, change {string}")
    public void clickEditButtonChange(String Name1) {
        dc.findAndClick("edit");
        ftm.findAndSend("nameInput", Name1);

    }

    @And("Click Delete button")
    public void clickDeleteButton(DataTable elements) {

        List<String> listElement = elements.asList(String.class);
        dc.waitUntilLoading();
        for (int i = 0; i < listElement.size(); i++) {
            dc.SearchAndDelete(listElement.get(i));
        }
    }


    @When("Navigate to School Location Page in the left nav")
    public void navigateToSchoolLocationPage(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));
        }
    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User Sending the keys in Form Content")
    public void userSendingTheKeysInFormContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ftm.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("User Sending the active or deactivate keys in Form Content")
    public void userSendingTheActiveOrDeactivateKeysInFormContent(String slideButton1) {
        if (slideButton1.equalsIgnoreCase("deactivate")) {
            ftm.findAndClick("slideButton");
        }
    }

    @And("User Sending the keys in Form")
    public void userSendingTheKeysInForm(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ftm.findAndClick(listElement.get(i));
        }
    }

    @And("Click Delete button in the School Location Page")
    public void clickDeleteButtonInTheSchoolLocationPage(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        dc.waitUntilLoading();
        for (int i = 0; i < listElement.size(); i++) {
            dc.Delete(listElement.get(i));
        }
    }
}