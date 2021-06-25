package pageElements.costManage;

import driverRelative.BaseDriver;
import enumString.CostBudget;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EditCostPaymentPage extends CostPaymentListPage {
    public WebElement epp;
    public EditCostPaymentPage(BaseDriver baseDriver,int index) {
        super(baseDriver);
        clickElement(getEdit(index));
        this.epp = getElement("contentPage");
    }


    // 综合预算申请年月
    public WebElement getCreateTime(){
        return getElementsByElement(epp, "customInfo").get(0);
    }

    // 综合预算申请人信息
    public WebElement getCreateName(){
        return getElementsByElement(epp, "customInfo").get(1);
    }

    // 综合预算申请部门
    public WebElement getCreateDept(){
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
    public WebElement getRowByValue(CostBudget name){
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
        if(index < 1){
            return getElementsByElement(getRowByIndex(index), "tableCell").get(4);
        }
        return getElementsByElement(getRowByIndex(index), "input").get(0);
    }

    // 获取第几行的本次付款金额
    public WebElement getPaymentAmountByIndex(int index){
        if (index < 1){
            return getElementsByElement(getRowByIndex(index), "tableCell").get(5);
        }
        return getElementsByElement(getRowByIndex(index), "input").get(1);
    }

    public WebElement getPaymentRemarkByIndex(int index){
        return getElementByElement(getRowByIndex(index), "remarkInput");
    }

    // 获取子项的预算合计金额
    public WebElement getFinalBudgetByName(CostBudget name){
        return getElementsByElement(getRowByValue(name),"tableCell").get(1);

    }

    // 通过子项获取票据金额累计
    public WebElement getTotalBillByName(CostBudget name){
        return getElementsByElement(getRowByValue(name), "tableCell").get(2);
    }

    // 获取子项的累计付款金额
    public WebElement getTotalPaymentByName(CostBudget name){
        return getElementsByElement(getRowByValue(name), "tableCell").get(3);
    }

    // 获取子项的第几个的票据金额
    public WebElement getBillAmountByName(CostBudget name){
        if(name == CostBudget.YSHJ){
            return getElementsByElement(getRowByValue(name), "tableCell").get(4);

        }
        return getElementsByElement(getRowByValue(name), "input").get(0);
    }

    // 获取子项的第几个付款金额
    public WebElement getPaymentAmountByName(CostBudget name){
        if(name == CostBudget.YSHJ){
            return getElementsByElement(getRowByValue(name), "tableCell").get(5);

        }
        return getElementsByElement(getRowByValue(name), "input").get(1);
    }

    // 获取子项的第几个备注
    public WebElement getPaymentRemarkByName(CostBudget name){
        return getElementByElement(getRowByValue(name), "remarkInput");
    }

}
