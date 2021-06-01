package pageElementOperate;

import driverRelative.BaseDriver;
import pageElements.OperateContractPage.AddContractPaymentPage;

public class AddContractPaymentOperate extends BaseOperate{
    public AddContractPaymentPage app;
    public BaseDriver baseDriver;
    public AddContractPaymentOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.app = new AddContractPaymentPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(300);
    }

    public void sendKeysToPayment(int index, String value){
        sendKeys(app.getAmountInput(index),value);
    }

    public void sendKeysToRemarkInput(int index, String value){
        sendKeys(app.getRemarkInput(index), value);
    }

}
