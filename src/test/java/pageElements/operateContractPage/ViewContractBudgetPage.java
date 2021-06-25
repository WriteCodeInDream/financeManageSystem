package pageElements.operateContractPage;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import enumString.ContractOperate;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;

import java.util.List;

public class ViewContractBudgetPage extends BasePage {
    public WebElement cbp;
    public ViewContractBudgetPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.cbp = new ProjectManagePage(baseDriver).getOperatePage(ContractOperate.VIEW_CONTRACT_BUDGET.contractOperate);
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

    // 创建人
    public WebElement getCreateName(){return getElementsByElement(cbp, "customInfo").get(0);}
    // 申请部门
    public WebElement getCreateDept(){return getElementsByElement(cbp, "customInfo").get(1);}
    // 获取所有的row
    private List<WebElement> getBudgetRows(){
        // System.out.println(getElementsByElement(cbp, "tableRow").size());
        return getElementsByElement(cbp, "tableRow");
    }
    // 根据index 获取一行row
    private WebElement getRowByIndex(int index){
        return getBudgetRows().get(index);
    }

    // 根据子项名称获取一行row
    public WebElement getRowByValue(ContractBudget name){
        return getRowByIndex(name.ordinal());
    }

    // 通过行数获取预算金额
    public WebElement getBudgetAmountByIndex(int index){
        return getElementsByElement(getRowByIndex(index), "tableCell").get(1);
    }

    // 通过行数获取备注
    public WebElement getRemarkByIndex(int index){
        return getElementsByElement(getRowByIndex(index), "tableCell").get(2);
    }

    public WebElement getBudgetAmountByName(ContractBudget name){
        return getElementsByElement(getRowByValue(name), "tableCell").get(1);
    }

    public WebElement getBudgetRemarkByName(ContractBudget name){
        return getElementsByElement(getRowByValue(name), "tableCell").get(2);
    }


}
