package StepDefinitions;

import Pages.Tec09_10_DialogContent;
import Pages.Tec09_10_LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;

public class Tec10_DocumentTy {
    Tec09_10_LeftNav ln=new Tec09_10_LeftNav();
    Tec09_10_DialogContent dc=new Tec09_10_DialogContent();

    @And("Navigate to DocumentTyps page")
    public void navigateToDocumentTypsPage() {
        ln.findAndClick("setup");
        ln.findAndClick("parameters");
        ln.findAndClick("documentTypes");
    }

    @When("Create a DocumentTyps")
    public void createADocumentTyps() throws AWTException {
        dc.findAndClick("addbutton");
        dc.findAndSend("addNameAccount","Rver");
        dc.findAndClick("clickStage");
        dc.findAndClick("studentRegresion");
        dc.robotclick("saveButton","");
        dc.findAndClick("saveButton");
        dc.findAndSend("searchInput","Rver");
        dc.findAndClick("searchButton");
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");



    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","success");
    }


}
