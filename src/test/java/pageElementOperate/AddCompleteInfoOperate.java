package pageElementOperate;

import driverRelative.BaseDriver;
import pageElements.OperateContractPage.AddCompleteInfoPage;
import utils.ChooseDate;

public class AddCompleteInfoOperate extends BaseOperate{
    public AddCompleteInfoPage cip;
    public BaseDriver baseDriver;
    public AddCompleteInfoOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.cip = new AddCompleteInfoPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
    }

    public void sendKeysToCompleteTime(String completeTime){
        clickElement(cip.getCompleteTimeInput());
        ChooseDate.chooseDate(completeTime, baseDriver, cip.getCompleteTime());
    }

    public void sendKeysToCompleteInfoInput(String info){
        sendKeys(cip.getCompleteInfo(), info);
    }
}
