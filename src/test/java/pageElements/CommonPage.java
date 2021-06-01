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
}
