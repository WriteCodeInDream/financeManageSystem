package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.AddContractPaymentOperate;
import pageElementOperate.CommonPageOperate;
import utils.GetMoney;
import utils.GetRandomChinese;

public class AddContractPaymentHandle {
    public AddContractPaymentOperate cpo;
    public CommonPageOperate co;
    public AddContractPaymentHandle(BaseDriver baseDriver){
        this.cpo = new AddContractPaymentOperate(baseDriver);
        this.co = new CommonPageOperate(baseDriver);
    }
    public void addContractPayment(){
        for(int i = 0; i < 58; i++){
            // 输入付款金额，开票金额
            if(i > 1){
                cpo.sendKeysToRemarkInput(i, GetRandomChinese.create());
            }
            if(i <54){
                // 输入备注，收款方
                cpo.sendKeysToPayment(i, GetMoney.getRandomMoney());
            }
        }
        co.clickContentCloseButton();
    }
}
