package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tec09_10_LeftNav extends Parent {

    public Tec09_10_LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setup;

    @FindBy(xpath="(//span[text()='Parameters'])[1]")
    private WebElement parameters;

    @FindBy(xpath="//span[text()='Fields']")
    private WebElement fields;

    @FindBy(xpath="//span[text()='Document Types']")
    private WebElement documentTypes;




    WebElement myElement;
    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "setup" : myElement =setup; break;
            case "parameters" : myElement =parameters; break;
            case "fields" : myElement =fields; break;
            case "documentTypes" : myElement =documentTypes; break;

        }

        clickFunction(myElement);
    }

}
