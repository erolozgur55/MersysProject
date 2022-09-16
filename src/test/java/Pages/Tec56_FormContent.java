package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tec56_FormContent extends Tec56_Parent {
    public Tec56_FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "(//span[@class='mat-slide-toggle-bar'])")
    private WebElement slideButton;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='capacity']//input")
    private WebElement capacity;



    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "nameInput": myElement = nameInput;break;
            case "shortInput": myElement = shortInput;break;
            case "capacity": myElement = capacity;break;

        }
        sendKeysFunction(myElement, value);
    }
    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "saveButton": myElement = saveButton;break;
            case "slideButton": myElement = slideButton;break;

        }

        clickFunction(myElement);
    }
}

