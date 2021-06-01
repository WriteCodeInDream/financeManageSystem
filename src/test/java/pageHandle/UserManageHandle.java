package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.CommonPageOperate;
import pageElementOperate.UserManageOperate;
import pageElements.CommonPage;

public class UserManageHandle {
    public UserManageOperate umo;
    public CommonPageOperate cpo;
    public UserManageHandle(BaseDriver baseDriver){
        this.umo = new UserManageOperate(baseDriver);
        this.cpo = new CommonPageOperate(baseDriver);
    }

    public void getUserDept(){
        umo.sendKeysToAccountNameInput(cpo.getUsernameElement());
        umo.clickSearchButton();
        String dept = umo.getTextTableCell("用户部门", 0);
        System.out.println(dept);
    }
}
