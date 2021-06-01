package pageHandle;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import pageElementOperate.EditBudgetOperate;
import utils.GetMoney;
import utils.GetRandomChinese;

public class EditBudgetHandle {
    public EditBudgetOperate ebo;
    public EditBudgetHandle(BaseDriver baseDriver){
        this.ebo = new EditBudgetOperate(baseDriver);
    }

    public void editBudget(){
        System.out.println(ebo.getContractAmount());
        System.out.println(ebo.getContractNumber());
        System.out.println(ebo.getProjectNature());
        System.out.println(ebo.getSettlementAmount());
        System.out.println(ebo.getReceiveAmount());
        System.out.println(ebo.getTextOfProjectName());

        System.out.println(ebo.getBudgetAmount(3));
        System.out.println(ebo.getBudgetAmount(ContractBudget.QZXMGZ));

        for(int i = 2; i < 10 ; i ++){
            ebo.sendKeysToAdjustPercent(i, GetMoney.getRandomMoney(2,2));
        }
        ebo.sendKeysToAdjustPercent(ContractBudget.FZDJBYJ, GetMoney.getRandomMoney(2,2));

        for(int i = 11; i < 25 ; i ++){
            ebo.sendKeysToAdjustAmount(i, GetMoney.getRandomMoney(2,2));
        }
        ebo.sendKeysToAdjustAmount(ContractBudget.SZJY, GetMoney.getRandomMoney(2,2));

        for (int i = 2; i < 5; i ++ ){
            System.out.println(ebo.getAfterAdjustAmount(i));
            ebo.sendKeysToRemark(i , GetRandomChinese.create());
            System.out.println(ebo.getRemark(i));
        }

        ebo.sendKeysToRemark(ContractBudget.HYF, GetRandomChinese.create());
        System.out.println(ebo.getRemark(ContractBudget.HYF));
    }
}
