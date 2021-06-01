package pageElements;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{


    public LoginPage(BaseDriver baseDriver){
        super(baseDriver);
    }

    public WebElement usernameInput() {
        return getElement("usernameInput");
    }
    public WebElement passwordInput() {
        return getElement("passwordInput");
    }
    public WebElement loginButton(){
        return getElement("loginButton");
    }
}
