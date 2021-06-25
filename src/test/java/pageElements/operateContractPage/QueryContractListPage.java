package pageElements.operateContractPage;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryContractListPage extends BasePage {
    Map<String, Integer> map = new HashMap<>();
    public List<String> queryContractList = new ArrayList<>();
    public QueryContractListPage(BaseDriver baseDriver) {
        super(baseDriver);
        initList();
        initMap();
    }


    /**
     *
     * @return 获取所有的主合同列表行
     */
    private List<WebElement> getAllTableRows(){
        List<WebElement> elements = new ArrayList<>();
        for (WebElement element : getElements("tableRow")){
            if (baseDriver.isDisplayed(element)){
                elements.add(element);
            }
        }
        return elements;
    }

    /**
     *
     * @param index 行数
     * @return 所有的字段信息 主合同编号、项目名称、主合同金额等
     */
    public List<WebElement> getAllTableCells(int index){
        return getElementsByElement(getAllTableRows().get(index), "tableCell");
    }

    /**
     *
     * @param value 字段名称
     * @param index 行数
     * @return 单个字段
     */
    public WebElement getTableCell(String value, int index){
        return getAllTableCells(index).get(map.get(value));
    }



    /**
     * 初始化map信息
     */
    public void initMap(){
        for(int i = 0; i <queryContractList.size(); i++){
            map.put(queryContractList.get(i), i );
        }
    }

    /**
     * 初始化list信息 主合同字段
     */
    public void initList(){
        queryContractList.add("序号");
        queryContractList.add("登记时间");
        queryContractList.add("关联主合同编号");
        queryContractList.add("合同编号");
        queryContractList.add("项目名称");
        queryContractList.add("合同金额");
        queryContractList.add("结算金额");
        queryContractList.add("开票金额");
        queryContractList.add("付款状态");
        queryContractList.add("付款金额");
        queryContractList.add("合同经办人");
        queryContractList.add("实施实体");
        queryContractList.add("审批人");
        queryContractList.add("审批状态");
        queryContractList.add("委托方式");
        queryContractList.add("工程地点");
        queryContractList.add("对方单位");
        queryContractList.add("合同份数");
        queryContractList.add("合同履约时间");
        queryContractList.add("合同返回时间");
        queryContractList.add("备注");
        queryContractList.add("创建人");
        queryContractList.add("最近编辑人");
    }

}
