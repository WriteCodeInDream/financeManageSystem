package pageElementOperate;

import driverRelative.BaseDriver;
import pageElements.UserManagePage;

public class UserManageOperate extends BaseOperate{
    public UserManagePage ump;
    public UserManageOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.ump = new UserManagePage(baseDriver);
        baseDriver.setRunSpeed(500);
    }

    public void clickAddAccountButton(){
        clickElement(ump.getAddAccountButton());
    }

    public void sendKeysToAccountNameInput(String value){
        sendKeys(ump.getSearchInput("用户名称"),value);
    }

    public void sendKeysToAccountInput(String value){
        sendKeys(ump.getSearchInput("用户账号"),value);
    }

   public void clickSearchButton(){
        clickElement(ump.getSearchButton());
   }

   public String getTextTableCell(String tableCell, int index){
        return getText(ump.getTableCell(index ,tableCell));
   }

   public void clickEditButton(int index){
        clickElement(ump.getTableOperate(index, "编辑"));
   }

   public void clickResetPasswordButton(int index){
        clickElement(ump.getTableOperate(index, "重置密码"));
   }
}
