package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tec08_EducationLocations extends Parent{
    public Tec08_EducationLocations() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[class='nav-link-title ng-tns-c249-22 ng-star-inserted']")
    private WebElement Education;

    @FindBy(css = "[class='nav-link-title ng-tns-c249-23 ng-star-inserted']")
    private WebElement SetUp;

    @FindBy(xpath = "//span[text()='Subject Categories'][1]")
    private WebElement SubjectCategories;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]")
    private WebElement SubjectAdd;


    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement Name;//SendKeys


    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement Code;//SendKeys

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement Save;


    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement Edit;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement NewName1;


    @FindBy(xpath = "//ms-save-button//button")
    private WebElement Save2;


    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement Delete;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement SubmitDelete;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage2;


    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "Name": myElement = Name;break;
            case "Code": myElement = Code;break;
            case "NewName1": myElement = NewName1;break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "Education": myElement = Education;break;
            case "SetUp": myElement = SetUp;break;
            case "SubjectCategories": myElement = SubjectCategories;break;
            case "SubjectAdd": myElement = SubjectAdd;break;
            case "Save": myElement = Save;break;//Clickledi
            case "Edit": myElement = Edit;break;// Done
            case "Save2": myElement = Save2;break;//Clickledi
            case "Delete": myElement = Delete;break;
            case "SubmitDelete": myElement = SubmitDelete;break;

        }
        clickFunction(myElement);
    }
    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "successMessage": myElement = successMessage;break;
            case "successMessage2": myElement = successMessage2;break;
        }
        verifyContainsText(myElement, text);
    }
}


