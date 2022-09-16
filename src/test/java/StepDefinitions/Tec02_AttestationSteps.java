package StepDefinitions;

import Pages.Tec12DialogContent;
import Pages.Tec12LeftNav;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tec02_AttestationSteps {
    Tec12LeftNav ln = new Tec12LeftNav();
    Tec12DialogContent dc = new Tec12DialogContent();

    @When("Navigate to the Attestations")
    public void navigate_to_the_attestations() {
        ln.findAndClick("humanResources");
        ln.findAndClick("setup");
        ln.findAndClick("attestations");
    }

    @Then("Admin should add a Attestation")
    public void admin_should_add_a_attestation() {
        dc.findAndClick("attestationAddButton");
        dc.findAndSend("attestationsName", "alp");
        dc.findAndClick("saveButton");
    }

    @Then("Admin should edit the Attestation")
    public void admin_should_edit_the_attestation() {
        dc.findAndClick("editButton");
        dc.findAndSend("attestationsEdit", "alpp");
        dc.findAndClick("saveButton");
    }

    @Then("Admin should delete the Attestation")
    public void admin_should_delete_the_attestation() {
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteConfirm");
    }

}
