package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.CommonPageOperate;
import pageElementOperate.QueryContractOperate;
import utils.GetContractNumber;
import utils.GetMoney;
import utils.GetRandomChinese;

public class AddQueryContractHandle {
    public QueryContractOperate qco;
    public CommonPageOperate co;
    public AddQueryContractHandle(BaseDriver baseDriver){
        this.qco = new QueryContractOperate(baseDriver);
        this.co = new CommonPageOperate(baseDriver);
    }

    public void addQueryContract(){
        qco.clickRelativeContractByRandom();
        qco.sendKeysToRegisterDateInput("2021-05-19");
        qco.sendKeysToContractNumber(GetContractNumber.getLastNumber(qco.lastContractNumber()));
        qco.sendKeysToProjectNameInput(GetRandomChinese.create(15));
        qco.sendKeysToProjectSiteInput(GetRandomChinese.create(30));
        qco.sendKeysToOtherSideInput(GetRandomChinese.create(20));
        qco.choosePracticingEntityRandom();
        qco.chooseEntrustMethodRandom();
        qco.sendKeysToContractAgentInput(GetRandomChinese.create(15));
        qco.sendKeysToContractApproveInput(GetRandomChinese.create(20));
        qco.sendKeysToContractCopiesInput(GetRandomChinese.create(5));
        qco.sendKeysToContractAmountInput(GetMoney.getRandomMoney(5,2));
        qco.sendKeysToSettlementAmountInput(GetMoney.getRandomMoney(4,1));
        qco.sendKeysToInvoiceAmountInput(GetMoney.getRandomMoney(3,0));
        qco.choosePaymentStatusRandom();
        qco.sendKeysToPaymentInput(GetMoney.getRandomMoney(6,0));
        qco.sendKeysToPerformanceTimeInput("2021-05-17");
        qco.sendKeysToCompleteAmountInput(GetMoney.getRandomMoney(2,0));
        qco.sendKeysToReturnTimeInput("2021-03-15");
        qco.sendKeysToRemarkInput(GetRandomChinese.create(50));
        co.clickCloseContent();
    }
}
