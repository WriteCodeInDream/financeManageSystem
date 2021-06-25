package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.ViewMainContractOperate;

public class ViewMainContractHandle {
    public ViewMainContractOperate mco;
    public ViewMainContractHandle(BaseDriver baseDriver){
        this.mco = new ViewMainContractOperate(baseDriver);
    }

    public void testViewMainContract() {
        System.out.println(mco.getTextOfContractBillTotal());
        System.out.println(mco.getTextOfApproveStatus());
        System.out.println(mco.getTextOfContractAgent());
        System.out.println(mco.getTextOfRemark());
    }
}
