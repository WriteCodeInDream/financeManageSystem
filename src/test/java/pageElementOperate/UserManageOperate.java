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

    // 点击新增用户按钮
    public void clickAddAccountButton(){
        clickElement(ump.getAddAccountButton());
    }

    // 输入账号
    public void sendKeysToAccountNameInput(String value){
        sendKeys(ump.getSearchInput("用户名称"),value);
    }

    // 输入名称
    public void sendKeysToAccountInput(String value){
        sendKeys(ump.getSearchInput("用户账号"),value);
    }

    // 点击查询按钮
   public void clickSearchButton(){
        clickElement(ump.getSearchButton());
   }

   // 获取单个单元和信息
   public String getTextTableCell(String tableCell, int index){
        return getText(ump.getTableCell(index ,tableCell));
   }

   // 点击编辑按钮
   public void clickEditButton(int index){
        clickElement(ump.getTableOperate(index, "编辑"));
   }

   // 点击重置密码按钮
   public void clickResetPasswordButton(int index){
        clickElement(ump.getTableOperate(index, "重置密码"));
   }
}
