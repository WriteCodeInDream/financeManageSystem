package pageElements;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import utils.GetDownList;

public class CommonPage extends BasePage{
    public CommonPage(BaseDriver baseDriver) {
        super(baseDriver);
    }

    // 用户信息，页面右上角
    public WebElement getUsernameElement(){
        return getElement("usernameInfo");
    }

    // 修改用户密码
    public WebElement changePasswordElement(){
        clickElement(getUsernameElement());
        return GetDownList.getUserList(baseDriver).get(0);
    }

    // 登出
    public WebElement loginOutElement(){
        clickElement(getUsernameElement());
        return GetDownList.getUserList(baseDriver).get(1);
    }

    // 关闭模态框
    public WebElement closeContent(){
        return getElementByElement(getElement("contentPage"),"closeButton");
    }

    // 取消操作
    public WebElement cancelCommit(){
        return getElementByElement(getElement("contentPage"),"cancelButton");
    }

    // 提交数据
    public WebElement getConfirmButton(){
        return getElementByElement(getElement("contentPage"),"commitButton");
    }

    // 关闭确认信息
    public WebElement getCloseMessage(){
        return getElementByElement(getElement("messagePage"), "closeMessage");
    }

    // 取消操作
    public WebElement getCancelMessage(){
        return getElementByElement(getElement("messagePage") ,"cancelMessage");
    }

    // 确认提交操作
    public WebElement getConfirmMessage(){
        return getElementByElement(getElement("messagePage"), "confirmMessage");
    }

    // 页面点击返回按钮
    public WebElement getReBackButton(){return getElement("reBackButton");}
}
