package pageElementOperate;

import driverRelative.BaseDriver;
import pageElements.OperateContractPage.AddContractBudgetPage;

public class AddBudgetOperate extends BaseOperate{
    public AddContractBudgetPage abp;
    public BaseDriver baseDriver;

    public AddBudgetOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.baseDriver = baseDriver;
        this.abp = new AddContractBudgetPage(baseDriver);
        baseDriver.setRunSpeed(500);
    }

    public void sendKeysToAmountInput(int index ,String value){
        sendKeys(abp.oneBudgetInput(index), value);
    }

    public void sendKeysToRemarkInput(int index, String value){
        sendKeys(abp.oneRemarkInput(index), value);
    }
}
