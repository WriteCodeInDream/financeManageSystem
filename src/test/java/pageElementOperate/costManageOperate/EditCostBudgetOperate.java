package pageElementOperate.costManageOperate;

import driverRelative.BaseDriver;
import enumString.CostBudget;
import pageElementOperate.BaseOperate;
import pageElements.costManage.EditCostBudgetPage;

public class EditCostBudgetOperate extends BaseOperate {
    public EditCostBudgetPage cbp;
    public BaseDriver baseDriver;
    public EditCostBudgetOperate(BaseDriver baseDriver, int index) {
        super(baseDriver);
        this.baseDriver = baseDriver;
        this.cbp = new EditCostBudgetPage(baseDriver, index);
        baseDriver.setRunSpeed(200);
    }

    // 获取创建时间信息
    public String getTextOfCreateTime(){
        return getText(cbp.getCreateTime());
    }

    // 获取申请部门信息
    public String getTextOfCreateDept(){
        return getText(cbp.getCreateDept());
    }

    // 获取创建人信息
    public String getTestOfCreateName(){
        return getText(cbp.getCreateName());
    }

    // 通过行数获取预算金额
    public String getTextOfBudgetAmountByIndex(int index){
        return getText(cbp.getBudgetAmountByIndex(index));
    }

    // 通过子项名称获取预算金额
    public String getTextOfBudgetAmountByName(CostBudget name){
        return getText(cbp.getBudgetAmountByName(name));
    }

    // 通过行数获取调整后预算金额
    public String getTextOfBudgetAfterByIndex(int index){
        return getText(cbp.getBudgetAfterByIndex(index));
    }

    // 通过子项名称获取调整后预算金额
    public String getTextOfBudgetAfterByName(CostBudget name){
        return getText(cbp.getBudgetAfterByName(name));
    }

    // 通过行数获取调整预算金额
    public String getTextOfAdjustAmountByIndex(int index){
        return getText(cbp.getAdjustAmountByIndex(index));
    }

    // 通过子项名称获取预算金额
    public String getTextOfAdjustAmountByName(CostBudget name){
        return getText(cbp.getAdjustAmountByName(name));
    }

    // 通过行数输入调整预算金额
    public void sendKeysToAdjustAmountByIndex(int index, String value){
        sendKeys(cbp.getAdjustAmountByIndex(index),value);
    }

    // 通过子项名称输入调整预算金额
    public void sendKeysToAdjustAmountByName(CostBudget name, String value){
        sendKeys(cbp.getAdjustAmountByName(name),value);
    }

    // 通过行数获取预算备注
    public String getTextOfBudgetRemarkByIndex(int index){
        return getAttribute(cbp.getBudgetRemarkByIndex(index));
    }

    // 通过子项名称获取预算备注
    public String getTextOfBudgetRemarkByName(CostBudget name){
        return getAttribute(cbp.getBudgetRemarkByName(name));
    }

    // 通过行数输入预算子项备注
    public void sendKeysToBudgetRemarkByIndex(int index, String value){
        sendKeys(cbp.getBudgetRemarkByIndex(index),value);
    }

    // 通过子项名称输入预算子项备注
    public void sendKeysToBudgetRemarkByName(CostBudget name, String value){
        sendKeys(cbp.getBudgetRemarkByName(name),value);
    }

}
