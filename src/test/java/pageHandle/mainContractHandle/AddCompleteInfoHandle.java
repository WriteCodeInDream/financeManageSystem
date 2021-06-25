package pageHandle.mainContractHandle;

import driverRelative.BaseDriver;
import pageElementOperate.mainContractOperate.AddCompleteInfoOperate;
import pageElementOperate.CommonPageOperate;
import utils.GetRandomChinese;

public class AddCompleteInfoHandle {
    public AddCompleteInfoOperate cio;
    public CommonPageOperate co;
    public AddCompleteInfoHandle(BaseDriver baseDriver){
        this.cio = new AddCompleteInfoOperate(baseDriver);
        this.co = new CommonPageOperate(baseDriver);
    }

    public void addCompleteInfo(){
        cio.sendKeysToCompleteInfoInput(GetRandomChinese.create());
        cio.sendKeysToCompleteTime("2020-05-03");
        co.clickCloseContent();
    }
}
