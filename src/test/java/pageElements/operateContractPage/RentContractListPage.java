package pageElements.operateContractPage;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentContractListPage extends BasePage {
    Map<String, Integer> map = new HashMap<>();
    public List<String> rentContractList = new ArrayList<>();
    public RentContractListPage(BaseDriver baseDriver) {
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
        for(int i = 0; i <rentContractList.size(); i++){
            map.put(rentContractList.get(i), i );
        }
    }

    /**
     * 初始化list信息 主合同字段
     */
    public void initList(){
        rentContractList.add("序号");
        rentContractList.add("登记时间");
        rentContractList.add("关联主合同编号");
        rentContractList.add("合同编号");
        rentContractList.add("项目名称");
        rentContractList.add("合同金额");
        rentContractList.add("结算金额");
        rentContractList.add("开票金额");
        rentContractList.add("付款状态");
        rentContractList.add("付款金额");
        rentContractList.add("合同经办人");
        rentContractList.add("实施实体");
        rentContractList.add("审批人");
        rentContractList.add("审批状态");
        rentContractList.add("工程地点");
        rentContractList.add("委托实施单位");
        rentContractList.add("委托方式");
        rentContractList.add("合同份数");
        rentContractList.add("合同履约时间");
        rentContractList.add("完成工作量");
        rentContractList.add("合同返回时间");
        rentContractList.add("备注");
        rentContractList.add("创建人");
        rentContractList.add("最近编辑人");
    }

}
