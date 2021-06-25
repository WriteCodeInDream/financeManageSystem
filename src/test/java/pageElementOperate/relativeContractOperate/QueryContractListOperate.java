package pageElementOperate.relativeContractOperate;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElements.operateContractPage.QueryContractListPage;

import java.util.HashMap;
import java.util.Map;

public class QueryContractListOperate extends RelativeContractOperate{
    public QueryContractListPage clp;
    public BaseDriver baseDriver;
    public QueryContractListOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
        this.clp = new QueryContractListPage(baseDriver);
        clickRelativeContractList("咨询合同");
    }

    public Map<String, String> getAllValueOfOneRaw(int index){
        int i = 0;
        Map<String, String> rawValue = new HashMap<>();
        for(WebElement element : clp.getAllTableCells(index)){
            if(i < clp.queryContractList.size()){
                rawValue.put(clp.queryContractList.get(i),getText(element));
            }
            i++;
        }
        return rawValue;
    }

    public String getRawValueByName(int index, String value){
        return getText(clp.getTableCell(value, index));
    }
}
