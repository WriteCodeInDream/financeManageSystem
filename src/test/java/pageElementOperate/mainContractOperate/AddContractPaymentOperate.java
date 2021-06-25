package pageElementOperate.mainContractOperate;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import pageElementOperate.BaseOperate;
import pageElements.operateContractPage.AddContractPaymentPage;

public class AddContractPaymentOperate extends BaseOperate {
    public AddContractPaymentPage app;
    public BaseDriver baseDriver;
    public AddContractPaymentOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.app = new AddContractPaymentPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(300);
    }

    /**
     *
     * @return 返回主合同编号
     */
    public String getContractNumber(){
        return getText(app.getContractNumber());
    }

    /**
     *
     * @return 项目名称
     */
    public String getProjectName(){
        return getText(app.getContractProjectName());
    }

    /**
     *
     * @return 返回主合同金额
     */
    public String getContractAmount(){
        return getText(app.getContractAmount());
    }

    /**
     *
     * @return 获取开票金额
     */
    public String getInvoiceAmount() {
        return getText(app.getInvoiceAmount());
    }

    /**
     *
     * @return 主合同收款金额
     */
    public String getReceiveAmount(){
        return getText(app.getReceiveAmount());
    }

    /**
     *
     * @return 获取项目性质
     */
    public String getProjectNature(){
        return getText(app.getProjectNature());
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

    // 根据行数获取付款收款方
    public void sendKeysToPayeeInputByIndex(int index, String value){
        sendKeys(app.getPayeeInputByIndex(index), value);
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
    public String getFinalBudgetByName(ContractBudget name){
        return getText(app.getFinalBudgeByName(name));
    }

    // 根据预算子项获取累积票据金额
    public String getSumBillAmountByName(ContractBudget name){
        return getText(app.getSumBillAmountByName(name));
    }

    // 根据预算子项获取累积付款金额
    public String getSumPaymentAmountByName(ContractBudget name){
        return getText(app.getSumPaymentAmountByName(name));
    }

    // 根据预算子项获取本次票据金额
    public void sendKeysToCurrentBillAmountByName(ContractBudget name, String value){
        sendKeys(app.getCurrentBillAmountByName(name), value);
    }

    // 根据预算子项获取本次付款金额
    public void sendKeysToCurrentPaymentAmountByName(ContractBudget name, String value){
        sendKeys(app.getCurrentPaymentAmountByName(name), value);
    }

    // 根据预算子项获取付款收款方
    public void sendKeysToPayeeInputByName(ContractBudget name, String value){
        sendKeys(app.getPayeeInputByName(name), value);
    }

    // 根据预算子项获取操作附件按钮
    public void clickOperateButtonByName(ContractBudget name){
        clickElement(app.getUpLoadFileButtonByName(name));
    }

    // 根据预算子项获取下载附件按钮
    public void clickDownloadButtonByName(ContractBudget name){
        clickElement(app.getDownloadFileButtonByName(name));
    }

    // 根据预算子项获取备注输入框
    public void sendKeysToRemarkInputByName(ContractBudget name, String value){
        sendKeys(app.getRemarkInputByName(name), value);
    }

}
