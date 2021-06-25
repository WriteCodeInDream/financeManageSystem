package pageElements.costManage;

import driverRelative.BaseDriver;
import enumString.CostBudget;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CostPaymentListPage extends CostBudgetListPage{

    public CostPaymentListPage(BaseDriver baseDriver) {
        super(baseDriver);
        clickElement(costPaymentPage());
    }


    public WebElement createPaymentButton(){
        return getElement("createButton");
    }

    // 获取付款详情表头
    private WebElement getPaymentHeader(){
        return getElement("paymentHeader");
    }
    // 获取付款日期， 审批状态，操作那一个单元格
    private WebElement getAllPaymentTimeStatusOperate(){
        return getElementsByElement(getPaymentHeader(), "tableTr").get(0);
    }

    // 获取一个付款单元格  2021-06报账（审批通过） 编辑、导出 这个单元格
    public WebElement getOnePaymentTimeStatusOperate(int index){
        return getElementsByElement(getAllPaymentTimeStatusOperate(), "tableTh").get(index + 2);
    }

    // 获取单个付款的编辑导出操作，只有一个时，为导出，有两个时，第一个为编辑，第二个为导出
    public List<WebElement> getPaymentOperate(int index){
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

    private List<WebElement> getAllTableRow(){
        return getElements("tableRow");
    }

    private WebElement getRowByIndex(int index){
        return getAllTableRow().get(index);
    }

    private WebElement getRowByName(CostBudget name){
        return getRowByIndex(name.ordinal());
    }

    public WebElement getBudgetAmountByIndex(int index){
        return getElementsByElement(getRowByIndex(index),"tableCell").get(1);
    }

    public WebElement getBudgetAmountByName(CostBudget name){
        return getElementsByElement(getRowByName(name),"tableCell").get(1);
    }

    public WebElement getBillTotalByIndex(int index){
        return getElementsByElement(getRowByIndex(index),"tableCell").get(2);
    }

    public WebElement getBillTotalByName(CostBudget name){
        return getElementsByElement(getRowByName(name),"tableCell").get(2);
    }

    public WebElement getPaymentTotalByIndex(int index){
        return getElementsByElement(getRowByIndex(index),"tableCell").get(3);
    }

    public WebElement getPaymentTotalByName(CostBudget name){
        return getElementsByElement(getRowByName(name),"tableCell").get(3);
    }


    public WebElement getBillAmountByIndex(int index, int paymentIndex){
        return getElementsByElement(getRowByIndex(index),"tableCell").get(4 * paymentIndex);
    }

    public WebElement getBillAmountByName(CostBudget name, int paymentIndex){
        return getElementsByElement(getRowByName(name),"tableCell").get(4 * paymentIndex);
    }


    public WebElement getPaymentAmountByIndex(int index, int paymentIndex){
        return getElementsByElement(getRowByIndex(index),"tableCell").get(4 * paymentIndex + 1);
    }

    public WebElement getPaymentAmountByName(CostBudget name, int paymentIndex){
        return getElementsByElement(getRowByName(name),"tableCell").get(4 * paymentIndex + 1);
    }


    public WebElement getRemarkByIndex(int index, int paymentIndex){
        return getElementsByElement(getRowByIndex(index),"tableCell").get(4 * paymentIndex + 3);
    }

    public WebElement getRemarkByName(CostBudget name, int paymentIndex){
        return getElementsByElement(getRowByName(name),"tableCell").get(4 * paymentIndex + 3);
    }




}
