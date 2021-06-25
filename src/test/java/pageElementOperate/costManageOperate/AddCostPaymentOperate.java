package pageElementOperate.costManageOperate;

import driverRelative.BaseDriver;
import enumString.CostBudget;
import pageElementOperate.BaseOperate;
import pageElements.costManage.AddCostPaymentPage;

public class AddCostPaymentOperate extends BaseOperate {
    public AddCostPaymentPage app;
    public BaseDriver baseDriver;
    public AddCostPaymentOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.app = new AddCostPaymentPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(300);
    }

    public String getCreateInfo(){
        return getText(app.getCreateName());
    }

    public String getCreateDept(){
        return getText(app.getCreateDept());
    }
    
    /**
     * 根据行数获取最终预算
     * @param index 行数-1
     * @return 最终预算子项
     */
    public String getFinalBudgetByIndex(int index){
        return getText(app.getFinalBudgeByIndex(index));
    }

    /**
     *  根据行数获取累积票据金额
     * @param index 行数-1
     * @return 累积票据金额
     */
    public String getSumBillAmountByIndex(int index){
        return getText(app.getSumBillAmountByIndex(index));
    }

    // 根据行数获取累积付款金额
    public String getSumPaymentAmountByIndex(int index){
        return getText(app.getSumPaymentAmountByIndex(index));
    }

    // 根据行数获取本次票据金额
    public void sendKeysToCurrentBillAmountByIndex(int index, String value){
        sendKeys(app.getCurrentBillAmountByIndex(index), value);
    }

    // 根据行数获取本次付款金额
    public void sendKeysToCurrentPaymentAmountByIndex(int index, String value){
        sendKeys(app.getCurrentPaymentAmountByIndex(index), value);
    }


    // 根据行数获取操作附件按钮
    public void clickOperateButtonByIndex(int index){
        clickElement(app.getUpLoadFileButtonByIndex(index));
    }

    // 根据行数获取下载附件按钮
    public void clickDownloadButtonByIndex(int index){
        clickElement(app.getDownloadFileButtonByIndex(index));
    }

    // 根据行数获取备注输入框
    public void sendKeysToRemarkInputByIndex(int index, String value){
        sendKeys(app.getRemarkInputByIndex(index), value);
    }

    // 根据预算子项获取最终预算
    public String getFinalBudgetByName(CostBudget name){
        return getText(app.getFinalBudgeByName(name));
    }

    // 根据预算子项获取累积票据金额
    public String getSumBillAmountByName(CostBudget name){
        return getText(app.getSumBillAmountByName(name));
    }

    // 根据预算子项获取累积付款金额
    public String getSumPaymentAmountByName(CostBudget name){
        return getText(app.getSumPaymentAmountByName(name));
    }

    // 根据预算子项获取本次票据金额
    public void sendKeysToCurrentBillAmountByName(CostBudget name, String value){
        sendKeys(app.getCurrentBillAmountByName(name), value);
    }

    // 根据预算子项获取本次付款金额
    public void sendKeysToCurrentPaymentAmountByName(CostBudget name, String value){
        sendKeys(app.getCurrentPaymentAmountByName(name), value);
    }

    // 根据预算子项获取操作附件按钮
    public void clickOperateButtonByName(CostBudget name){
        clickElement(app.getUpLoadFileButtonByName(name));
    }

    // 根据预算子项获取下载附件按钮
    public void clickDownloadButtonByName(CostBudget name){
        clickElement(app.getDownloadFileButtonByName(name));
    }

    // 根据预算子项获取备注输入框
    public void sendKeysToRemarkInputByName(CostBudget name, String value){
        sendKeys(app.getRemarkInputByName(name), value);
    }

}
