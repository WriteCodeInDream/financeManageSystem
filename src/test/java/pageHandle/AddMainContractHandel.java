package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.CommonPageOperate;
import pageElementOperate.MainContractOperate;
import utils.GetContractNumber;
import utils.GetMoney;
import utils.GetRandomChinese;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AddMainContractHandel {
    public MainContractOperate mco;
    public CommonPageOperate co;
    public AddMainContractHandel(BaseDriver baseDriver){
        this.mco = new MainContractOperate(baseDriver);
        this.co = new CommonPageOperate(baseDriver);
    }

    /**
     *
     * @return 当天时间
     */
    public String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-MM");
        Date date = new Date();
        return sdf.format(date);
    }



    public void addMainContract(){
        mco.sendKeysToRegisterDateInput("2022-03-24");
        mco.chooseTypeRandom();
        mco.sendKeysToContractNumberInput(GetContractNumber.getLastNumber(mco.getLastNumber()));
        mco.sendKeysToProjectNameInput(GetRandomChinese.create(10));
        mco.sendKeysToPerformanceTimeInput("2025-08-26");
        mco.sendKeysToReturnTimeInput("2024-02-15");
        mco.choosePracticingEntityRandom();
        mco.sendKeysToSettlementAmountInput(GetMoney.getRandomMoney(4 , 0));
        mco.sendKeysToContractMoneyInput(GetMoney.getRandomMoney(5,1));
        mco.sendKeysToInvoiceAmountInput(GetMoney.getRandomMoney(6, 2));
        mco.sendKeysToReceiveAmountInput(GetMoney.getRandomMoney(7, 1));
        mco.sendKeysToProjectNameInput(GetRandomChinese.create(20));
        mco.sendKeysToProjectNatureInput(GetRandomChinese.create(15));
        mco.sendKeysToProjectSourceInput(GetRandomChinese.create(40));
        mco.sendKeysToContractAgentInput(GetRandomChinese.create(23));
        mco.sendKeysToContractApproveInput(GetRandomChinese.create(37));
        mco.sendKeysToContractSiteInput(GetRandomChinese.create(28));
        mco.sendKeysToContractCopiesInput(GetRandomChinese.create(28));
        mco.sendKeysToRemarkInput(GetRandomChinese.create(37));
        mco.sendKeysToEntrustCompany(GetRandomChinese.create(15));
        co.clickCloseContent();
    }
}
