package StepDefinitions;

import Pages.Tec03DialogContent;
import Pages.Tec4LeftNav;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Tec03_GradeLevelsSteps {
    Tec4LeftNav ln=new Tec4LeftNav();
    Tec03DialogContent dc=new Tec03DialogContent();
    Faker faker= Faker.instance();

    @When("Click the add button, fill in the blanks and click the save button on the grade level")
    public void clickTheAddButtonFillInTheBlanksAndClickTheSaveButtononthegradelevel() {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", "Grup17 Campus");
        dc.findAndSend("shortName", "grup17");
        dc.findAndSend("order", "1");
        dc.findAndClick("saveButton");
    }

    @When("The user clicks on the grade levels")
    public void theUserClicksOnTheGradeLevels() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("gradeLevels");
    }

    @And("User will edit account and click save on the grade level")
    public void userWillEditAccountAndClickSaveOnTheGradeLevel() {
        dc.findAndClick("editButtonGL");
        dc.findAndSend("nameInput", "Grup17-2 Campus");
        dc.findAndSend("shortName", "grup17-2");
        dc.findAndSend("order", "1");
        dc.findAndClick("saveButton");
    }

    @And("User will delete account on the grade level")
    public void userWillDeleteAccountOnTheGradeLevel() {
        dc.findAndClick("deleteButtonGL");
        dc.findAndClick("deleteDialogBtn");
    }
}
