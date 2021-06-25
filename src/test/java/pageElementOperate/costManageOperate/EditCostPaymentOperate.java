package pageElementOperate.costManageOperate;

import driverRelative.BaseDriver;
import enumString.CostBudget;
import enumString.CostBudget;
import pageElementOperate.BaseOperate;
import pageElements.costManage.EditCostPaymentPage;
import pageElements.operateContractPage.EditPaymentPage;

public class EditCostPaymentOperate extends BaseOperate {
    public EditCostPaymentPage epp;
    public BaseDriver baseDriver;
    public EditCostPaymentOperate(BaseDriver baseDriver,int index) {
        super(baseDriver);
        this.epp = new EditCostPaymentPage(baseDriver,index);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
    }

    // 获取创建时间信息
    public String getTextOfCreateTime(){
        return getText(epp.getCreateTime());
    }

    // 获取申请部门信息
    public String getTextOfCreateDept(){
        return getText(epp.getCreateDept());
    }

    // 获取创建人信息
    public String getTestOfCreateName(){
        return getText(epp.getCreateName());
    }
    // 通过行数获取总预算金额
    public String getBudgetTotalByIndex(int index){
        return getText(epp.getFinalBudgetByIndex(index));
    }

    // 通过子项名称获取预算金额
    public String getBudgetTotalByValue(CostBudget value){
        return getText(epp.getFinalBudgetByName(value));
    }

    // 通过行数获取总票据金额
    public String getBillTotalByIndex(int index){
        return getText(epp.getTotalBillByIndex(index));
    }

    // 通过子项名称获取票据金额
    public String getBillTotalByName(CostBudget name){
        return getText(epp.getTotalBillByName(name));
    }

    // 通过行数获取付款金额
    public String getPaymentTotalByIndex(int index){
        return getText(epp.getTotalPaymentByIndex(index));
    }

    // 通过子项获取总付款金额
    public String getPaymentTotalByName(CostBudget name){
        return getText(epp.getTotalPaymentByName(name));
    }

    // 通过行数获取本次付款金额
    public String getBillAmountByIndex(int index){
        return getText(epp.getBillAmountByIndex(index));
    }

    // 通过名称获取付款金额
    public String getBillAmountByName(CostBudget name) {
        return getText(epp.getBillAmountByName(name));
    }

    // 票据金额行数输入
    public void sendKeysToBillAmountByIndex(String value,int index){
        sendKeys(epp.getBillAmountByIndex(index), value);
    }

    // 票据金额子项名称输入
    public void sendKeysToBillAmountByName(String value, CostBudget name){
        sendKeys(epp.getBillAmountByName(name), value);
    }

    // 通过行数获取付款金额
    public String getPaymentAmountByIndex(int index){
        return getText(epp.getPaymentAmountByIndex(index));
    }

    // 通过子项名称获取付款金额
    public String getPaymentAmountByName(CostBudget name) {
        return getText(epp.getPaymentAmountByName(name));
    }

    // 通过行数输入付款金额
    public void sendKeysToPaymentAmountByIndex(String value,int index){
        sendKeys(epp.getPaymentAmountByIndex(index), value);
    }

    // 通过子项名称输入付款金额
    public void sendKeysToPaymentAmountByName(String value, CostBudget name){
        sendKeys(epp.getPaymentAmountByName(name), value);
    }


    // 通过行数获取备注
    public String getPaymentRemarkByIndex(int index){
        return getAttribute(epp.getPaymentRemarkByIndex(index));
    }

    // 通过子项名称获取备注
    public String getPaymentRemarkByName(CostBudget name) {
        return getAttribute(epp.getPaymentRemarkByName(name));
    }

    //通过行数输入备注
    public void sendKeysToPaymentRemarkByIndex(String value,int index){
        sendKeys(epp.getPaymentRemarkByIndex(index), value);
    }

    // 通过子项输入备注
    public void sendKeysToPaymentRemarkByName(String value, CostBudget name){
        sendKeys(epp.getPaymentRemarkByName(name), value);
    }
}
