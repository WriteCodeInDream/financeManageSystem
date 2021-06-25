package pageElements.costManage;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageHandle.LoginHandle;
import utils.GetDownList;
import utils.GetEnvironment;
import utils.GetPage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CostBudgetListPage extends BasePage {
    LoginHandle lh;
    Map<String, Integer> budgetMap = new HashMap<>();
    public List<String> costBudgetList = new ArrayList<>();
    public CostBudgetListPage(BaseDriver baseDriver) {
        super(baseDriver);
        initList();
        initMap();
        if(baseDriver.getCurrentUrl().contains("login")){
            this.lh = new LoginHandle(baseDriver);
            lh.handleLogin(GetEnvironment.getValue("userAdmin"),GetEnvironment.getValue("passwordAdmin"));
            switchToPage(GetPage.getValue("costIndex"));
        }else if(!baseDriver.getCurrentUrl().contains("cost")){
            switchToPage(GetPage.getValue("costIndex"));
        }
    }

    // 创建预算按钮
    public WebElement getCreateBudgetButton(){
        return getElement("createButton");
    }

    // 审批部门
    public WebElement createDeptInput(){
        return getElements("input").get(0);
    }

    public WebElement getElementListItem(String value){
        return getElementByValue(value, GetDownList.getDownList(baseDriver));
    }

    // 申请年月
    public WebElement createTime(){
        return getElements("input").get(1);
    }

    // 查询按钮
    public WebElement searchButton(){
        return getElement("searchButton");
    }

    // 清空按钮
    public WebElement resetButton(){
        return getElement("resetButton");
    }

    // 获取所有行数
    private List<WebElement> getAllRows(){
        List<WebElement> elements = new ArrayList<>();
        for (WebElement element : getElements("tableRow")){
            if (baseDriver.isDisplayed(element)){
                elements.add(element);
            }
        }
        return elements;
    }

    // 通过行数获取一行预算
    private WebElement getRowByIndex(int index){
        return getAllRows().get(index);
    }

    // 获取一行所有表格
    public List<WebElement> getAllTableCell(int index){
        return getElementsByElement(getRowByIndex(index), "tableCell");
    }

    // 获取单个表格
    public WebElement getTableCellByName(int index, String name){
        return getAllTableCell(index).get(costBudgetList.indexOf(name));
    }

    // 获取一行的查看按钮
    public WebElement getViewButton(int index){
        return getElementsByElement(getRowByIndex(index),"tableOperate").get(0);
    }

    // 获取一行的编辑按钮
    public WebElement getEditButton(int index){
        return getElementsByElement(getRowByIndex(index),"tableOperate").get(1);

    }

    // 切换至预算页面
    public WebElement costBudgetPage(){
        return getElements("costTab").get(0);
    }

    // 切换至付款页面
    public WebElement costPaymentPage(){
        return getElements("costTab").get(1);
    }

    private void initList(){
        costBudgetList.add("序号");
        costBudgetList.add("申请部门");
        costBudgetList.add("申请人");
        costBudgetList.add("预算年月");
        costBudgetList.add("预算金额");
    }
    
    private void initMap(){
        for (int i = 0; i < costBudgetList.size(); i++) {
            budgetMap.put(costBudgetList.get(i), i);
        }
    }
}
