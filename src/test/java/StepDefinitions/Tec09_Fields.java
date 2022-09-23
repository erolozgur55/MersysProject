package StepDefinitions;

import Pages.Tec09_10_DialogContent;
import Pages.Tec09_10_LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Tec09_Fields {
    Tec09_10_LeftNav ln=new Tec09_10_LeftNav();
    Tec09_10_DialogContent dc=new Tec09_10_DialogContent();
    @And("Navigate to Fields page")
    public void navigateToFieldsPage() {
        ln.findAndClick("setup");
        ln.findAndClick("parameters");
        ln.findAndClick("fields");
    }

    @When("Create a Fields")
    public void createAFields() {
        dc.findAndClick("addbuttonAccount");
        dc.findAndSend("addNameAccount","Srver");
        dc.findAndSend("addCode","7979");
        dc.findAndClick("addText");
        dc.findAndClick("clickText");
        dc.findAndClick("saveButton");
        dc.findAndSend("searchInput","Srver");
        dc.findAndClick("searchButton");
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");


    }
}
