package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.AddCompleteInfoOperate;
import utils.GetRandomChinese;

public class AddCompleteInfoHandle {
    public AddCompleteInfoOperate cio;
    public AddCompleteInfoHandle(BaseDriver baseDriver){
        this.cio = new AddCompleteInfoOperate(baseDriver);
    }

    public void addCompleteInfo(){
        cio.sendKeysToCompleteInfoInput(GetRandomChinese.create());
        cio.sendKeysToCompleteTime("2020-05-03");
    }
}
