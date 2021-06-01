package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.AddReceiveAmountOperate;
import utils.GetMoney;
import utils.GetRandomChinese;

import java.util.Date;

public class AddReceiveAmountHandle {
    public AddReceiveAmountOperate rao;
    public AddReceiveAmountHandle(BaseDriver baseDriver){
        this.rao = new AddReceiveAmountOperate(baseDriver);
    }
    public void addReceiveAmount(){
        rao.sendKeysToReceiveTime("2021-06-06");
        rao.sendKeysToReceiveAmount(GetMoney.getRandomMoney());
        rao.sendKeysToPayerInput(GetRandomChinese.create());
        rao.sendKeysToRemarkInput(GetRandomChinese.create());
    }
}
