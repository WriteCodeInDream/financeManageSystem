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

    /**
     * 输入收款时间
     * @param date 收款时间
     */
    public void sendKeysToReceiveTime(String date){
        clickElement(rap.getReceiveTimeInput());
        ChooseDate.chooseDate(date, baseDriver, rap.getReceiveTimeDate());
    }

    /**
     *  输入收款金额
     * @param amount 收款金额
     */
    public void sendKeysToReceiveAmount(String amount){
        sendKeys(rap.getReceiveAmountInput(), amount);
    }

    /**
     *  输入付款方
     * @param payerName 付款方名称
     */
    public void sendKeysToPayerInput(String payerName){
        sendKeys(rap.getPayerInput(), payerName);
    }

    /**
     * 输入备注
     * @param remark 输入备注
     */
    public void sendKeysToRemarkInput(String remark){
        sendKeys(rap.getRemarkInput(), remark);
    }

}
