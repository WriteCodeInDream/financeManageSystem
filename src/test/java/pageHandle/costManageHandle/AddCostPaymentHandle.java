package pageHandle.costManageHandle;

import driverRelative.BaseDriver;
import enumString.CostBudget;
import pageElementOperate.CommonPageOperate;
import pageElementOperate.costManageOperate.AddCostPaymentOperate;
import utils.GetMoney;
import utils.GetRandomChinese;

public class AddCostPaymentHandle {
    public AddCostPaymentOperate cpo;
    public CommonPageOperate co;
    public AddCostPaymentHandle(BaseDriver baseDriver) {
        this.cpo = new AddCostPaymentOperate(baseDriver);
        this.co = new CommonPageOperate(baseDriver);
    }

    public void addContractPayment() {
        System.out.println(cpo.getCreateInfo());
        System.out.println(cpo.getCreateDept());
        for (int i = 2; i < 8; i++) {
            cpo.sendKeysToCurrentBillAmountByIndex(i, GetMoney.getRandomMoney());
            cpo.sendKeysToCurrentPaymentAmountByIndex(i, GetMoney.getRandomMoney());
            cpo.sendKeysToRemarkInputByIndex(i, GetRandomChinese.create());
            System.out.println(cpo.getFinalBudgetByIndex(i));
            System.out.println(cpo.getSumBillAmountByIndex(i));
            System.out.println(cpo.getSumPaymentAmountByIndex(i));
        }
        cpo.sendKeysToCurrentBillAmountByName(CostBudget.FLF, GetMoney.getRandomMoney());
        cpo.sendKeysToCurrentPaymentAmountByName(CostBudget.QT, GetMoney.getRandomMoney());
        cpo.sendKeysToRemarkInputByName(CostBudget.CLF, GetRandomChinese.create());
        System.out.println(cpo.getFinalBudgetByName(CostBudget.ZFGJJ));
        System.out.println(cpo.getSumBillAmountByName(CostBudget.QT));
        System.out.println(cpo.getSumPaymentAmountByName(CostBudget.AQFY));
       // co.clickCloseContent();
    }
}