package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tec4LeftNav extends Parent{

    public Tec4LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bankAccounts;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevels;



    WebElement myElement;
    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "setupOne" : myElement =setupOne; break;
            case "parameters" : myElement =parameters; break;
            case "bankAccounts" : myElement =bankAccounts; break;
            case "gradeLevels" : myElement =gradeLevels; break;

        }
        clickFunction(myElement);
    }

}
