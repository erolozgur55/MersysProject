package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent extends Parent{

    public DialogContent() {
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

    @FindBy(xpath = "//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']")
    private WebElement successMessage;

    @FindBy(xpath="//ms-text-field[contains(@placeholder,'FIELD.NAME')]//input")
    private WebElement searchInput;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement searchButton;

//    @FindBy(css="[class='svg-inline--fa fa-trash-can']")
//    private WebElement searchButton;

    @FindBy(xpath="(//ms-text-field[contains(@placeholder,'FIELD.NAME')]//input)[2]")
    private WebElement addNameAccount;

    @FindBy(xpath="(//ms-text-field[contains(@placeholder,'FIELD.CODE')]//input)[2]")
    private WebElement addCode;

    @FindBy(xpath="(//mat-select[contains(@formcontrolname,'type')]//div)[2]")
    private WebElement addText;

    @FindBy(xpath="//span[text()=' Text ']")
    private WebElement clickText;

//    @FindBy(xpath="//ms-text-field[contains(@placeholder,'INTEGRATION_CODE')]//input")
//    private WebElement addIntegrCode;

//    @FindBy(xpath="//ms-save-button[contains(@class,'inserted')]//button")
//    private WebElement saveaddButton;

//    @FindBy(xpath="//ms-text-field[contains(@placeholder,'FIELD.NAME')]//input  ")
//    private WebElement searchInput;

//    @FindBy(xpath="//span[text()='Search']")
//    private WebElement searchButton;

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
//            case "addIntegrCode" : myElement =addIntegrCode; break;
//            case "searchInput" : myElement =searchInput; break;


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
//            case "searchButton" : myElement =searchButton; break;
            case "deleteButton" : myElement =deleteButton; break;
            case "deleteDialogBtn" : myElement =deleteDialogBtn; break;


        }

        clickFunction(myElement);


    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "dashboard" : myElement =dashboard; break;
            case "successMessage" : myElement =successMessage; break;

        }

        verifyContainsText(myElement,text);
    }


    public void SearchAndDelete(String searchText){

        //scrollUp()
        findAndSend("searchInput", searchText); // aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas

        //waitUntilLoading();

        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"),"Search"));

        findAndClick("deleteButton");// silme butonua bas
        findAndClick("deleteDialogBtn");// dilogdaki silme butonuna bas
    }
//    public void robotclick(String strElement){
//        switch (strElement) {
//            case "saveButton": myElement = saveButton; break;
//
//        }
//        clickFunction(myElement);
//
//
//    }



}
