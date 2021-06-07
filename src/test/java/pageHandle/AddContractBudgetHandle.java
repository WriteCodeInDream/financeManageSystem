package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.AddBudgetOperate;
import pageElementOperate.CommonPageOperate;
import utils.GetMoney;
import utils.GetRandomChinese;

public class AddContractBudgetHandle {
    public AddBudgetOperate abo;
    public CommonPageOperate co;
    public AddContractBudgetHandle(BaseDriver baseDriver){
        this.abo = new AddBudgetOperate(baseDriver);
        this.co = new CommonPageOperate(baseDriver);
    }

    public void addContractBudget(){
        for(int i = 0; i < 28; i++ ){
            if(i < 27){
                abo.sendKeysToAmountInput(i * 2, GetMoney.getRandomMoney());
            }
            abo.sendKeysToRemarkInput(i, GetRandomChinese.create());
        }
        co.clickContentCloseButton();
    }
}
