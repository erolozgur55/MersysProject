package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Tec09_10_DialogContent extends Parent{

    public Tec09_10_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id="mat-input-0")
    private WebElement username;

    @FindBy(id="mat-input-1")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;
    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addbutton;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'BUTTON.ADD')]//button")
    private WebElement addbuttonAccount;

    @FindBy(xpath="(//ms-dialog-content[contains(@formgroup,'Object')]//mat-form-field//div)[8]")
    private WebElement clickStage;

    @FindBy(xpath="//span[text()=' Student Registration ']")
    private WebElement studentRegresion;

    @FindBy(xpath="//ms-save-button[@class='ng-star-inserted']//button")
    private WebElement saveButton;

    @FindBy(xpath="//dynamic-view[@class='ng-star-inserted']")
    private WebElement successMessage;

    @FindBy(xpath="//ms-text-field[contains(@placeholder,'FIELD.NAME')]//input")
    private WebElement searchInput;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement searchButton;

    @FindBy(xpath="(//ms-text-field[contains(@placeholder,'FIELD.NAME')]//input)[2]")
    private WebElement addNameAccount;

    @FindBy(xpath="(//ms-text-field[contains(@placeholder,'FIELD.CODE')]//input)[2]")
    private WebElement addCode;

    @FindBy(xpath="(//mat-select[contains(@formcontrolname,'type')]//div)[2]")
    private WebElement addText;

    @FindBy(xpath="//span[text()=' Text ']")
    private WebElement clickText;

    @FindBy(xpath="//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath="//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;




    WebElement myElement;
    public void findAndSend(String strElement, String value){
        switch (strElement)
        {
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "addNameAccount" : myElement =addNameAccount; break;
            case "searchInput" : myElement =searchInput; break;
            case "addCode" : myElement =addCode; break;
        }

        sendKeysFunction(myElement, value);
    }
    public void findAndClick(String strElement){

        switch (strElement)
        {
            case "loginButton" : myElement =loginButton; break;
            case "acceptCookies" : myElement =acceptCookies; break;
            case "addbutton" : myElement =addbutton; break;
            case "addbuttonAccount" : myElement =addbuttonAccount; break;
            case "addText" : myElement =addText; break;
            case "clickText" : myElement =clickText; break;
            case "clickStage" : myElement =clickStage; break;
            case "studentRegresion" : myElement =studentRegresion; break;
            case "saveButton" : myElement =saveButton; break;
            case "searchButton" : myElement =searchButton; break;
            case "deleteButton" : myElement =deleteButton; break;
            case "deleteDialogBtn" : myElement =deleteDialogBtn; break;
        }
        clickFunction(myElement);
    }
    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "dashboard" : myElement =dashboard; break;
            case "successMessage" : myElement =successMessage; break;

        }
        verifyContainsText(myElement,text);
    }
    public void SearchAndDelete(String searchText){

        findAndSend("searchInput", searchText);
        findAndClick("searchButton");
//        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"),"Search"));
        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");
    }


}
