package pageHandle;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import pageElementOperate.AddBudgetOperate;
import pageElementOperate.CommonPageOperate;
import utils.GetMoney;
import utils.GetRandomChinese;

public class AddContractBudgetHandle {
    public AddBudgetOperate abo;
    public CommonPageOperate co;
    public AddContractBudgetHandle(BaseDriver baseDriver){
        this.abo = new AddBudgetOperate(baseDriver);
        this.co = new CommonPageOperate( baseDriver);
    }

    public void addContractBudget(){
        // 获取合同预算关联主合同相关信息
        System.out.println(abo.getContractAmount());
        System.out.println(abo.getContractNumber());
        System.out.println(abo.getProjectName());
        System.out.println(abo.getProjectNature());
        System.out.println(abo.getInvoiceAmount());
        System.out.println(abo.getReceiveAmount());
        // 通过index 输入调整预算金额
        for(int i = 2 ;i < 6 ;i ++){
            abo.sendKeysToAdjustAmountInput(i, GetMoney.getRandomMoney());
        }
            // 通过index 输入调整预算金额百分比
        for(int i = 7 ;i < 12; i++){
            abo.sendKeysToAdjustPercentInput(i , GetMoney.getRandomMoney(2 , 2));
        }
        // 通过index 输入备注
        for(int i = 13 ; i < 18; i++){
            abo.sendKeysToRemarkInput(i, GetRandomChinese.create());
        }

        abo.sendKeysToRemarkInput(ContractBudget.WXHF, GetRandomChinese.create());
        abo.sendKeysToAdjustPercentInput(ContractBudget.YDF, GetMoney.getRandomMoney(2, 2));
        abo.sendKeysToAdjustAmountInput(ContractBudget.AQCSF, GetMoney.getRandomMoney());
        co.clickCancelContent();
    }
}
