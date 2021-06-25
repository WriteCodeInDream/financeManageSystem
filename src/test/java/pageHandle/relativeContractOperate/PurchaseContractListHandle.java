package pageHandle.relativeContractOperate;

import driverRelative.BaseDriver;
import enumString.RelativeSearchCondition;
import pageElementOperate.relativeContractOperate.PurchaseContractListOperate;
import utils.GetMoney;

public class PurchaseContractListHandle {
    public PurchaseContractListOperate lco;
    public PurchaseContractListHandle(BaseDriver baseDriver){
        this.lco = new PurchaseContractListOperate(baseDriver);
    }

    public String testAllRawValue(int index){
        return lco.getAllValueOfOneRaw(index).toString();
    }

    public String testGetRawValue(int index, String value){
        return lco.getRawValueByName(index, value);
    }
    public void testSearchCondition(){
        lco.sendKeysToDropList("建设公司", RelativeSearchCondition.PRACTICING_COMPANY);
        lco.sendKeysToInput("合同编号",RelativeSearchCondition.NUMBER);
        lco.sendKeysToInput("xiangmmingc",RelativeSearchCondition.PROJECT_NAME);
        lco.sendKeysToInput(GetMoney.getRandomMoney(), RelativeSearchCondition.CONTRACT_AMOUNT_BEGIN);
        lco.sendKeysToInput(GetMoney.getRandomMoney(), RelativeSearchCondition.CONTRACT_AMOUNT_END);
        lco.sendKeysToDateChoose("2021-09-23","2022-03-15",RelativeSearchCondition.REGISTER_TIME);
    }
}
