package pageHandle.costManageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.costManageOperate.AddCostBudgetOperate;
import utils.GetMoney;
import utils.GetRandomChinese;

public class AddCostBudgetHandle {
    public AddCostBudgetOperate cbo;
    public AddCostBudgetHandle(BaseDriver baseDriver){
        this.cbo = new AddCostBudgetOperate(baseDriver);
    }

    public void testAddBudget(){
        System.out.println(cbo.getCreateDept());
        System.out.println(cbo.getCreateName());
        for (int i = 1; i < 15; i++) {
            cbo.sendKeysToAmountByIndex(i, GetMoney.getRandomMoney());
            cbo.sendKeysToRemarkByIndex(i, GetRandomChinese.create());
        }
    }
}
