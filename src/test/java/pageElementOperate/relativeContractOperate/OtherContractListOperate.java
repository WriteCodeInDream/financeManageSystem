package pageElementOperate.relativeContractOperate;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElements.operateContractPage.OtherContractListPage;

import java.util.HashMap;
import java.util.Map;

public class OtherContractListOperate extends RelativeContractOperate {
    public OtherContractListPage clp;
    public BaseDriver baseDriver;
    public OtherContractListOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
        this.clp = new OtherContractListPage(baseDriver);
        clickRelativeContractList("其他合同");
    }

    // 返回一行数据，封装为map
    public Map<String, String> getAllValueOfOneRaw(int index){
        int i = 0;
        Map<String, String> rawValue = new HashMap<>();
        for(WebElement element : clp.getAllTableCells(index)){
            if(i < clp.otherContractList.size()){
                rawValue.put(clp.otherContractList.get(i),getText(element));
            }
            i++;
        }
        return rawValue;
    }

    // 通过子项获取一个单独的值
    public String getRawValueByName(int index, String value){
        return getText(clp.getTableCell(value, index));
    }
}
