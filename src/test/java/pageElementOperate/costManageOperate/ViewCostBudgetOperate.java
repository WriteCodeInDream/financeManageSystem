package pageElementOperate.costManageOperate;

import driverRelative.BaseDriver;
import enumString.CostBudget;
import pageElementOperate.BaseOperate;
import pageElements.costManage.ViewCostBudgetPage;

public class ViewCostBudgetOperate extends BaseOperate {
    public ViewCostBudgetPage cbp;
    public BaseDriver baseDriver;
    public ViewCostBudgetOperate(BaseDriver baseDriver, int index) {
        super(baseDriver);
        this.cbp = new ViewCostBudgetPage(baseDriver,index);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
    }

    // 获取创建时间
    public String getCreateTime(){
        return getText(cbp.budgetTime());
    }

    // 获取创建人信息
    public String getCreateName(){
        return getText(cbp.createName());
    }

    // 获取创建人部门信息
    public String getCreateDept(){
        return getText(cbp.createDept());
    }

    // 通过行数获取预算金额
    public String getBudgetAmountByIndex(int index){
        return getText(cbp.getAmountByIndex(index));
    }

    // 通过子项名称获取预算金额
    public String getBudgetAmountByName(CostBudget name){
        return getText(cbp.getAmountByName(name));
    }

    // 通过行数获取预算子项备注
    public String getBudgetRemarkByIndex(int index){
        return getText(cbp.getRemarkByIndex(index));
    }

    // 通过子项名称获取预算子项备注
    public String getBudgetRemarkByName(CostBudget name){
        return getText(cbp.getRemarkByName(name));
    }
}
