package pageElements.costManage;

import driverRelative.BaseDriver;
import enumString.CostBudget;
import org.openqa.selenium.WebElement;

import java.util.List;


public class EditCostBudgetPage extends CostBudgetListPage{

    public WebElement cbp;
    public EditCostBudgetPage(BaseDriver baseDriver, int index) {
        super(baseDriver);
        clickElement(getEditButton(index));
        this.cbp = getElement("pageWrap");
    }
    // 综合预算申请年月
    public WebElement getCreateTime(){
        return getElementsByElement(cbp, "customInfo").get(0);
    }

    // 综合预算申请人信息
    public WebElement getCreateName(){
        return getElementsByElement(cbp, "customInfo").get(1);
    }

    // 综合预算申请部门
    public WebElement getCreateDept(){
        return getElementsByElement(cbp, "customInfo").get(2);
    }

    // 编辑综合费用预算所有行元素
    private List<WebElement> getAllRows(){
        return getElementsByElement(cbp, "tableRow");
    }

    // 通过行数获取一行预算
    private WebElement getRowByIndex(int index){
        return getAllRows().get(index);
    }

    // 通过子项名称获取一行预算元素
    public WebElement getRowByName(CostBudget name){
        return getAllRows().get(name.ordinal());
    }

    // 获取第几行的预算金额
    public WebElement getBudgetAmountByIndex(int index){
        return getElementsByElement(getRowByIndex(index),"tableCell").get(1);
    }

    // 获取预算子项的预算金额
    public WebElement getBudgetAmountByName(CostBudget name){
        return getElementsByElement(getRowByName(name), "tableCell").get(1);
    }

    // 获取第几行的调整预算金额输入框
    public WebElement getAdjustAmountByIndex(int index){
        return getElementByElement(getRowByIndex(index), "input");
    }

    // 获取预算子项的调整预算金额输入框
    public WebElement getAdjustAmountByName(CostBudget name){
        return getElementByElement(getRowByName(name), "input");
    }

    // 获取第几行的调整预算金额
    public WebElement getBudgetAfterByIndex(int index){
        return getElementsByElement(getRowByIndex(index),"tableCell").get(3);
    }

    // 获取预算子项的调整后预算金额
    public WebElement getBudgetAfterByName(CostBudget name){
        return getElementsByElement(getRowByName(name), "tableCell").get(3);
    }

    // 获取第几行的预算备注
    public WebElement getBudgetRemarkByIndex(int index){
        return getElementByElement(getRowByIndex(index),"remarkInput");
    }

    // 获取预算子项的备注
    public WebElement getBudgetRemarkByName(CostBudget name){
        return getElementByElement(getRowByName(name),"remarkInput");
    }
}
