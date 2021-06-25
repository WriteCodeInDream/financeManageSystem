package pageHandle.relativeContractOperate;

import driverRelative.BaseDriver;
import pageElementOperate.relativeContractOperate.QueryContractListOperate;

public class QueryContractListHandle {
    public QueryContractListOperate lco;
    public QueryContractListHandle(BaseDriver baseDriver){
        this.lco = new QueryContractListOperate(baseDriver);
    }

    public String testAllRawValue(int index){
        return lco.getAllValueOfOneRaw(index).toString();
    }

    public String testGetRawValue(int index, String value){
        return lco.getRawValueByName(index, value);
    }
}
