package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.AddInvoiceAmountOperate;
import pageElementOperate.CommonPageOperate;
import utils.GetMoney;
import utils.GetRandomChinese;

public class AddInvoiceAmountHandle {
    public AddInvoiceAmountOperate iao;
    public CommonPageOperate co;
    public AddInvoiceAmountHandle(BaseDriver baseDriver){
        this.iao = new AddInvoiceAmountOperate(baseDriver);
        this.co = new CommonPageOperate(baseDriver);
    }

    public void addInvoiceAmount(){
        iao.sendKeysToInvoiceTime("2021-06-08");
        iao.sendKeysToInvoiceAmount(GetMoney.getRandomMoney());
        iao.sendKeysToBuyerInput(GetRandomChinese.create());
        iao.sendKeysToRemarkInput(GetRandomChinese.create());
        co.clickCloseContent();
    }
}
