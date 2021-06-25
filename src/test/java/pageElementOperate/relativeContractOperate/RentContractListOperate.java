package pageElementOperate.relativeContractOperate;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElements.operateContractPage.RentContractListPage;

import java.util.HashMap;
import java.util.Map;

public class RentContractListOperate extends RelativeContractOperate{
    public RentContractListPage clp;
    public BaseDriver baseDriver;
    public RentContractListOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
        this.clp = new RentContractListPage(baseDriver);
        clickRelativeContractList("租赁合同");
    }

    public Map<String, String> getAllValueOfOneRaw(int index){
        int i = 0;
        Map<String, String> rawValue = new HashMap<>();
        for(WebElement element : clp.getAllTableCells(index)){
            if(i < clp.rentContractList.size()){
                rawValue.put(clp.rentContractList.get(i),getText(element));
            }
            i++;
        }
        return rawValue;
    }

    public String getRawValueByName(int index, String value){
        return getText(clp.getTableCell(value, index));
    }
}
