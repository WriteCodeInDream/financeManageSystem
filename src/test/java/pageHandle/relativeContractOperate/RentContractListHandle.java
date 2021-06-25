package pageHandle.relativeContractOperate;

import driverRelative.BaseDriver;
import pageElementOperate.relativeContractOperate.RentContractListOperate;

public class RentContractListHandle {
    public RentContractListOperate lco;
    public RentContractListHandle(BaseDriver baseDriver){
        this.lco = new RentContractListOperate(baseDriver);
    }

    public String testAllRawValue(int index){
        return lco.getAllValueOfOneRaw(index).toString();
    }

    public String testGetRawValue(int index, String value){
        return lco.getRawValueByName(index, value);
    }
}
