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
    public String getUsernameElement(){
        return getText(cp.getUsernameElement());
    }

    public void clickChangePassword(){
        clickElement(cp.changePasswordElement());
    }

    public void clickCloseContent(){
        clickElement(cp.closeContent());
    }

    public void clickCancelContent(){
        clickElement(cp.cancelCommit());
    }

    public void clickCommitContent(){
        clickElement(cp.getConfirmButton());
    }

    public void clickCloseMessage(){
        clickElement(cp.getCloseMessage());
    }

    public void clickCancelMessage(){
        clickElement(cp.getCancelMessage());
    }

    public void clickConfirmMessage(){
        clickElement(cp.getConfirmMessage());
    }
    public void loginOut(){
        clickElement(cp.loginOutElement());
    }

    public void clickReturnButton(){clickElement(cp.getReBackButton());}
}
