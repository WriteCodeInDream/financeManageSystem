package pageElements.OperateContractPage;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import enumString.ContractOperate;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;
import utils.ChooseDate;
import utils.GetLocator;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class AddContractPaymentPage extends BasePage {
    public WebElement cpp;
    public Random random = new Random();
    public AddContractPaymentPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.cpp = new ProjectManagePage(baseDriver).getOperateContent(ContractOperate.ADD_CONTRACT_PAYMENT.contractOperate, 1 );
    }

    // 主合同名称
    public WebElement getContractProjectName(){
        return getElementsByElement(cpp,"contractInfo").get(0);
    }

    // 主合同编号
    public WebElement getContractNumber(){
        return getElementsByElement(cpp, "contractInfo").get(1);
    }

    // 主合同金额
    public WebElement getContractAmount(){
        return getElementsByElement(cpp, "contractInfo").get(2);
    }

    // 主合同开票金额
    public WebElement getInvoiceAmount(){
        return getElementsByElement(cpp, "contractInfo").get(3);
    }

    // 主合同收款金额
    public WebElement getReceiveAmount(){
        return getElementsByElement(cpp, "contractInfo").get(4);
    }

    // 项目性质
    public WebElement getProjectNature(){
        return getElementsByElement(cpp, "contractInfo").get(5);
    }

    // 报账时间
    public WebElement getPaymentTime(){
        return getElementsByElement(cpp, "contentInput").get(0);
    }

    // 报账时间选择器
    public List<WebElement> getPaymentDateSelect(){
        clickElement(getPaymentTime());
        return baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl"));
    }

    // 获取所有row
    private List<WebElement> getBudgetRows(){
        return getElementsByElement(cpp, "tableRow");
    }

    // 根据index获取一行row
    private WebElement getRowByIndex(int index){
        return getBudgetRows().get(index);
    }

    // 根据子项名称获取一行row
    public WebElement getRowByName(ContractBudget name){
        return getRowByIndex(name.ordinal());
    }

    // 获取最终预算
    public WebElement getFinalBudgeByIndex(int index ){
        return getElementsByElement(getRowByIndex(index), "tableCell").get(1);
    }

    // 获取累积报账票据金额
    public WebElement getSumBillAmountByIndex(int index){
        return getElementsByElement(getRowByIndex(index), "tableCell").get(2);
    }

    // 获取累积付款金额
    public WebElement getSumPaymentAmountByIndex(int index){
        return getElementsByElement(getRowByIndex(index), "tableCell").get(3);
    }

    // 获取本次票据金额
    public WebElement getCurrentBillAmountByIndex(int index){
        return getElementsByElement(getRowByIndex(index), "contentInput").get(0);
    }

    // 获取本次付款金额
    public WebElement getCurrentPaymentAmountByIndex(int index){
        return getElementsByElement(getRowByIndex(index), "contentInput").get(1);
    }

    // 获取付款方输入框
    public WebElement getPayeeInputByIndex(int index){
        return getElementsByElement(getRowByIndex(index), "remarkInput").get(0);
    }

    // 付款附件操作按钮
    public WebElement getUpLoadFileButtonByIndex(int index){
        return getElementsByElement(getRowByIndex(index), "tableOperate").get(0);
    }

    // 附件下载操作按钮
    public WebElement getDownloadFileButtonByIndex(int index){
        int operateSize = getElementsByElement(getRowByIndex(index), "tableOperate").size();
        if( operateSize > 1){
            return getElementsByElement(getRowByIndex(index), "tableOperate").get(1);
        }
        throw new NoSuchElementException("当前没有附件可下载");
    }

    // 获取备注输入框
    public WebElement getRemarkInputByIndex(int index){
        return getElementsByElement(getRowByIndex(index), "remarkInput").get(1);
    }

    // 获取最终预算
    public WebElement getFinalBudgeByName(ContractBudget name){
        return getElementsByElement(getRowByName(name), "tableCell").get(1);
    }

    // 获取累积报账票据金额
    public WebElement getSumBillAmountByName(ContractBudget name){
        return getElementsByElement(getRowByName(name), "tableCell").get(2);
    }

    // 获取累积付款金额
    public WebElement getSumPaymentAmountByName(ContractBudget name){
        return getElementsByElement(getRowByName(name), "tableCell").get(3);
    }

    // 获取本次票据金额
    public WebElement getCurrentBillAmountByName(ContractBudget name){
        return getElementsByElement(getRowByName(name), "contentInput").get(0);
    }

    // 获取本次付款金额
    public WebElement getCurrentPaymentAmountByName(ContractBudget name){
        return getElementsByElement(getRowByName(name), "contentInput").get(1);
    }

    // 获取付款方输入框
    public WebElement getPayeeInputByName(ContractBudget name){
        return getElementsByElement(getRowByName(name), "remarkInput").get(0);
    }

    // 付款附件操作按钮
    public WebElement getUpLoadFileButtonByName(ContractBudget name){
        return getElementsByElement(getRowByName(name), "tableOperate").get(0);
    }

    // 附件下载操作按钮
    public WebElement getDownloadFileButtonByName(ContractBudget name){
        int operateSize = getElementsByElement(getRowByName(name), "tableOperate").size();
        if( operateSize > 1){
            return getElementsByElement(getRowByName(name), "tableOperate").get(1);
        }
        throw new NoSuchElementException("当前没有附件可下载");
    }

    // 获取备注输入框
    public WebElement getRemarkInputByName(ContractBudget name){
        return getElementsByElement(getRowByName(name), "remarkInput").get(1);
    }

}
