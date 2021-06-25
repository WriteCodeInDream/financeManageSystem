package pageElementOperate.mainContractOperate;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import pageElementOperate.BaseOperate;
import pageElements.operateContractPage.EditPaymentPage;

public class EditPaymentOperate extends BaseOperate {
    public EditPaymentPage epp;
    public BaseDriver baseDriver;
    public EditPaymentOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.epp = new EditPaymentPage(baseDriver,1);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
    }

    /**
     *
     * @return  获取项目名称
     */
    public String getTextOfProjectName(){
        return getText(epp.getContractProjectName());
    }

    // 合同编号
    public String getContractNumber(){
        return getText(epp.getContractNumber());
    }

    // 合同金额
    public String getContractAmount(){
        return getText(epp.getContractAmount());
    }

    // 开票金额
    public String getSettlementAmount(){
        return getText(epp.getInvoiceAmount());
    }

    // 收款金额
    public String getReceiveAmount(){
        return getText(epp.getReceiveAmount());
    }

    // 项目性质
    public String getProjectNature(){
        return getText(epp.getProjectNature());
    }

    // 创建人
    public String getCreateNameText(){
        return getText(epp.getPaymentCreator());
    }

    // 创建时间
    public String getCreateTimeText(){
        return getText(epp.getPaymentTime());
    }

    // 申请部门
    public String getCreateDeptText(){
        return getText(epp.getPaymentDept());
    }

    // 通过行数获取总预算金额
    public String getBudgetTotalByIndex(int index){
        return getText(epp.getFinalBudgetByIndex(index));
    }

    // 通过子项名称获取预算金额
    public String getBudgetTotalByValue(ContractBudget value){
        return getText(epp.getFinalBudgetByName(value));
    }

    // 通过行数获取总票据金额
    public String getBillTotalByIndex(int index){
        return getText(epp.getTotalBillByIndex(index));
    }

    // 通过子项名称获取票据金额
    public String getBillTotalByName(ContractBudget name){
        return getText(epp.getTotalBillByName(name));
    }

    // 通过行数获取付款金额
    public String getPaymentTotalByIndex(int index){
        return getText(epp.getTotalPaymentByIndex(index));
    }

    // 通过子项获取总付款金额
    public String getPaymentTotalByName(ContractBudget name){
        return getText(epp.getTotalPaymentByName(name));
    }

    // 通过行数获取本次付款金额
    public String getBillAmountByIndex(int index){
        return getText(epp.getBillAmountByIndex(index));
    }

    // 通过名称获取付款金额
    public String getBillAmountByName(ContractBudget name) {
        return getText(epp.getBillAmountByName(name));
    }

    // 票据金额行数输入
    public void sendKeysToBillAmountByIndex(String value,int index){
        sendKeys(epp.getBillAmountByIndex(index), value);
    }

    // 票据金额子项名称输入
    public void sendKeysToBillAmountByName(String value, ContractBudget name){
        sendKeys(epp.getBillAmountByName(name), value);
    }

    // 通过行数获取付款金额
    public String getPaymentAmountByIndex(int index){
        return getText(epp.getPaymentAmountByIndex(index));
    }

    // 通过子项名称获取付款金额
    public String getPaymentAmountByName(ContractBudget name) {
        return getText(epp.getPaymentAmountByName(name));
    }

    // 通过行数输入付款金额
    public void sendKeysToPaymentAmountByIndex(String value,int index){
        sendKeys(epp.getPaymentAmountByIndex(index), value);
    }

    // 通过子项名称输入付款金额
    public void sendKeysToPaymentAmountByName(String value, ContractBudget name){
        sendKeys(epp.getPaymentAmountByName(name), value);
    }

    // 通过行数获取收款方
    public String getReceiverByIndex(int index){
        return getAttribute(epp.getReceiverByIndex(index));
    }

    // 通过子项获取收款方
    public String getReceiverByName(ContractBudget name) {
        return getAttribute(epp.getReceiverByName(name));
    }

    // 通过行数输入收款方
    public void sendKeysToReceiverByIndex(String value,int index){
        sendKeys(epp.getReceiverByIndex(index), value);
    }

    // 通过子项名称获取收款方
    public void sendKeysToReceiverByName(String value, ContractBudget name){
        sendKeys(epp.getReceiverByName(name), value);
    }

    // 通过行数获取备注
    public String getPaymentRemarkByIndex(int index){
        return getAttribute(epp.getPaymentRemarkByIndex(index));
    }

    // 通过子项名称获取备注
    public String getPaymentRemarkByName(ContractBudget name) {
        return getAttribute(epp.getPaymentRemarkByName(name));
    }

    //通过行数输入备注
    public void sendKeysToPaymentRemarkByIndex(String value,int index){
        sendKeys(epp.getPaymentRemarkByIndex(index), value);
    }

    // 通过子项输入备注
    public void sendKeysToPaymentRemarkByName(String value, ContractBudget name){
        sendKeys(epp.getPaymentRemarkByName(name), value);
    }
}
