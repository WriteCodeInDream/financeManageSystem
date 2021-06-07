package pageElements;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;

public class CommonPage extends BasePage{
    public CommonPage(BaseDriver baseDriver) {
        super(baseDriver);
    }

    public WebElement getUsernameElement(){
        return getElement("usernameInfo");
    }


    public WebElement getContentCancelButton(){
        return getElement("cancelButton");
    }

    public WebElement getContentCloseButton(){
        return getElement("closeButton");
    }

    public WebElement getContentCommitButton(){
        return getElement("commitButton");
    }

    public WebElement getReBackButton(){return getElement("reBackButton");}
}
