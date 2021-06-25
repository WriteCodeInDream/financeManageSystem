package pageElementOperate.relativeContractOperate;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElements.operateContractPage.PurchaseContractListPage;

import java.util.HashMap;
import java.util.Map;

public class PurchaseContractListOperate extends RelativeContractOperate{
    public PurchaseContractListPage clp;
    public BaseDriver baseDriver;
    public PurchaseContractListOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
        this.clp = new PurchaseContractListPage(baseDriver);
        clickRelativeContractList("采购合同");
    }

    // 返回一行数据，封装为map
    public Map<String, String> getAllValueOfOneRaw(int index){
        int i = 0;
        Map<String, String> rawValue = new HashMap<>();
        for(WebElement element : clp.getAllTableCells(index)){
            if(i < clp.purchaseContractList.size()){
                rawValue.put(clp.purchaseContractList.get(i),getText(element));
            }
            i++;
        }
        return rawValue;
    }

    //返回列表单个表格内容
    public String getRawValueByName(int index, String value){
        return getText(clp.getTableCell(value, index));
    }
}
