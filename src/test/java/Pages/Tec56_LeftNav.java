package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tec56_LeftNav extends Tec56_Parent {
    public Tec56_LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResource;

    @FindBy(xpath="(//span[text()='Setup'])[3]")
    private WebElement setupUc;

    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    private WebElement positions;

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath="(//span[text()='School Setup'])")
    private WebElement schoolSetup;

    @FindBy(xpath="(//span[text()='Locations'])")
    private WebElement locations;

    WebElement myElement;
    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "humanResource" : myElement =humanResource; break;
            case "setupUc" : myElement =setupUc; break;
            case "positions" : myElement =positions; break;
            case "setupOne" : myElement =setupOne; break;
            case "schoolSetup" : myElement =schoolSetup; break;
            case "locations" : myElement =locations; break;
        }
        clickFunction(myElement);
    }
}
