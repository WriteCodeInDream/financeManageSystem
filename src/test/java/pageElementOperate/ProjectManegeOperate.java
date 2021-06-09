package pageElementOperate;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElements.ProjectManagePage;

import java.util.HashMap;
import java.util.Map;

public class ProjectManegeOperate extends BaseOperate{
    public ProjectManagePage pmp;
    Map<String ,String > map = new HashMap<>();
    public ProjectManegeOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.pmp = new ProjectManagePage(baseDriver);
    }

    public Map<String ,String> getTableCellsMap(int index){
        int i = 0;
        System.out.println(pmp.getAllTableCells(index).size());
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


}
