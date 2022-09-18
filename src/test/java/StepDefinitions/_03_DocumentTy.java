package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _03_DocumentTy {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to DocumentTyps page")
    public void navigateToDocumentTypsPage() {
        ln.findAndClick("setup");
        ln.findAndClick("parameters");
        ln.findAndClick("documentTypes");
    }

    @When("Create a DocumentTyps")
    public void createADocumentTyps() throws AWTException {
        dc.findAndClick("addbutton");
        dc.findAndSend("addNameAccount","Server");
        dc.findAndClick("clickStage");
        dc.findAndClick("studentRegresion");
        dc.robotclick("saveButton","");
        dc.findAndClick("saveButton");
        dc.findAndSend("searchInput","Server");
        dc.findAndClick("searchButton");
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");



    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","success");
    }


}