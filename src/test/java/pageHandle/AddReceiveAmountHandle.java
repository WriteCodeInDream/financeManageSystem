package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.AddReceiveAmountOperate;
import pageElementOperate.CommonPageOperate;
import utils.GetMoney;
import utils.GetRandomChinese;

public class AddReceiveAmountHandle {
    public AddReceiveAmountOperate rao;
    public CommonPageOperate co;
    public AddReceiveAmountHandle(BaseDriver baseDriver){
        this.rao = new AddReceiveAmountOperate(baseDriver);
        this.co = new CommonPageOperate(baseDriver);
    }
    public void addReceiveAmount(){
        rao.sendKeysToReceiveTime("2021-06-06");
        rao.sendKeysToReceiveAmount(GetMoney.getRandomMoney());
        rao.sendKeysToPayerInput(GetRandomChinese.create());
        rao.sendKeysToRemarkInput(GetRandomChinese.create());
        co.clickContentCloseButton();
    }
}
