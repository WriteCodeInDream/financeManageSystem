package pageElementOperate;

import driverRelative.BaseDriver;
import pageElements.CommonPage;

public class CommonOperate extends BaseOperate{
    public CommonPage cp;

    public CommonOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.cp = new CommonPage(baseDriver);
    }

    public String getUsername(){
        return getText(cp.getUsernameElement());
    }
}
