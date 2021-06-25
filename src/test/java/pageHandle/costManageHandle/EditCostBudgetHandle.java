package pageHandle.costManageHandle;

import driverRelative.BaseDriver;
import enumString.CostBudget;
import pageElementOperate.costManageOperate.EditCostBudgetOperate;
import utils.GetMoney;
import utils.GetRandomChinese;

public class EditCostBudgetHandle {
    public EditCostBudgetOperate cbo;
    public EditCostBudgetHandle(BaseDriver baseDriver, int index){
        this.cbo = new EditCostBudgetOperate(baseDriver, index);
    }

    public void testEditBudget(){
        System.out.println(cbo.getTestOfCreateName());
        System.out.println(cbo.getTextOfCreateTime());
        System.out.println(cbo.getTextOfCreateDept());

        for(int i = 1 ;i<10;i++){
            cbo.sendKeysToAdjustAmountByIndex(i, GetMoney.getRandomMoney());
            cbo.sendKeysToBudgetRemarkByIndex(i, GetRandomChinese.create());
            System.out.println(cbo.getTextOfBudgetAfterByIndex(i));
            System.out.println(cbo.getTextOfBudgetAmountByIndex(i));
            System.out.println(cbo.getTextOfAdjustAmountByIndex(i));
            System.out.println(cbo.getTextOfBudgetRemarkByIndex(i));
        }
        cbo.sendKeysToAdjustAmountByName(CostBudget.SBF, GetMoney.getRandomMoney());
        cbo.sendKeysToBudgetRemarkByName(CostBudget.YYF, GetRandomChinese.create());
        System.out.println(cbo.getTextOfBudgetAfterByName(CostBudget.RYF));
        System.out.println(cbo.getTextOfBudgetAmountByName(CostBudget.FZF));
        System.out.println(cbo.getTextOfAdjustAmountByName(CostBudget.BGF));
        System.out.println(cbo.getTextOfBudgetRemarkByName(CostBudget.LDBHF));
        
    }
}
