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
    // 输入用户名
    public void sendKeysToUsernameInput(String username){
        sendKeys(loginPage.usernameInput(),username);
    }

    // 输入密码
    public void sendKeyToPasswordInput(String password){
        sendKeys(loginPage.passwordInput(),password);
    }

    // 点击登录按钮
    public void clickLoginButton(){
        clickElement(loginPage.loginButton());
    }
}
