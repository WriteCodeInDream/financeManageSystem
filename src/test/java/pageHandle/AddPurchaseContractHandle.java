package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.CommonPageOperate;
import pageElementOperate.PurchaseContractOperate;
import utils.GetContractNumber;
import utils.GetMoney;
import utils.GetRandomChinese;

public class AddPurchaseContractHandle {
    public PurchaseContractOperate pco;
    public CommonPageOperate co;
    public AddPurchaseContractHandle(BaseDriver baseDriver){
        this.pco = new PurchaseContractOperate(baseDriver);
        this.co = new CommonPageOperate(baseDriver);
    }

    public void addPurchaseContract(){
        pco.clickRelativeContractByRandom();
        pco.sendKeysToRegisterDateInput("2021-05-19");
        pco.sendKeysToContractNumber(GetContractNumber.getLastNumber(pco.lastContractNumber()));
        pco.sendKeysToProjectNameInput(GetRandomChinese.create(15));
        pco.sendKeysToProjectSiteInput(GetRandomChinese.create(30));
        pco.sendKeysToBuyerNameInput(GetRandomChinese.create(20));
        pco.sendKeysToSupplierNameInput(GetRandomChinese.create(20));
        pco.choosePracticingEntityRandom();
        pco.chooseEntrustMethodRandom();
        pco.sendKeysToContractAgentInput(GetRandomChinese.create(15));
        pco.sendKeysToContractApproveInput(GetRandomChinese.create(20));
        pco.sendKeysToContractCopiesInput(GetRandomChinese.create(5));
        pco.sendKeysToContractAmountInput(GetMoney.getRandomMoney(5,2));
        pco.sendKeysToSettlementAmountInput(GetMoney.getRandomMoney(4,1));
        pco.sendKeysToInvoiceAmountInput(GetMoney.getRandomMoney(3,0));
        pco.choosePaymentStatusRandom();
        pco.sendKeysToPaymentInput(GetMoney.getRandomMoney(6,0));
        pco.sendKeysToPerformanceTimeInput("2021-05-17");
        pco.sendKeysToReturnTimeInput("2021-03-15");
        pco.sendKeysToRemarkInput(GetRandomChinese.create(50));
        co.clickContentCloseButton();
    }
}
