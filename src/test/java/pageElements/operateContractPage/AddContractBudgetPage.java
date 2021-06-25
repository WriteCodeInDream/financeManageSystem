package pageElements.operateContractPage;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import enumString.ContractOperate;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;

import java.util.List;

public class AddContractBudgetPage extends BasePage {
    public WebElement cbp;
    public AddContractBudgetPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.cbp = new ProjectManagePage(baseDriver).getOperateContent(ContractOperate.ADD_CONTRACT_BUDGET.contractOperate, 0);
    }

    // 主合同名称
    public WebElement getContractProjectName(){
        return getElementsByElement(cbp,"contractInfo").get(0);
    }

    // 主合同编号
    public WebElement getContractNumber(){
        return getElementsByElement(cbp, "contractInfo").get(1);
    }

    // 主合同金额
    public WebElement getContractAmount(){
        return getElementsByElement(cbp, "contractInfo").get(2);
    }

    // 主合同开票金额
    public WebElement getInvoiceAmount(){
        return getElementsByElement(cbp, "contractInfo").get(3);
    }

    // 主合同收款金额
    public WebElement getReceiveAmount(){
        return getElementsByElement(cbp, "contractInfo").get(4);
    }

    // 项目性质
    public WebElement getProjectNature(){
        return getElementsByElement(cbp, "contractInfo").get(5);
    }

    // 获取所有的row
    private List<WebElement> getBudgetRows(){
        // System.out.println(getElementsByElement(cbp, "tableRow").size());
        return getElementsByElement(cbp, "tableRow");
    }
     // 根据index 获取一行row
    private WebElement getRowByIndex(int index){
       // System.out.println(getElementsByElement(cbp, "tableRow").size());
        return getBudgetRows().get(index);
    }
    // 根据子项名称获取一行row
    public WebElement getRowByValue(ContractBudget name){
        return getRowByIndex(name.ordinal());
    }


    // 通过名称获取调整预算百分比输入框
    public WebElement getBudgetAdjustPercentByName(ContractBudget name){
        return  getElementsByElement(getRowByValue(name),"contentInput").get(0);
    }
    // 通过名称获取调整预算金额输入框
    public WebElement getBudgetAdjustAmountByName(ContractBudget name){
        return  getElementsByElement(getRowByValue(name),"contentInput").get(1);
    }


    // 通过名称获取备注输入框
    public WebElement getBudgetRemarkByName(ContractBudget name){
        return  getElementByElement(getRowByValue(name),"remarkInput");
    }


    // 通过第几（index+1）行获取调整预算百分比输入框    1 ：其中技术绩效
    public WebElement getBudgetAdjustPercentByIndex(int index){
        return  getElementsByElement(getRowByIndex(index),"contentInput").get(0);
    }
    // 通过第几（index+1）行获取调整预算金额输入框
    public WebElement getBudgetAdjustAmountByIndex(int index){
        return  getElementsByElement(getRowByIndex(index),"contentInput").get(1);
    }


    // 通过第几（index+1）行获取备注输入框
    public WebElement getBudgetRemarkByIndex(int index){
        return  getElementByElement(getRowByIndex(index),"remarkInput");
    }

}
