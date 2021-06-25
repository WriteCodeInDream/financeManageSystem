package pageElements.operateContractPage;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import enumString.ContractOperate;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;

import java.util.List;

public class PaymentDetailPage extends BasePage {
    public WebElement pdp;
    public PaymentDetailPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.pdp = new ProjectManagePage(baseDriver).getOperateContent(ContractOperate.VIEW_CONTRACT_PAYMENT.contractOperate, 1);
    }
    
    // 主合同名称
    public WebElement getContractProjectName(){
        return getElementsByElement(pdp,"contractInfo").get(0);
    }

    // 主合同编号
    public WebElement getContractNumber(){
        return getElementsByElement(pdp, "contractInfo").get(1);
    }

    // 主合同金额
    public WebElement getContractAmount(){
        return getElementsByElement(pdp, "contractInfo").get(2);
    }

    // 主合同开票金额
    public WebElement getInvoiceAmount(){
        return getElementsByElement(pdp, "contractInfo").get(3);
    }

    // 主合同收款金额
    public WebElement getReceiveAmount(){
        return getElementsByElement(pdp, "contractInfo").get(4);
    }

    // 项目性质
    public WebElement getProjectNature(){
        return getElementsByElement(pdp, "contractInfo").get(5);
    }

    // 获取所有的row
    private List<WebElement> getBudgetRows(){
        // System.out.println(getElementsByElement(pdp, "tableRow").size());
        return getElementsByElement(pdp, "tableRow");
    }
    // 根据index 获取一行row
    private WebElement getRowByIndex(int index){
        return getBudgetRows().get(index);
    }

    // 根据子项名称获取一行row
    public WebElement getRowByValue(ContractBudget name){
        return getRowByIndex(name.ordinal());
    }

    // 获取第几行的预算合计金额
    public WebElement getFinalBudgetByIndex(int index){
        return getElementsByElement(getRowByIndex(index),"tableCell").get(1);
    }

    // 通过第几行获取票据金额累计
    public WebElement getTotalBillByIndex(int index){
        return getElementsByElement(getRowByIndex(index), "tableCell").get(2);
    }

    // 获取第几行的累计付款金额
    public WebElement getTotalPaymentByIndex(int index){
        return getElementsByElement(getRowByIndex(index), "tableCell").get(3);
    }

    // 获取第几行的第几个的票据金额
    public WebElement getBillAmountByIndex (int index, int paymentIndex){
        return getElementsByElement(getRowByIndex(index), "tableCell").get(paymentIndex * 5 - 1);
    }

    // 获取第几行的第几个付款金额
    public WebElement getPaymentAmountByIndex(int index, int paymentIndex){
        return getElementsByElement(getRowByIndex(index), "tableCell").get(paymentIndex * 5);
    }

    public WebElement getReceiverByIndex(int index , int paymentIndex){
        return getElementsByElement(getRowByIndex(index), "tableCell").get(paymentIndex * 5 + 1);
    }

    public WebElement getPaymentRemarkByIndex(int index ,int paymentIndex){
        return getElementsByElement(getRowByIndex(index), "tableCell").get(paymentIndex * 5 + 3);
    }

    // 获取子项的预算合计金额
    public WebElement getFinalBudgetByName(ContractBudget name){
        return getElementsByElement(getRowByValue(name),"tableCell").get(1);
    }

    // 通过子项获取票据金额累计
    public WebElement getTotalBillByName(ContractBudget name){
        return getElementsByElement(getRowByValue(name), "tableCell").get(2);
    }

    // 获取子项的累计付款金额
    public WebElement getTotalPaymentByName(ContractBudget name){
        return getElementsByElement(getRowByValue(name), "tableCell").get(3);
    }

    // 获取子项的第几个的票据金额
    public WebElement getBillAmountByName(ContractBudget name, int paymentIndex){
        return getElementsByElement(getRowByValue(name), "tableCell").get(paymentIndex * 5 - 1);
    }

    // 获取子项的第几个付款金额
    public WebElement getPaymentAmountByName(ContractBudget name, int paymentIndex){
        return getElementsByElement(getRowByValue(name), "tableCell").get(paymentIndex * 5);
    }

    // 获取子项的第几个收款方
    public WebElement getReceiverByName(ContractBudget name, int paymentIndex){
        return getElementsByElement(getRowByValue(name), "tableCell").get(paymentIndex * 5 + 1 );
    }

    // 获取子项的第几个备注
    public WebElement getPaymentRemarkByName(ContractBudget name, int paymentIndex){
        return getElementsByElement(getRowByValue(name), "tableCell").get(paymentIndex * 5 + 3 );
    }


    // 获取付款详情表头
    private WebElement getPaymentHeader(){
        return getElementByElement(pdp, "paymentHeader");
    }

    // 获取付款日期， 审批状态，操作那一个单元格
    private WebElement getAllPaymentTimeStatusOperate(){
        return getElementsByElement(getPaymentHeader(), "tableTr").get(0);
    }

    // 获取一个付款单元格  2021-06-21报账（审批通过） 编辑、导出 这个单元格
    public WebElement getOnePaymentTimeStatusOperate(int index){
        return getElementsByElement(getAllPaymentTimeStatusOperate(), "tableTh").get(index + 2);
    }


    // 获取单个付款的编辑导出操作，只有一个时，为导出，有两个时，第一个为编辑，第二个为导出
    private List<WebElement> getPaymentOperate(int index){
        return getElementsByElement(getOnePaymentTimeStatusOperate(index),"tableOperate");
    }

    // 编辑按钮
    public WebElement getEdit(int index){
        return getPaymentOperate(index).get(0);
    }

    // 导出按钮
    public WebElement getExport(int index){
        if (getPaymentOperate(index).size() == 2){
            return getPaymentOperate(index).get(1);
        }
        return getPaymentOperate(index).get(0);
    }

}
