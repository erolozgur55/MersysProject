package StepDefinitions;

import Pages.Tec12DialogContent;
import Pages.Tec12LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tec01_PositionSteps {

    Tec12LeftNav ln = new Tec12LeftNav();
    Tec12DialogContent dc = new Tec12DialogContent();

    @When("Navigate to the position categories")
    public void navigate_to_the_position_categories() {
        ln.findAndClick("humanResources");
        ln.findAndClick("setup");
        ln.findAndClick("positionCategories");
    }

    @Then("Admin should add a position category")
    public void admin_should_add_a_position_category() {
        dc.findAndClick("addButton");
        dc.findAndSend("positionName", "aaa");
        dc.findAndClick("saveButton");

    }

    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        dc.findAndContainsText("successMessage", "successfully");
        GWD.wait(2);
    }

    @Then("Admin should edit the position category")
    public void admin_should_edit_the_position_category() {
        dc.findAndClick("editButton");
        dc.findAndSend("positionNameEdit", "aaaa");
        dc.findAndClick("saveButton");
    }

    @Then("Admin should delete the position category")
    public void admin_should_delete_the_position_category() {
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteConfirm");
    }
}
