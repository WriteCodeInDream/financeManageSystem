package pageElementOperate;

import driverRelative.BaseDriver;
import enumString.MainSearchCondition;
import org.openqa.selenium.WebElement;
import pageElements.ProjectManagePage;
import utils.ChooseDate;
import utils.GetDownList;

import java.util.HashMap;
import java.util.Map;

public class ProjectManegeOperate extends BaseOperate{
    public ProjectManagePage pmp;
    BaseDriver baseDriver;
    Map<String ,String > map = new HashMap<>();
    public ProjectManegeOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.pmp = new ProjectManagePage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
    }

    public Map<String ,String> getTableCellsMap(int index){
        int i = 0;
        for(WebElement element : pmp.getAllTableCells(index)){
            if( i < pmp.mainHtList.size()){
                map.put(pmp.mainHtList.get(i), getText(element));
            }
            i++;
        }
        return map;
    }

    // 获取主合同页面第几行的字段名称
    public String getTableCellValue(String value, int index){
        return getText(pmp.getTableCell(value, index));
    }

    // 查询下拉列表选择查询条件
    public void sendKeysToDropList(String value, MainSearchCondition name){
        clickElement(pmp.getSearchInputByConditionName(name));
        clickElement(pmp.getElementListItem(value));
    }

    // 查询输入框输入查询条件
    public void sendKeysToInput(String value, MainSearchCondition name){
        sendKeys(pmp.getSearchInputByConditionName(name), value);
    }

    // 时间选择器输入
   public void sendKeysToDateChoose(String beginTime, String endTime, MainSearchCondition name){
        clickElement(pmp.getSearchInputByConditionName(name));
        ChooseDate.chooseDate(beginTime, endTime, baseDriver, pmp.beginAndEndTime(name));
   }

   // 清空查询条件
    public void clearCondition(MainSearchCondition name){
        clearInput(pmp.getSearchInputByConditionName(name));
    }

}
