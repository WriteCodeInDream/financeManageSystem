package pageHandle.mainContractHandle;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import pageElementOperate.mainContractOperate.AddContractPaymentOperate;
import pageElementOperate.CommonPageOperate;
import utils.GetMoney;
import utils.GetRandomChinese;

public class AddContractPaymentHandle {
    public AddContractPaymentOperate cpo;
    public CommonPageOperate co;
    public AddContractPaymentHandle(BaseDriver baseDriver) {
        this.cpo = new AddContractPaymentOperate(baseDriver);
        this.co = new CommonPageOperate(baseDriver);
    }

    public void addContractPayment() {
        // 获取合同预算关联主合同相关信息
        System.out.println(cpo.getContractAmount());
        System.out.println(cpo.getContractNumber());
        System.out.println(cpo.getProjectName());
        System.out.println(cpo.getProjectNature());
        System.out.println(cpo.getInvoiceAmount());
        System.out.println(cpo.getReceiveAmount());
        for (int i = 2; i < 8; i++) {
            cpo.sendKeysToCurrentBillAmountByIndex(i, GetMoney.getRandomMoney());
            cpo.sendKeysToCurrentPaymentAmountByIndex(i, GetMoney.getRandomMoney());
            cpo.sendKeysToPayeeInputByIndex(i, GetRandomChinese.create());
            cpo.sendKeysToRemarkInputByIndex(i, GetRandomChinese.create());
            System.out.println(cpo.getFinalBudgetByIndex(i));
            System.out.println(cpo.getSumBillAmountByIndex(i));
            System.out.println(cpo.getSumPaymentAmountByIndex(i));
        }
        cpo.sendKeysToPayeeInputByName(ContractBudget.LWF, GetRandomChinese.create());
        cpo.sendKeysToCurrentBillAmountByName(ContractBudget.HYF, GetMoney.getRandomMoney());
        cpo.sendKeysToCurrentPaymentAmountByName(ContractBudget.QZJYJL, GetMoney.getRandomMoney());
        cpo.sendKeysToPayeeInputByName(ContractBudget.AQCSF, GetRandomChinese.create());
        cpo.sendKeysToRemarkInputByName(ContractBudget.CLF, GetRandomChinese.create());
        System.out.println(cpo.getFinalBudgetByName(ContractBudget.JTF));
        System.out.println(cpo.getSumBillAmountByName(ContractBudget.QT));
        System.out.println(cpo.getSumPaymentAmountByName(ContractBudget.SBZJGJF));
        co.clickCloseContent();
    }
}