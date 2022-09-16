package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tec07_HumanResourcesLocators extends Parent{
    public Tec07_HumanResourcesLocators() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(css = "[class='nav-link ng-tns-c249-17 ng-star-inserted']")
    private WebElement HumanRes;

    @FindBy(css = "[class='nav-link-title ng-tns-c249-18 ng-star-inserted']")
    private WebElement Setup3;

    @FindBy(xpath = "//fuse-nav-vertical-item[@class='ng-tns-c249-18 nav-item ng-star-inserted']")
    private WebElement Positions;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]")
    private WebElement PositionsAdd;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement NamePosition;//SendKeys


    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement ShortName;//SendKeys

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']")
    private WebElement SavePosition;

    @FindBy(xpath = "(//ms-edit-button//button)[1]")
    private WebElement EditButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement EditName;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']")
    private WebElement SaveEdit;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement ClickSearchName;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement SearchInputName;//sendkeys yolladi done

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement SearchButton;//tikladi Bura kadar sorunsuz calisti

    @FindBy(xpath ="//ms-delete-button//button")
    private WebElement DeleteTrash;//????

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;


    WebElement myElement;
    public void findAndSend(String strElement, String value){
        switch (strElement)
        {
            case "NamePosition": myElement = NamePosition;break;
            case "ShortName": myElement = ShortName;break;
            case "EditName": myElement = EditName;break;
            case "SearchInputName": myElement = SearchInputName;break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "HumanRes":myElement = HumanRes;break;
            case "Setup3": myElement = Setup3;break;
            case "Positions": myElement = Positions;break;
            case "PositionsAdd": myElement = PositionsAdd;break;
            case "SavePosition": myElement = SavePosition;break;
            case "EditButton": myElement = EditButton;break;
            case "SaveEdit": myElement = SaveEdit;break;//son
            case "SearchButton": myElement = SearchButton;break;
            case "DeleteTrash": myElement = DeleteTrash;break;
            case "deleteDialogBtn": myElement = deleteDialogBtn;break;

        }
        clickFunction(myElement);
    }

    public void SearchAndDelete(String searchText) {
        findAndSend("SearchInputName", searchText);
        findAndClick("SearchButton");

        GWD.wait(3);

        findAndClick("DeleteTrash");

        findAndClick("deleteDialogBtn");
    }

}

