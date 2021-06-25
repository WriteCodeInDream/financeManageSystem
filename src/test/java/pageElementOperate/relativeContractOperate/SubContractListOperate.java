package pageElementOperate.relativeContractOperate;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElements.operateContractPage.SubContractListPage;

import java.util.HashMap;
import java.util.Map;

public class SubContractListOperate extends RelativeContractOperate{
    public SubContractListPage clp;
    public BaseDriver baseDriver;
    public SubContractListOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
        this.clp = new SubContractListPage(baseDriver);
        clickRelativeContractList("分包合同");
    }

    public Map<String, String> getAllValueOfOneRaw(int index){
        int i = 0;
        Map<String, String> rawValue = new HashMap<>();
        for(WebElement element : clp.getAllTableCells(index)){
            if(i < clp.subContractList.size()){
                rawValue.put(clp.subContractList.get(i),getText(element));
            }
            i++;
        }
        return rawValue;
    }

    public String getRawValueByName(int index, String value){
        return getText(clp.getTableCell(value, index));
    }
}
