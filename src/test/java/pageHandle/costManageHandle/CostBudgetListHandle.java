package pageHandle.costManageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.costManageOperate.CostBudgetListOperate;

public class CostBudgetListHandle {
    public CostBudgetListOperate blo;
    public CostBudgetListHandle(BaseDriver baseDriver){
        this.blo = new CostBudgetListOperate(baseDriver);
    }

    public void testTableValue(){
        System.out.println(blo.getCellValue(1, "申请人"));
        System.out.println(blo.getRowValue(1).toString());
        blo.sendKeysToCreateDept("建设公司");
        blo.clickSearchButton();
        blo.clickResetButton();

        blo.clickCreateButton();
        blo.blp.baseDriver.refreshPage();
        blo.clickViewButton(1);
        blo.blp.baseDriver.refreshPage();
        blo.clickEditButton(1);
        blo.blp.baseDriver.refreshPage();
        blo.clickBudgetTime();
    }
}
