package pageElementOperate.mainContractOperate;

import driverRelative.BaseDriver;
import pageElementOperate.BaseOperate;
import pageElements.operateContractPage.AddCompleteInfoPage;
import utils.ChooseDate;

public class AddCompleteInfoOperate extends BaseOperate {
    public AddCompleteInfoPage cip;
    public BaseDriver baseDriver;
    public AddCompleteInfoOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.cip = new AddCompleteInfoPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
    }

    /**
     *
     * @param completeTime 完工时间  格式yyyy-mm-dd
     */
    public void sendKeysToCompleteTime(String completeTime){
        clickElement(cip.getCompleteTimeInput());
        ChooseDate.chooseDate(completeTime, baseDriver, cip.getCompleteTime());
    }

    /**
     *
     * @param info 完工情况输入框输入值
     */
    public void sendKeysToCompleteInfoInput(String info){
        sendKeys(cip.getCompleteInfo(), info);
    }

  }
