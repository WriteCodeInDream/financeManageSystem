package pageElementOperate.costManageOperate;

import driverRelative.BaseDriver;
import enumString.CostBudget;
import pageElementOperate.BaseOperate;
import pageElements.costManage.CostPaymentListPage;

public class CostPaymentListOperate extends BaseOperate {
    public CostPaymentListPage plp;
    public BaseDriver baseDriver;
    public CostPaymentListOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.plp = new CostPaymentListPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
    }

    public String getTextOfBudgetAmountByIndex(int index){
        return getText(plp.getBudgetAmountByIndex(index));
    }

    public String getTextOfBudgetAmountByName(CostBudget name){
        return getText(plp.getBudgetAmountByName(name));
    }

    public String getTextOfBillTotalByIndex(int index){
        return getText(plp.getBillTotalByIndex(index));
    }

    public String getTextOfBillTotalByName(CostBudget name){
        return getText(plp.getBillTotalByName(name));
    }

    public String getTextOfPaymentTotalByIndex(int index){
        return getText(plp.getPaymentTotalByIndex(index));
    }

    public String getTextOfPaymentTotalByName(CostBudget name){
        return getText(plp.getPaymentTotalByName(name));
    }

    public String getTextOfPaymentAmountByIndex(int index,int paymentIndex){
        return getText(plp.getPaymentAmountByIndex(index,paymentIndex));
    }

    public String getTextOfPaymentAmountByName(CostBudget name,int paymentIndex){
        return getText(plp.getPaymentAmountByName(name, paymentIndex));
    }

    public String getTextOfBillAmountByIndex(int index,int paymentIndex){
        return getText(plp.getBillAmountByIndex(index,paymentIndex));
    }

    public String getTextOfBillAmountByName(CostBudget name,int paymentIndex){
        return getText(plp.getBillAmountByName(name, paymentIndex));
    }

    public String getTextOfRemarkByIndex(int index,int paymentIndex){
        return getText(plp.getRemarkByIndex(index,paymentIndex));
    }

    public String getTextOfRemarkByName(CostBudget name,int paymentIndex){
        return getText(plp.getRemarkByName(name, paymentIndex));
    }

    
}
