package pageElementOperate;

import driverRelative.BaseDriver;
import pageElements.OperateContractPage.AddContractReceiveAmountPage;
import utils.ChooseDate;

public class AddReceiveAmountOperate extends BaseOperate{
    public AddContractReceiveAmountPage rap;
    public BaseDriver baseDriver;
    public AddReceiveAmountOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.rap = new AddContractReceiveAmountPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
    }

    public void sendKeysToReceiveTime(String date){
        clickElement(rap.getReceiveTimeInput());
        ChooseDate.chooseDate(date, baseDriver, rap.getReceiveTimeDate());
    }

    public void sendKeysToReceiveAmount(String amount){
        sendKeys(rap.getReceiveAmountInput(), amount);
    }

    public void sendKeysToPayerInput(String payerName){
        sendKeys(rap.getPayerInput(), payerName);
    }

    public void sendKeysToRemarkInput(String remark){
        sendKeys(rap.getRemarkInput(), remark);
    }
}
