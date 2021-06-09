package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.CommonPageOperate;
import pageElementOperate.SubcontractPageOperate;
import utils.GetContractNumber;
import utils.GetMoney;
import utils.GetRandomChinese;
import utils.UploadFile;



public class AddSubcontractPageHandle {
    public SubcontractPageOperate spo;
    public CommonPageOperate co;
    public AddSubcontractPageHandle(BaseDriver baseDriver){
        this.spo = new SubcontractPageOperate(baseDriver);
        this.co = new CommonPageOperate(baseDriver);
    }

    public void addSubContract(){
        spo.clickRelativeContractByRandom();
        spo.sendKeysToRegisterDateInput("2021-05-19");
        spo.sendKeysToContractNumber(GetContractNumber.getLastNumber(spo.lastContractNumber()));
        spo.sendKeysToProjectNameInput(GetRandomChinese.create(15));
        spo.sendKeysToProjectSiteInput(GetRandomChinese.create(30));
        spo.sendKeysToClientUnitInput(GetRandomChinese.create(42));
        spo.choosePracticingEntityRandom();
        spo.chooseEntrustMethodRandom();
        spo.sendKeysToContractAgentInput(GetRandomChinese.create(15));
        spo.sendKeysToContractApproveInput(GetRandomChinese.create(20));
        spo.sendKeysToContractCopiesInput(GetRandomChinese.create(5));
        spo.sendKeysToContractAmountInput(GetMoney.getRandomMoney(5,2));
        spo.sendKeysToCompleteAmountInput(GetRandomChinese.create(16));
        spo.sendKeysToPerformanceTimeInput("2021-05-17");
        spo.sendKeysToSettlementAmountInput(GetMoney.getRandomMoney(4,1));
        spo.sendKeysToInvoiceAmountInput(GetMoney.getRandomMoney(3,0));
        spo.choosePaymentStatusRandom();
        spo.sendKeysToPaymentInput(GetMoney.getRandomMoney(6,0));
        spo.sendKeysToReturnTimeInput("2021-03-15");
        spo.sendKeysToRemarkInput(GetRandomChinese.create(50));
        spo.clickUploadFileButton();
        String[] files = {"1.jpg","访客记录图片.jpg"};
        UploadFile.uploadFile("D:\\奇怪的文件\\bug截图\\", files);
        co.clickCloseContent();
    }
}
