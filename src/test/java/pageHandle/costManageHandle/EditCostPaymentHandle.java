package pageHandle.costManageHandle;

import driverRelative.BaseDriver;
import enumString.CostBudget;
import pageElementOperate.costManageOperate.EditCostPaymentOperate;
import utils.GetMoney;
import utils.GetRandomChinese;

public class EditCostPaymentHandle {
    public EditCostPaymentOperate epo;
    public EditCostPaymentHandle(BaseDriver baseDriver, int index){
        this.epo = new EditCostPaymentOperate(baseDriver, index);
    }

    public void testEditPayment(){
        System.out.println(epo.getTestOfCreateName());
        System.out.println(epo.getTextOfCreateTime());
        System.out.println(epo.getTextOfCreateDept());
        for(int i = 0; i < 5; i++){
            System.out.println("--------"+i+"--------");
            System.out.println(epo.getPaymentAmountByIndex(i));
            System.out.println(epo.getBillAmountByIndex(i));
            System.out.println(epo.getBudgetTotalByIndex(i));
            System.out.println(epo.getPaymentRemarkByIndex(i));
            System.out.println(epo.getPaymentTotalByIndex(i));
            System.out.println(epo.getBillTotalByIndex(i));
        }
        for(int i = 6; i < 10; i++){
            epo.sendKeysToBillAmountByIndex(GetMoney.getRandomMoney(),i);
            epo.sendKeysToPaymentAmountByIndex(GetMoney.getRandomMoney(),i);
            epo.sendKeysToPaymentRemarkByIndex(GetRandomChinese.create(), i);
        }

        epo.sendKeysToBillAmountByName(GetMoney.getRandomMoney(), CostBudget.ZLYSF);
        epo.sendKeysToPaymentAmountByName(GetMoney.getRandomMoney(), CostBudget.CLF);
        epo.sendKeysToPaymentRemarkByName(GetRandomChinese.create(),CostBudget.LWF);


        System.out.println(epo.getPaymentRemarkByName(CostBudget.FZF));
        System.out.println(epo.getBudgetTotalByValue(CostBudget.BGF));
        System.out.println(epo.getBillTotalByName(CostBudget.LDBHF));
        System.out.println(epo.getPaymentAmountByName(CostBudget.XCBXF));
        System.out.println(epo.getPaymentTotalByName(CostBudget.BGF));
        System.out.println(epo.getBillAmountByName(CostBudget.YYF));

    }
}
