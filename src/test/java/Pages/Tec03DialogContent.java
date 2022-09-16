package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tec03DialogContent extends Parent{

    public Tec03DialogContent() {
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
    @FindBy(xpath="//dynamic-view[@class=\"ng-star-inserted\"]")
    private WebElement success;
    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;
    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;
    @FindBy(xpath="//ms-masked-text-field//input[@data-placeholder=\"IBAN\"]")
    private WebElement ibanInput;
    @FindBy(xpath="(//ms-dialog-content//mat-select//div)[1]")
    private WebElement currencyClick;
    @FindBy(xpath="(//mat-option//span)[4]")
    private WebElement currencyChoose;

    @FindBy(xpath="(//mat-form-field//ms-text-field//input)[3]")
    private WebElement integrationCode;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "(//ms-edit-button//button)[1]")
    private WebElement editButton;
    @FindBy(xpath = "//td[contains(text(),'grup17')]//following::div/ms-edit-button")
    private WebElement editButtonGL;
    @FindBy(xpath = "//ms-table/div/cdk-virtual-scroll-viewport/div[1]/table/tbody/tr[1]/td")
    private WebElement checkElement;
    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;
    @FindBy(xpath = "//td[text()=' grup17-2 ']/../td[7]/div//ms-delete-button//button")
    private WebElement deleteButtonGL;
    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;
    @FindBy(xpath = "(//ms-text-field//input)[3]")
    private WebElement order;


    WebElement myElement;
    public void findAndSend(String strElement, String value){
        switch (strElement)
        {
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "nameInput" : myElement =nameInput; break;
            case "ibanInput" : myElement =ibanInput; break;
            case "integrationCode" : myElement =integrationCode; break;
            case "searchInput" : myElement =searchInput; break;
            case "shortName" : myElement =shortName; break;
            case "order" : myElement =order; break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "acceptCookies" : myElement =acceptCookies; break;
            case "loginButton" : myElement =loginButton; break;
            case "addButton" : myElement =addButton; break;
            case "currencyClick" : myElement =currencyClick; break;
            case "currencyChoose" : myElement =currencyChoose; break;
            case "saveButton" : myElement =saveButton; break;
            case "searchButton" : myElement =searchButton; break;
            case "editButton" : myElement =editButton; break;
            case "deleteButton" : myElement =deleteButton; break;
            case "deleteDialogBtn" : myElement =deleteDialogBtn; break;
            case "editButtonGL" : myElement =editButtonGL; break;
            case "deleteButtonGL" : myElement =deleteButtonGL; break;

        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){

        switch (strElement)
        {
            case "dashboard" : myElement =dashboard; break;
            case "success" : myElement =success; break;
        }

        verifyContainsText(myElement,text);
    }

    public void searchAndCheck(String accountName) {
        findAndSend("searchInput", accountName);
        findAndClick("searchButton");
        if (checkElement.getText().equalsIgnoreCase(accountName)) {
           findAndClick("editButton");
           findAndSend("integrationCode","6000");
           findAndClick("saveButton");
        }
        findAndClick("addButton");

    }

}
