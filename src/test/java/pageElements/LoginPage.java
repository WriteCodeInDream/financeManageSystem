package pageElements;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElementOperate.CommonPageOperate;
import pageHandle.LoginHandle;
import utils.GetEnvironment;
import utils.GetPage;

public class LoginPage extends BasePage{
    private CommonPageOperate cp;

    public LoginPage(BaseDriver baseDriver){
        super(baseDriver);
        this.cp = new CommonPageOperate(baseDriver);
        // 当前页面不含login 则登出至登录页面
        if(!baseDriver.getCurrentUrl().contains("login")){
            cp.loginOut();
        }
    }
    // 用户名输入框
    public WebElement usernameInput() {
        return getElement("usernameInput");
    }

    // 用户密码输入框
    public WebElement passwordInput() {
        return getElement("passwordInput");
    }

    // 登录按钮
    public WebElement loginButton(){
        return getElement("loginButton");
    }
}
