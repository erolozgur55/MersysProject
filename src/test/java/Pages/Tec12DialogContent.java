package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tec12DialogContent extends Parent {

    public Tec12DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;
    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;
    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;
    @FindBy(css = "[class='hot-toast-message']")
    private WebElement successMessage;
    @FindBy(css = "ms-add-button[tooltip='POSITION_CATEGORY.TITLE.ADD']")
    private WebElement addButton;
    @FindBy(css = "input[id='ms-text-field-1']")
    private WebElement positionName;
    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']")
    private WebElement saveButton;
    @FindBy(css = "ms-delete-button[table='true']")
    private WebElement deleteButton;
    @FindBy(css = "ms-edit-button[table='true']")
    private WebElement editButton;
    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement deleteConfirm;
    @FindBy(css = "input[id='ms-text-field-2']")
    private WebElement positionNameEdit;
    @FindBy(css = "ms-add-button[tooltip='ATTESTATION.TITLE.ADD']")
    private WebElement attestationAddButton;
    @FindBy(css = "input[id='ms-text-field-1']")
    private WebElement attestationsName;
    @FindBy(css = "input[id='ms-text-field-2']")
    private WebElement attestationsEdit;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "positionName":
                myElement = positionName;
                break;
            case "positionNameEdit":
                myElement = positionNameEdit;
                break;
            case "attestationsName":
                myElement = attestationsName;
                break;
            case "attestationsEdit":
                myElement = attestationsEdit;
                break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "acceptCookies":
                myElement = acceptCookies;
                break;
            case "loginButton":
                myElement = loginButton;
                break;
            case "addButton":
                myElement = addButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
            case "editButton":
                myElement = editButton;
                break;
            case "deleteConfirm":
                myElement = deleteConfirm;
                break;
            case "attestationAddButton":
                myElement = attestationAddButton;
                break;


        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {
            case "dashboard":
                myElement = dashboard;
                break;
            case "successMessage":
                myElement = successMessage;
                break;

        }
        verifyContainsText(myElement, text);
    }


}
