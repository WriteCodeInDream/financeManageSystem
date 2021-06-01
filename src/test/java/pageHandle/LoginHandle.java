package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.LoginElementOperate;

public class LoginHandle {
    public LoginElementOperate loginElementOperate;

    public LoginHandle(BaseDriver baseDriver){
        this.loginElementOperate = new LoginElementOperate(baseDriver);
    }
    public void handleLogin(String username, String password){
        loginElementOperate.sendKeysToUsernameInput(username);
        loginElementOperate.sendKeyToPasswordInput(password);
        loginElementOperate.clickLoginButton();
    }
}
