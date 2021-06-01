package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.AddSettlementAmountOperate;
import utils.GetMoney;

public class AddSettlementAmountHandle {
    public AddSettlementAmountOperate sao;
    public AddSettlementAmountHandle(BaseDriver baseDriver){
        this.sao = new AddSettlementAmountOperate(baseDriver);
    }

    public void addSettlementAmount(){
        sao.sendKeysToSettlementTime("2020-07-06");
        sao.sendKeysToSettlementAmount(GetMoney.getRandomMoney());
    }
}
