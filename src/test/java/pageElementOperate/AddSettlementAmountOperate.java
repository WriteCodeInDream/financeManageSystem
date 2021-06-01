package pageElementOperate;

import driverRelative.BaseDriver;
import pageElements.OperateContractPage.AddSettlementAmountPage;
import utils.ChooseDate;

public class AddSettlementAmountOperate extends BaseOperate{
    public AddSettlementAmountPage sap;
    public BaseDriver baseDriver;
    public AddSettlementAmountOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.sap = new AddSettlementAmountPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
    }

    public void sendKeysToSettlementTime(String date){
        clickElement(sap.getSettlementTimeInput());
        ChooseDate.chooseDate(date, baseDriver, sap.getSettlementTimeDate());
    }

    public void sendKeysToSettlementAmount(String amount){
        sendKeys(sap.getSettlementAmountInput(), amount);
    }
}
