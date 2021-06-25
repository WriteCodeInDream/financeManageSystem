package pageElements.costManage;

import driverRelative.BaseDriver;
import enumString.CostBudget;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ViewCostBudgetPage extends CostBudgetListPage{
    public WebElement cbp;
    public ViewCostBudgetPage(BaseDriver baseDriver, int index) {
        super(baseDriver);
        clickElement(getViewButton(index));
        this.cbp = getElement("pageWrap");
    }

    // 申请年月信息
    public WebElement budgetTime(){
        return getElementsByElement(cbp,"customInfo").get(0);
    }

    // 申请人信息
    public WebElement createName(){
        return getElementsByElement(cbp,"customInfo").get(1);
    }

    // 申请部门信息
    public WebElement createDept(){
        return getElementsByElement(cbp,"customInfo").get(2);
    }

    // 查询综合费用预算时一行预算信息
    private List<WebElement> getAllRows(){
        return getElementsByElement(cbp, "tableRow");
    }

    // 获取第几行综合费用预算信息
    public WebElement getAmountByIndex(int index){
        return getElementsByElement(getAllRows().get(index),"tableCell").get(1);
    }

    // 获取预算子项的预算信息
    public WebElement getAmountByName(CostBudget name){
        return getAmountByIndex(name.ordinal());
    }

    // 获取第几行的备注
    public WebElement getRemarkByIndex(int index){
        return getElementsByElement(getAllRows().get(index),"tableCell").get(2);
    }

    // 获取预算子项的备注
    public WebElement getRemarkByName(CostBudget name){
        return getRemarkByIndex(name.ordinal());
    }
}
