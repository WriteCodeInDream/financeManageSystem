package pageElementOperate.mainContractOperate;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import pageElementOperate.BaseOperate;
import pageElements.operateContractPage.PaymentDetailPage;

public class PaymentDetailOperate extends BaseOperate {
    public PaymentDetailPage pdp;
    public BaseDriver baseDriver;
    
    public PaymentDetailOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.pdp = new PaymentDetailPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(300);
    }

    /**
     *
     * @return  获取项目名称
     */
    public String getTextOfProjectName(){
        return getText(pdp.getContractProjectName());
    }

    // 合同编号
    public String getContractNumber(){
        return getText(pdp.getContractNumber());
    }

    // 合同金额
    public String getContractAmount(){
        return getText(pdp.getContractAmount());
    }

    // 开票金额
    public String getInvoiceAmount(){
        return getText(pdp.getInvoiceAmount());
    }

    // 收款金额
    public String getReceiveAmount(){
        return getText(pdp.getReceiveAmount());
    }

    // 项目性质
    public String getProjectNature(){
        return getText(pdp.getProjectNature());
    }

    // 通过行数返回预算
    public String getBudgetByIndex(int index){
        return getText(pdp.getFinalBudgetByIndex(index));
    }

    // 通过子项返回预算
    public String getBudgetByNameText(ContractBudget name){
        return getText(pdp.getFinalBudgetByName(name));
    }


    // 通过行数返回累计票据
    public String getTotalBillByIndexText(int index){
        return getText(pdp.getTotalBillByIndex(index));
    }

    // 通过子项返回累计票据
    public String getTotalBillByNameText(ContractBudget name){
        return getText(pdp.getTotalBillByName(name));
    }

    // 通过行数返回累计付款
    public String getTotalPaymentByIndexText(int index){
        return getText(pdp.getTotalPaymentByIndex(index));
    }

    // 通过子项返回累计付款
    public String getTotalPaymentByNameText(ContractBudget name){
        return getText(pdp.getTotalPaymentByName(name));
    }

    // 第几行的票据金额
    public String getBillAmountByIndexText(int index, int paymentIndex){
        return getText(pdp.getBillAmountByIndex(index ,paymentIndex));
    }

    // 子项的票据金额
    public String getBillAmountByNameText(ContractBudget name, int paymentIndex){
        return getText(pdp.getBillAmountByName(name ,paymentIndex));
    }
    

    // 第几行的付款金额
    public String getPaymentAmountByIndexText(int index, int paymentIndex){
        return getText(pdp.getPaymentAmountByIndex(index, paymentIndex));
    }

    // 子项的付款金额
    public String getPaymentAmountByNameText(ContractBudget name, int paymentIndex){
        return getText(pdp.getPaymentAmountByName(name ,paymentIndex));
    }

    // 通过行数名称返回收款方
    public String getReceiverNameByIndexText(int index, int paymentIndex){
        return getText(pdp.getReceiverByIndex(index, paymentIndex));
    }

    // 通过预算子项名称获取收款方
    public String getReceiverNameByNameText(ContractBudget name, int paymentIndex){
        return getText(pdp.getReceiverByName(name, paymentIndex));
    }

    // 通过行数获取备注
    public String getRemarkByIndexText(int index, int paymentIndex){
        return getText(pdp.getPaymentRemarkByIndex(index ,paymentIndex));
    }

    // 通过预算子项名称获取备注
    public String getRemarkByNameText(ContractBudget name, int paymentIndex){
        return getText(pdp.getPaymentRemarkByName(name, paymentIndex));
    }

    // 获取备注总体信息，参考示例 ： 2021-06-21报账(审批通过) 编辑 导出
    // 有些问题，只能获取第一个，可能是后面元素被挡住，不在页面内显示，只能获取第一个
    public String getPaymentInfo(int index){
        return getText(pdp.getOnePaymentTimeStatusOperate(index));
    }

    // 点击编辑按钮
    public void clickEditButton(int index){
        clickElement(pdp.getEdit(index));
    }

    // 点击导出按钮
    public void clickExportButton(int index){
        clickElement(pdp.getExport(index));
    }
}
