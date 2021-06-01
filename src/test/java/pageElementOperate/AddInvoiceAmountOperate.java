package pageElementOperate;

import driverRelative.BaseDriver;
import pageElements.OperateContractPage.AddInvoiceAmountPage;
import utils.ChooseDate;

public class AddInvoiceAmountOperate extends BaseOperate {
    public AddInvoiceAmountPage iap;
    public BaseDriver baseDriver;
    public AddInvoiceAmountOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.iap = new AddInvoiceAmountPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
    }

    public void sendKeysToInvoiceTime(String date){
        clickElement(iap.getInvoiceTimeInput());
        ChooseDate.chooseDate(date, baseDriver, iap.getInvoiceTimeDate());
    }

    public void sendKeysToInvoiceAmount(String amount){
        sendKeys(iap.getInvoiceAmountInput(), amount);
    }

    public void sendKeysToBuyerInput(String payerName){
        sendKeys(iap.getBuyerName(), payerName);
    }

    public void sendKeysToRemarkInput(String remark){
        sendKeys(iap.getRemarkInput(), remark);
    }
}
