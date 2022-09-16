package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tec12LeftNav extends Parent {

    public Tec12LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='Position Categories']")
    private WebElement positionCategories;

    @FindBy(xpath = "//span[text()='Attestations']")
    private WebElement attestations;


    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "humanResources":
                myElement = humanResources;
                break;
            case "setup":
                myElement = setup;
                break;
            case "positionCategories":
                myElement = positionCategories;
                break;
            case "attestations":
                myElement = attestations;
                break;
        }
        clickFunction(myElement);
    }
}
