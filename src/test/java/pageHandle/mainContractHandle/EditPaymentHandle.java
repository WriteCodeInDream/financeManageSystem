package pageHandle.mainContractHandle;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import pageElementOperate.mainContractOperate.EditPaymentOperate;
import utils.GetMoney;
import utils.GetRandomChinese;

public class EditPaymentHandle {
    public EditPaymentOperate epo;
    public EditPaymentHandle(BaseDriver baseDriver){
        this.epo = new EditPaymentOperate(baseDriver);
    }

    public void testEditPayment(){
        System.out.println(epo.getContractAmount());
        System.out.println(epo.getContractNumber());
        System.out.println(epo.getSettlementAmount());
        System.out.println(epo.getReceiveAmount());
        System.out.println(epo.getProjectNature());
        System.out.println(epo.getTextOfProjectName());
        System.out.println(epo.getCreateDeptText());
        System.out.println(epo.getCreateTimeText());
        System.out.println(epo.getCreateNameText());
        for(int i = 0; i < 5; i++){
            System.out.println("--------"+i+"--------");
            System.out.println(epo.getPaymentAmountByIndex(i));
            System.out.println(epo.getBillAmountByIndex(i));
            System.out.println(epo.getBudgetTotalByIndex(i));
            System.out.println(epo.getReceiverByIndex(i));
            System.out.println(epo.getPaymentRemarkByIndex(i));
            System.out.println(epo.getPaymentTotalByIndex(i));
            System.out.println(epo.getBillTotalByIndex(i));
        }
        for(int i = 6; i < 10; i++){
            epo.sendKeysToBillAmountByIndex(GetMoney.getRandomMoney(),i);
            epo.sendKeysToPaymentAmountByIndex(GetMoney.getRandomMoney(),i);
            epo.sendKeysToPaymentRemarkByIndex(GetRandomChinese.create(), i);
            epo.sendKeysToReceiverByIndex(GetRandomChinese.create(), i);
        }

        epo.sendKeysToBillAmountByName(GetRandomChinese.create(), ContractBudget.QZJYJL);
        epo.sendKeysToPaymentAmountByName(GetRandomChinese.create(), ContractBudget.CLF);
        epo.sendKeysToPaymentRemarkByName(GetRandomChinese.create(),ContractBudget.LWF);
        epo.sendKeysToReceiverByName(GetRandomChinese.create(),ContractBudget.QT);


        System.out.println(epo.getPaymentRemarkByName(ContractBudget.QZNSJX));
        System.out.println(epo.getBudgetTotalByValue(ContractBudget.RYFQZQT));
        System.out.println(epo.getBillTotalByName(ContractBudget.SDNF));
        System.out.println(epo.getPaymentAmountByName(ContractBudget.SBZJGJF));
        System.out.println(epo.getPaymentTotalByName(ContractBudget.BGF));
        System.out.println(epo.getBillAmountByName(ContractBudget.SBZLF));
        System.out.println(epo.getReceiverByName(ContractBudget.JTF));

    }
}
