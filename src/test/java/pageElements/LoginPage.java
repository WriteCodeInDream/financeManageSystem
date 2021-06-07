package pageElements;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import pageHandle.LoginHandle;
import utils.GetEnvironment;
import utils.GetPage;

public class LoginPage extends BasePage{


    public LoginPage(BaseDriver baseDriver){
        super(baseDriver);
        if(!baseDriver.getCurrentUrl().contains("login")){
            switchToPage(GetPage.getValue("loginPage"));
        }
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
