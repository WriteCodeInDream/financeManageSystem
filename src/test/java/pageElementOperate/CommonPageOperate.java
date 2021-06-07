package pageElementOperate;

import driverRelative.BaseDriver;
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

    public void clickContentCancelButton(){
        clickElement(cp.getContentCancelButton());
    }
    public void clickContentCloseButton(){
        clickElement(cp.getContentCloseButton());
    }
    public void clickContentCommitButton(){
        clickElement(cp.getContentCommitButton());
    }
    public void clickReturnButton(){clickElement(cp.getReBackButton());}
}
