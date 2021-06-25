package pageElements.costManage;

import driverRelative.BaseDriver;
import enumString.CostBudget;
import enumString.CostBudget;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

public class AddCostPaymentPage extends CostPaymentListPage{

    public WebElement app;
    public AddCostPaymentPage(BaseDriver baseDriver) {
        super(baseDriver);
        clickElement(createPaymentButton());
        this.app = getElement("contentPage");
    }

    public WebElement getCreateTime(){
        return getElementsByElement(app, "input").get(0);
    }

    public WebElement getCreateName(){
        return getElementByElement(app,"createInfo");
    }

    public WebElement getCreateDept(){
        return getElementByElement(app,"createDept");
    }

    // 获取所有row
    private List<WebElement> getBudgetRows(){
        return getElementsByElement(app, "tableRow");
    }

    // 根据index获取一行row
    private WebElement getRowByIndex(int index){
        return getBudgetRows().get(index);
    }

    // 根据子项名称获取一行row
    public WebElement getRowByName(CostBudget name){
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
        return getElementByElement(getRowByIndex(index), "remarkInput");
    }

    // 获取最终预算
    public WebElement getFinalBudgeByName(CostBudget name){
        return getElementsByElement(getRowByName(name), "tableCell").get(1);
    }

    // 获取累积报账票据金额
    public WebElement getSumBillAmountByName(CostBudget name){
        return getElementsByElement(getRowByName(name), "tableCell").get(2);
    }

    // 获取累积付款金额
    public WebElement getSumPaymentAmountByName(CostBudget name){
        return getElementsByElement(getRowByName(name), "tableCell").get(3);
    }

    // 获取本次票据金额
    public WebElement getCurrentBillAmountByName(CostBudget name){
        return getElementsByElement(getRowByName(name), "contentInput").get(0);
    }

    // 获取本次付款金额
    public WebElement getCurrentPaymentAmountByName(CostBudget name){
        return getElementsByElement(getRowByName(name), "contentInput").get(1);
    }


    // 付款附件操作按钮
    public WebElement getUpLoadFileButtonByName(CostBudget name){
        return getElementsByElement(getRowByName(name), "tableOperate").get(0);
    }

    // 附件下载操作按钮
    public WebElement getDownloadFileButtonByName(CostBudget name){
        int operateSize = getElementsByElement(getRowByName(name), "tableOperate").size();
        if( operateSize > 1){
            return getElementsByElement(getRowByName(name), "tableOperate").get(1);
        }
        throw new NoSuchElementException("当前没有附件可下载");
    }

    // 获取备注输入框
    public WebElement getRemarkInputByName(CostBudget name){
        return getElementByElement(getRowByName(name), "remarkInput");
    }

}
