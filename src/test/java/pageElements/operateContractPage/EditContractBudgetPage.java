package pageElements.operateContractPage;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import enumString.ContractOperate;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;

import java.util.List;

public class EditContractBudgetPage extends BasePage {
    public WebElement ebp;
    public EditContractBudgetPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.ebp = new ProjectManagePage(baseDriver).getOperatePage(ContractOperate.EDIT_CONTRACT_BUDGET.contractOperate, 1);
    }
    // 主合同名称
    public WebElement getContractProjectName(){
        return getElementsByElement(ebp,"contractInfo").get(0);
    }

    // 主合同编号
    public WebElement getContractNumber(){
        return getElementsByElement(ebp, "contractInfo").get(1);
    }

    // 主合同金额
    public WebElement getContractAmount(){
        return getElementsByElement(ebp, "contractInfo").get(2);
    }

    // 主合同开票金额
    public WebElement getInvoiceAmount(){
        return getElementsByElement(ebp, "contractInfo").get(3);
    }

    // 主合同收款金额
    public WebElement getReceiveAmount(){
        return getElementsByElement(ebp, "contractInfo").get(4);
    }

    // 项目性质
    public WebElement getProjectNature(){
        return getElementsByElement(ebp, "contractInfo").get(5);
    }

    // 获取所有行 总共29 行 1 人员费 0 报账合计 28 辅助登记备用金
    public List<WebElement> getBudgetRows(){
        return getElementsByElement(ebp, "tableRow");
    }

    // 通过index 获取某一行
    private WebElement getRowByIndex(int index){
        return getBudgetRows().get(index);
    }

    // 通过子项名称获取某一行
    private WebElement getRowByValue(ContractBudget name){
    return getRowByIndex(name.ordinal());
    }

    // 通过名称获取预算金额
    public WebElement getBudgetAmountByName(ContractBudget name){
        return  getElementsByElement(getRowByValue(name),"tableCell").get(1);
    }

    // 通过名称获取调整预算百分比输入框
    public WebElement getBudgetAdjustPercentByName(ContractBudget name){
        return  getElementsByElement(getRowByValue(name),"contentInput").get(0);
    }
    // 通过名称获取调整预算金额输入框
    public WebElement getBudgetAdjustAmountByName(ContractBudget name){
        return  getElementsByElement(getRowByValue(name),"contentInput").get(1);
    }

    // 通过名称获取调整后预算金额
    public WebElement getBudgetAfterAdjustByName(ContractBudget name){
        return  getElementsByElement(getRowByValue(name),"tableCell").get(4);
    }

    // 通过名称获取备注输入框
    public WebElement getBudgetRemarkByName(ContractBudget name){
        return  getElementByElement(getRowByValue(name),"remarkInput");
    }

    // 通过第几（index+1）行获取预算金额
    public WebElement getBudgetAmountByIndex(int index){
        return  getElementsByElement(getRowByIndex(index),"tableCell").get(1);
    }

    // 通过第几（index+1）行获取调整预算百分比输入框
    public WebElement getBudgetAdjustPercentByIndex(int index){
        return  getElementsByElement(getRowByIndex(index),"contentInput").get(0);
    }
    // 通过第几（index+1）行获取调整预算金额输入框
    public WebElement getBudgetAdjustAmountByIndex(int index){
        return  getElementsByElement(getRowByIndex(index),"contentInput").get(1);
    }

    // 通过第几（index+1）行获取调整后预算金额
    public WebElement getBudgetAfterAdjustByIndex(int index){
        return  getElementsByElement(getRowByIndex(index),"tableCell").get(4);
    }

    // 通过第几（index+1）行获取备注输入框
    public WebElement getBudgetRemarkByIndex(int index){
        return  getElementByElement(getRowByIndex(index),"remarkInput");
    }

}
