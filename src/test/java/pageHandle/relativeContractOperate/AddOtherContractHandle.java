package pageHandle.relativeContractOperate;

import driverRelative.BaseDriver;
import pageElementOperate.CommonPageOperate;
import pageElementOperate.relativeContractOperate.OtherContractOperate;
import utils.GetContractNumber;
import utils.GetMoney;
import utils.GetRandomChinese;

public class AddOtherContractHandle {
    public OtherContractOperate oco;
    public CommonPageOperate co;
    public AddOtherContractHandle(BaseDriver baseDriver){
        this.oco = new OtherContractOperate(baseDriver);
        this.co = new CommonPageOperate(baseDriver);
    }

    public void addOtherContract(){
        oco.clickRelativeContractByRandom();
        oco.sendKeysToRegisterDateInput("2021-05-19");
        oco.sendKeysToContractNumber(GetContractNumber.getLastNumber(oco.lastContractNumber()));
        oco.sendKeysToProjectNameInput(GetRandomChinese.create(15));
        oco.sendKeysToProjectSiteInput(GetRandomChinese.create(30));
        oco.sendKeysToOtherSideInput(GetRandomChinese.create(42));
        oco.choosePracticingEntityRandom();
        oco.chooseEntrustMethodRandom();
        oco.sendKeysToContractAgentInput(GetRandomChinese.create(15));
        oco.sendKeysToContractApproveInput(GetRandomChinese.create(20));
        oco.sendKeysToContractCopiesInput(GetRandomChinese.create(5));
        oco.sendKeysToContractAmountInput(GetMoney.getRandomMoney(5,2));
        oco.sendKeysToCompleteAmountInput(GetMoney.getRandomMoney(2,0));
        oco.sendKeysToPerformanceTimeInput("2021-05-17");
        oco.sendKeysToSettlementAmountInput(GetMoney.getRandomMoney(4,1));
        oco.sendKeysToInvoiceAmountInput(GetMoney.getRandomMoney(3,0));
        oco.choosePaymentStatusRandom();
        oco.sendKeysToPaymentInput(GetMoney.getRandomMoney(6,0));
        oco.sendKeysToReturnTimeInput("2021-03-15");
        oco.sendKeysToRemarkInput(GetRandomChinese.create(50));
        co.clickCloseContent();
    }
}
