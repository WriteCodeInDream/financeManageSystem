package pageHandle.costManageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.costManageOperate.ViewCostBudgetOperate;

public class ViewCostBudgetHandle {
    public ViewCostBudgetOperate cbo;
    public ViewCostBudgetHandle(BaseDriver baseDriver, int index){
        this.cbo = new ViewCostBudgetOperate(baseDriver ,index);
    }

    public void testViewBudget(){
        System.out.println(cbo.getCreateDept());
        System.out.println(cbo.getCreateName());
        System.out.println(cbo.getCreateTime());
        for(int i = 0; i < 20 ; i++ ){
            System.out.println(cbo.getBudgetRemarkByIndex(i));
            System.out.println(cbo.getBudgetAmountByIndex(i));
        }
    }
}
