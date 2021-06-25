package pageHandle.costManageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.costManageOperate.CostPaymentListOperate;

public class CostPaymentHandle {
    public CostPaymentListOperate plo;
    public CostPaymentHandle(BaseDriver baseDriver){
        this.plo = new CostPaymentListOperate(baseDriver);
    }

    public void testViewPayment(){
        for(int i = 0; i <27; i++){
            System.out.println(plo.getTextOfBudgetAmountByIndex(i));
            System.out.println(plo.getTextOfBillTotalByIndex(i));
            System.out.println(plo.getTextOfPaymentTotalByIndex(i));
            System.out.println(plo.getTextOfBillAmountByIndex(i,1));
            System.out.println(plo.getTextOfPaymentAmountByIndex(i,1));
            System.out.println(plo.getTextOfRemarkByIndex(i, 1));
        }
    }
}
