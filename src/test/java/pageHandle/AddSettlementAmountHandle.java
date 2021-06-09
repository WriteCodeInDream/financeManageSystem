package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.AddSettlementAmountOperate;
import pageElementOperate.CommonPageOperate;
import utils.GetMoney;

public class AddSettlementAmountHandle {
    public AddSettlementAmountOperate sao;
    public CommonPageOperate co;
    public AddSettlementAmountHandle(BaseDriver baseDriver){
        this.sao = new AddSettlementAmountOperate(baseDriver);
        this.co = new CommonPageOperate(baseDriver);
    }

    public void addSettlementAmount(){
        sao.sendKeysToSettlementTime("2020-07-06");
        sao.sendKeysToSettlementAmount(GetMoney.getRandomMoney());
        co.clickCommitContent();
    }
}
