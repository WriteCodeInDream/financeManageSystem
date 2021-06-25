package pageElements.costManage;

import driverRelative.BaseDriver;
import enumString.CostBudget;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddCostBudgetPage extends CostBudgetListPage{

    public WebElement cbp;
    public AddCostBudgetPage(BaseDriver baseDriver) {
        super(baseDriver);
        clickElement(getCreateBudgetButton());
        this.cbp = getElement("contentPage");
    }

    // 预算年月
    public WebElement budgetTime(){
        return getElementsByElement(cbp,"input").get(0);
    }

    // 创建人信息
    public WebElement createName(){
        return getElementByElement(cbp, "createInfo");
    }

    // 申请部门
    public WebElement createDept(){
        return getElementByElement(cbp, "createDept");
    }

    // 返回新增预算页面的一行预算子项
    public List<WebElement> getAllRows(){
        return getElementsByElement(cbp, "tableRow");
    }

    // 通过行数获取预算金额
    public WebElement getAmountByIndex(int index){
        return getElementByElement(getAllRows().get(index),"input");
    }

    // 通过子项名称获取预算金额
    public WebElement getAmountByName(CostBudget name){
        return getAmountByIndex(name.ordinal());
    }

    // 通过行数获取备注
    public WebElement getRemarkByIndex(int index){
        return getElementByElement(getAllRows().get(index),"remarkInput");
    }

    // 通过子向明朝获取备注
    public WebElement getRemarkByName(CostBudget name){
        return getRemarkByIndex(name.ordinal());
    }
}
