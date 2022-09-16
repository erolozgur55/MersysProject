package StepDefinitions;

import Pages.Tec56_DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//richfield.edu
//Richfield2020!

public class Tec56_LoginSteps {

    Tec56_DialogContent klm = new Tec56_DialogContent();

    @Given("Navigate to basgar")
    public void navigateToBasgar() {

        GWD.getDriver().get("https://demo.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and pasword and click login button")
    public void enterUsernameAndPaswordAndClickLoginButton() {


       klm. findAndSend("username","richfield.edu");
       klm. findAndSend("password","Richfield2020!");
       klm.findAndClick("loginButton");

    }
    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        klm.findAndContainsText("dashboard","Dashboard");
        klm.findAndClick("acceptCookies");
    }
}
