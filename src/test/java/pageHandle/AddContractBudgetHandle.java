package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.AddBudgetOperate;
import utils.GetMoney;
import utils.GetRandomChinese;

public class AddContractBudgetHandle {
    public AddBudgetOperate abo;
    public AddContractBudgetHandle(BaseDriver baseDriver){
        this.abo = new AddBudgetOperate(baseDriver);
    }

    public void addContractBudget(){
        for(int i = 0; i < 28; i++ ){
            if(i < 27){
                abo.sendKeysToAmountInput(i * 2, GetMoney.getRandomMoney());
            }
            abo.sendKeysToRemarkInput(i, GetRandomChinese.create());
        }
    }
}
