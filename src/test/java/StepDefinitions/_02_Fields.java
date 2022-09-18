package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class _02_Fields {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Navigate to Fields page")
    public void navigateToFieldsPage() {
        ln.findAndClick("setup");
        ln.findAndClick("parameters");
        ln.findAndClick("fields");
    }

    @When("Create a Fields")
    public void createAFields() {
        dc.findAndClick("addbuttonAccount");
        dc.findAndSend("addNameAccount","Server");
        dc.findAndSend("addCode","7878");
        dc.findAndClick("addText");
        dc.findAndClick("clickText");
        dc.findAndClick("saveButton");
        dc.findAndSend("searchInput","Server");
        dc.findAndClick("searchButton");
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");


    }
}
