package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.UpdateMainContractOperate;
import utils.GetMoney;

public class UpdateMainContractHandle {
    public UpdateMainContractOperate umo;
    public UpdateMainContractHandle(BaseDriver baseDriver){
        this.umo = new UpdateMainContractOperate(baseDriver);
    }

    public void testUpdateContractTest(){
        System.out.println(umo.getTextOfContractAgent());
        System.out.println(umo.getTextOfContractAmount());
        System.out.println(umo.getTextOfRemark());
        System.out.println(umo.getTextOfContractApprove());
        System.out.println(umo.getTextOfEntrustCompany());
        System.out.println(umo.getTextOfInvoiceAmount());
        umo.sendKeysToRegisterDate("2021-08-15");
        umo.sendKeysToMainContractType("见证");
        umo.sendKeysToPracticingEntity();
        umo.sendKeysToContractAmount(GetMoney.getRandomMoney());
    }
}
