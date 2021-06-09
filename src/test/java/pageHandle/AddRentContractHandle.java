package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.CommonPageOperate;
import pageElementOperate.RentContractOperate;
import utils.GetContractNumber;
import utils.GetMoney;
import utils.GetRandomChinese;

public class AddRentContractHandle {
    public RentContractOperate rco;
    public CommonPageOperate co;
    public AddRentContractHandle(BaseDriver baseDriver){
        this.rco = new RentContractOperate(baseDriver);
        this.co = new CommonPageOperate(baseDriver);
    }
    public void addRentContract(){
        rco.clickRelativeContractByRandom();
        rco.sendKeysToRegisterDateInput("2021-05-19");
        rco.sendKeysToContractNumber(GetContractNumber.getLastNumber(rco.lastContractNumber()));
        rco.sendKeysToProjectNameInput(GetRandomChinese.create(15));
        rco.sendKeysToProjectSiteInput(GetRandomChinese.create(30));
        rco.sendKeysToPartANameInput(GetRandomChinese.create(20));
        rco.sendKeysToPartBNameInput(GetRandomChinese.create(20));
        rco.choosePracticingEntityRandom();
        rco.chooseEntrustMethodRandom();
        rco.sendKeysToContractAgentInput(GetRandomChinese.create(15));
        rco.sendKeysToContractApproveInput(GetRandomChinese.create(20));
        rco.sendKeysToContractCopiesInput(GetRandomChinese.create(5));
        rco.sendKeysToContractAmountInput(GetMoney.getRandomMoney(5,2));
        rco.sendKeysToSettlementAmountInput(GetMoney.getRandomMoney(4,1));
        rco.sendKeysToInvoiceAmountInput(GetMoney.getRandomMoney(3,0));
        rco.choosePaymentStatusRandom();
        rco.sendKeysToPaymentInput(GetMoney.getRandomMoney(6,0));
        rco.sendKeysToPerformanceTimeInput("2021-05-17");
        rco.sendKeysToReturnTimeInput("2021-03-15");
        rco.sendKeysToRemarkInput(GetRandomChinese.create(50));
        co.clickCloseContent();
    }
}
