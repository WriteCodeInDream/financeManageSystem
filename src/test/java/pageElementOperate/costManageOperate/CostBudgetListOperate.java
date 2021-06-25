package pageElementOperate.costManageOperate;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElementOperate.BaseOperate;
import pageElements.costManage.CostBudgetListPage;

import java.util.HashMap;
import java.util.Map;

public class CostBudgetListOperate extends BaseOperate {
    public CostBudgetListPage blp;
    public BaseDriver baseDriver;
    Map<String ,String > map = new HashMap<>();
    public CostBudgetListOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.baseDriver= baseDriver;
        this.blp = new CostBudgetListPage(baseDriver);
        baseDriver.setRunSpeed(200);
    }

    // 选择申请部门
    public void sendKeysToCreateDept(String value){
        clickElement(blp.createDeptInput());
        clickElement(blp.getElementListItem(value));
    }

    // 点击创建预算按钮
    public void clickCreateButton(){
        clickElement(blp.getCreateBudgetButton());
    }

    public void clickBudgetTime(){
        clickElement(blp.createTime());
    }

    // 点击查询按钮
    public void clickSearchButton(){
        clickElement(blp.searchButton());
    }

    // 点击清空按钮
    public void clickResetButton(){
        clickElement(blp.resetButton());
    }
    
    // 返回一行的预算信息，并封装为map
    public Map<String, String> getRowValue(int index){
       int i = 0;
       for(WebElement element: blp.getAllTableCell(index)){
           if( i < blp.costBudgetList.size()){
               map.put(blp.costBudgetList.get(i), getText(element));
           }
           i++;
       }
       return map;
    }

    // 获取单个表格内容
    public String getCellValue(int index,String value){
        return getText(blp.getTableCellByName(index,value));
    }

    // 点击查看按钮
    public void clickViewButton(int index){
        clickElement(blp.getViewButton(index));
    }

    // 点击编辑按钮
    public void clickEditButton(int index){
        clickElement(blp.getEditButton(index));
    }

}
