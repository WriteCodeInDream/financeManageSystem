package pageHandle.relativeContractOperate;

import driverRelative.BaseDriver;
import pageElementOperate.relativeContractOperate.SubContractListOperate;

public class SubContractListHandle {
    public SubContractListOperate lco;
    public SubContractListHandle(BaseDriver baseDriver){
        this.lco = new SubContractListOperate(baseDriver);
    }

    public String testAllRawValue(int index){
        return lco.getAllValueOfOneRaw(index).toString();
    }

    public String testGetRawValue(int index, String value){
        return lco.getRawValueByName(index, value);
    }
}
