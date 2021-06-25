package pageElementOperate;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElements.CommonPage;

public class CommonPageOperate extends BaseOperate{
    public CommonPage cp;
    public CommonPageOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.cp = new CommonPage(baseDriver);
    }
    // 用户名称
    public String getUsernameElement(){
        return getText(cp.getUsernameElement());
    }

    // 更改密码
    public void clickChangePassword(){
        clickElement(cp.changePasswordElement());
    }

    // 关闭模态框
    public void clickCloseContent(){
        clickElement(cp.closeContent());
    }

    // 取消提交操作
    public void clickCancelContent(){
        clickElement(cp.cancelCommit());
    }

    // 点击提交
    public void clickCommitContent(){
        clickElement(cp.getConfirmButton());
    }

    // 二次确认弹窗关闭
    public void clickCloseMessage(){
        clickElement(cp.getCloseMessage());
    }

    // 二次确认弹窗取消操作
    public void clickCancelMessage(){
        clickElement(cp.getCancelMessage());
    }

    // 二次确认弹窗确认提交操作
    public void clickConfirmMessage(){
        clickElement(cp.getConfirmMessage());
    }

    // 登出
    public void loginOut(){
        clickElement(cp.loginOutElement());
    }

    // 点击返回按钮
    public void clickReturnButton(){clickElement(cp.getReBackButton());}
}
