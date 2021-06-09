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

    /**
     *
     * @param date 开票时间
     */
    public void sendKeysToInvoiceTime(String date){
        clickElement(iap.getInvoiceTimeInput());
        ChooseDate.chooseDate(date, baseDriver, iap.getInvoiceTimeDate());
    }

    /**
     *
     * @param amount 开票金额
     */
    public void sendKeysToInvoiceAmount(String amount){
        sendKeys(iap.getInvoiceAmountInput(), amount);
    }

    /**
     *
     * @param payerName 开票方
     */
    public void sendKeysToBuyerInput(String payerName){
        sendKeys(iap.getBuyerName(), payerName);
    }

    /**
     *
     * @param remark 备注
     */
    public void sendKeysToRemarkInput(String remark){
        sendKeys(iap.getRemarkInput(), remark);
    }
}
