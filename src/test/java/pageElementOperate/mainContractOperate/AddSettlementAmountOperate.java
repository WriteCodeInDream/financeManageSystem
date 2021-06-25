package pageElementOperate.mainContractOperate;

import driverRelative.BaseDriver;
import pageElementOperate.BaseOperate;
import pageElements.operateContractPage.AddSettlementAmountPage;
import utils.ChooseDate;

public class AddSettlementAmountOperate extends BaseOperate {
    public AddSettlementAmountPage sap;
    public BaseDriver baseDriver;
    public AddSettlementAmountOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.sap = new AddSettlementAmountPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
    }

    /**
     *
     * @param date 结算时间输入
     */
    public void sendKeysToSettlementTime(String date){
        clickElement(sap.getSettlementTimeInput());
        ChooseDate.chooseDate(date, baseDriver, sap.getSettlementTimeDate());
    }

    /**
     * 输入结算金额
     * @param amount 结算金额
     */
    public void sendKeysToSettlementAmount(String amount){
        sendKeys(sap.getSettlementAmountInput(), amount);
    }
}
