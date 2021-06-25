package pageElements.operateContractPage;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;

import java.util.List;


public class EditPaymentPage extends BasePage {
    public PaymentDetailPage pdp;
    public WebElement epp;
    public EditPaymentPage(BaseDriver baseDriver, int index) {
        super(baseDriver);
        this.pdp = new PaymentDetailPage(baseDriver);
        clickElement(pdp.getEdit(index));
        this.epp = getElements("contentPage").get(1);
    }

    // 主合同名称
    public WebElement getContractProjectName(){
        return getElementsByElement(epp,"contractInfo").get(0);
    }

    // 主合同编号
    public WebElement getContractNumber(){
        return getElementsByElement(epp, "contractInfo").get(1);
    }

    // 主合同金额
    public WebElement getContractAmount(){
        return getElementsByElement(epp, "contractInfo").get(2);
    }

    // 主合同开票金额
    public WebElement getInvoiceAmount(){
        return getElementsByElement(epp, "contractInfo").get(3);
    }

    // 主合同收款金额
    public WebElement getReceiveAmount(){
        return getElementsByElement(epp, "contractInfo").get(4);
    }

    // 项目性质
    public WebElement getProjectNature(){
        return getElementsByElement(epp, "contractInfo").get(5);
    }

    // 报账时间
    public WebElement getPaymentTime(){
        return getElementsByElement(epp, "customInfo").get(0);
    }

    // 报账人
    public WebElement getPaymentCreator(){
        return getElementsByElement(epp, "customInfo" ).get(1);
    }

    // 报账部门
    public  WebElement getPaymentDept(){
        return getElementsByElement(epp, "customInfo").get(2);
    }

    // 获取所有的row
    private List<WebElement> getBudgetRows(){
        // System.out.println(getElementsByElement(epp, "tableRow").size());
        return getElementsByElement(epp, "tableRow");
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

    // 获取第几行的本次的票据金额
    public WebElement getBillAmountByIndex (int index){
        if(index < 2){
            return getElementsByElement(getRowByIndex(index), "tableCell").get(4);
        }
       return getElementsByElement(getRowByIndex(index), "input").get(0);
    }

    // 获取第几行的本次付款金额
    public WebElement getPaymentAmountByIndex(int index){
        if (index < 2){
            return getElementsByElement(getRowByIndex(index), "tableCell").get(5);
        }
        return getElementsByElement(getRowByIndex(index), "input").get(1);
    }

    public WebElement getReceiverByIndex(int index){
        return getElementsByElement(getRowByIndex(index), "remarkInput").get(0);
    }

    public WebElement getPaymentRemarkByIndex(int index){
        return getElementsByElement(getRowByIndex(index), "remarkInput").get(1);
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
    public WebElement getBillAmountByName(ContractBudget name){
        if(name == ContractBudget.RYF || name == ContractBudget.YSHJ){
            return getElementsByElement(getRowByValue(name), "tableCell").get(4);

        }
        return getElementsByElement(getRowByValue(name), "input").get(0);
    }

    // 获取子项的第几个付款金额
    public WebElement getPaymentAmountByName(ContractBudget name){
        if(name == ContractBudget.RYF || name == ContractBudget.YSHJ){
            return getElementsByElement(getRowByValue(name), "tableCell").get(5);

        }
        return getElementsByElement(getRowByValue(name), "input").get(1);
    }

    // 获取子项的第几个收款方
    public WebElement getReceiverByName(ContractBudget name){
        return getElementsByElement(getRowByValue(name), "remarkInput").get(0 );
    }

    // 获取子项的第几个备注
    public WebElement getPaymentRemarkByName(ContractBudget name){
        return getElementsByElement(getRowByValue(name), "remarkInput").get(1 );
    }

}
