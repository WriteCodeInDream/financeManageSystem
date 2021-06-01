package pageElementOperate;


import driverRelative.BaseDriver;
import pageElements.LoginPage;

public class LoginElementOperate extends BaseOperate{

    public LoginPage loginPage;

    public LoginElementOperate(BaseDriver baseDriver){
        super(baseDriver);
        this.loginPage = new LoginPage(baseDriver);
        baseDriver.setRunSpeed(2500);
    }
    public void sendKeysToUsernameInput(String username){
        sendKeys(loginPage.usernameInput(),username);
    }

    public void sendKeyToPasswordInput(String password){
        sendKeys(loginPage.passwordInput(),password);
    }
    public void clickLoginButton(){
        clickElement(loginPage.loginButton());
    }
}
