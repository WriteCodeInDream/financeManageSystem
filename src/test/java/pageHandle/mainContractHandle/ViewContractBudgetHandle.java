package pageHandle.mainContractHandle;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import pageElementOperate.CommonPageOperate;
import pageElementOperate.mainContractOperate.ViewContractBudgetOperate;


public class ViewContractBudgetHandle {
    public ViewContractBudgetOperate vbo;
    public CommonPageOperate co;
    public ViewContractBudgetHandle(BaseDriver baseDriver){
        this.co = new CommonPageOperate(baseDriver);
        this.vbo = new ViewContractBudgetOperate(baseDriver);
    }

    public void testViewContractBudget(){
        System.out.println(vbo.getContractAmount());
        System.out.println(vbo.getContractNumber());
        System.out.println(vbo.getReceiveAmount());
        System.out.println(vbo.getSettlementAmount());
        System.out.println(vbo.getProjectNature());
        System.out.println(vbo.getTextOfProjectName());
        System.out.println(vbo.getCreateName());
        System.out.println(vbo.getCreateDept());
        for(int i = 1; i < 8; i++ ){
            System.out.println(vbo.getBudgetAmountByIndex(i));
            System.out.println(vbo.getBudgetRemarkByIndex(i));
        }
        System.out.println(vbo.getBudgetAmountByName(ContractBudget.QZJYJL));
        System.out.println(vbo.getBudgetRemarkByName(ContractBudget.YSF));
    }
}
