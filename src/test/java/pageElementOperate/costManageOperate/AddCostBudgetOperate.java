package pageElementOperate.costManageOperate;

import driverRelative.BaseDriver;
import enumString.CostBudget;
import pageElementOperate.BaseOperate;
import pageElements.costManage.AddCostBudgetPage;

public class AddCostBudgetOperate extends BaseOperate {
    public AddCostBudgetPage cbp;
    public BaseDriver baseDriver;
    public AddCostBudgetOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.cbp = new AddCostBudgetPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
    }
    // 获取创建人信息
    public String getCreateName(){
        return getText(cbp.createName());
    }

    // 获取创建部门信息
    public String getCreateDept(){
        return getText(cbp.createDept());
    }

    // 通过行数输入预算金额
    public void sendKeysToAmountByIndex(int index, String amount){
        sendKeys(cbp.getAmountByIndex(index), amount);
    }

    // 通过子项名称输入预算金额
    public void sendKeysToAmountByName(CostBudget name, String amount){
        sendKeys(cbp.getAmountByName(name), amount);
    }

    // 通过行数输入备注
    public void sendKeysToRemarkByIndex(int index, String remark){
        sendKeys(cbp.getRemarkByIndex(index), remark);
    }

    // 通过子项名称输入备注
    public void sendKeysToRemarkByName(CostBudget name, String remark){
        sendKeys(cbp.getRemarkByName(name), remark);
    }
}
