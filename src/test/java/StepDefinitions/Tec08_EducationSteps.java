package StepDefinitions;

import Pages.Parent;
import Pages.Tec8_EducationLocations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tec08_EducationSteps extends Parent {

    Tec8_EducationLocations lo=new Tec8_EducationLocations();
    @When("Navigate to Education,Setup and Subject Categories")
    public void navigateToEducationSetupAndSubjectCategories() {
        lo.findAndClick("Education");
        lo.findAndClick("SetUp");
        lo.findAndClick("SubjectCategories");
    }

    @And("Click Add Button")
    public void clickAddButton() {
        lo.findAndClick("SubjectAdd");
    }

    @And("Add {string} vs {string} and Click Save Button")
    public void addVsAndClickSaveButton(String Name, String Code) {
        lo.findAndSend("Name",Name);
        lo.findAndSend("Code",Code);
        lo.findAndClick("Save");//Save etti


    }

    @Then("Subject Category successfully updated")
    public void subjectCategorySuccessfullyUpdated() {
        lo.findAndContainsText("successMessage", "success");//Bunuda etti
    }

    @And("Click Edit and send {string} and Save")
    public void clickEditAndSendAndSave(String NewName) {
        lo.findAndClick("Edit");//click etti
        lo.findAndSend("NewName1",NewName);//Bunu yollamadi
        lo.findAndClick("Save2");
    }

    @Then("Delete")
    public void delete() {
        lo.findAndClick("Delete");
        lo.findAndClick("SubmitDelete");
    }

    @And("Success message")
    public void successMessage() {
        lo.findAndContainsText("successMessage2","success");
    }
}
