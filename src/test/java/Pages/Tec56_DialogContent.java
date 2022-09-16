package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Tec56_DialogContent extends Tec56_Parent {
    public Tec56_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//button[contains(text(),'Accept all cookies')])[1]")
    private WebElement acceptCookies;
    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement nameInputsearch;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input")
    private WebElement shortInputSearch;

    @FindBy(xpath = "(//span[text()='Search'])")
    private WebElement search;

    @FindBy(xpath = "(//ms-edit-button[@table='true'])")
    private WebElement edit;

    @FindBy(xpath = "//td[contains(@class,'name')]")
    private WebElement editName;

    @FindBy(xpath = "(//ms-delete-button[@table='true'])")
    private WebElement delete;

    @FindBy(xpath = "(//span[text()=' Delete '])")
    private WebElement submit;


    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "username": myElement = username;break;
            case "password": myElement = password;break;
            case "nameInputsearch": myElement = nameInputsearch;break;
            case "shortInputSearch": myElement = shortInputSearch;break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "acceptCookies": myElement = acceptCookies;break;
            case "loginButton": myElement = loginButton;break;
            case "addButton": myElement = addButton;break;
            case "search": myElement = search;break;
            case "edit": myElement = edit;break;
            case "delete": myElement = delete;break;
            case "submit": myElement = submit;break;

        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "dashboard": myElement = dashboard;break;
            case "successMessage": myElement = successMessage;break;
        }

        verifyContainsText(myElement, text);
    }

    public void Search(String searchText) {
        findAndSend("nameInputsearch", searchText);
        findAndClick("search");
        waitUntilLoading();
    }

    public void SearchAndDelete(String searchText) {
        findAndSend("nameInputsearch", searchText);
        findAndClick("search");

        waitUntilLoading();

        findAndClick("delete");
        findAndClick("submit");
    }

    public void Delete(String searchText) {

        findAndClick("delete");
        findAndClick("submit");
        waitUntilLoading();
    }

    public void list(String searchText){
        List<String> liste=new ArrayList<>();

        liste.addAll(Collections.singleton(editName.getText()));
    }

}


