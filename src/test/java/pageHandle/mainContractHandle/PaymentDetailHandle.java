package pageHandle.mainContractHandle;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import pageElementOperate.mainContractOperate.PaymentDetailOperate;

public class PaymentDetailHandle {
    public PaymentDetailOperate pdo;
    public PaymentDetailHandle(BaseDriver baseDriver){
        this.pdo = new PaymentDetailOperate(baseDriver);
    }



    public void testPaymentDetail(){
        System.out.println(pdo.getProjectNature());
        System.out.println(pdo.getTextOfProjectName());
        System.out.println(pdo.getInvoiceAmount());
        System.out.println(pdo.getReceiveAmount());
        System.out.println(pdo.getContractNumber());
        System.out.println(pdo.getContractAmount());

        for(int i = 0 ;i < 15 ; i++){
            System.out.println("----------"+i+"----------");
            System.out.println(pdo.getBudgetByIndex(i));
            System.out.println(pdo.getTotalBillByIndexText(i));
            System.out.println(pdo.getTotalPaymentByIndexText(i));
        }


        for(int j = 1 ; j < 3; j++){
            System.out.println("----------"+j+"----------");
            for(int i = 0 ;i < 5 ; i++){
                System.out.println("----------"+i+"----------");
                System.out.println(pdo.getPaymentAmountByIndexText(i, j));
                System.out.println(pdo.getBillAmountByIndexText(i, j));
                System.out.println(pdo.getReceiverNameByIndexText(i , j));
                System.out.println(pdo.getRemarkByIndexText(i , j));
            }
        }


        System.out.println(pdo.getBudgetByNameText(ContractBudget.QZJYJL));
        System.out.println(pdo.getTotalPaymentByNameText(ContractBudget.LWF));
        System.out.println(pdo.getTotalBillByNameText(ContractBudget.BGF));
        System.out.println(pdo.getPaymentAmountByNameText(ContractBudget.QZJSJX, 1));
        System.out.println(pdo.getBillAmountByNameText(ContractBudget.JTF, 1));
        System.out.println(pdo.getReceiverNameByNameText(ContractBudget.SBZJGJF, 1));
        System.out.println(pdo.getRemarkByNameText(ContractBudget.QZQMF, 1));

        System.out.println(pdo.getPaymentInfo(1));
        System.out.println(pdo.getPaymentInfo(2));
        System.out.println(pdo.getPaymentInfo(3));
        pdo.clickExportButton(1);
        pdo.clickEditButton(1);
    }
}
