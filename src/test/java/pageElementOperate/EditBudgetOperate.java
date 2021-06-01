package pageElementOperate;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import pageElements.OperateContractPage.EditContractBudgetPage;

public class EditBudgetOperate extends BaseOperate{
    public EditContractBudgetPage ebp;
    public BaseDriver baseDriver;
    public EditBudgetOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.ebp = new EditContractBudgetPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
    }

    public String getTextOfProjectName(){
        return getText(ebp.getContractProjectName());
    }

    public String getContractNumber(){
        return getText(ebp.getContractNumber());
    }

    public String getContractAmount(){
        return getText(ebp.getContractAmount());
    }

    public String getSettlementAmount(){
        return getText(ebp.getSettlementAmount());
    }

    public String getReceiveAmount(){
        return getText(ebp.getReceiveAmount());
    }

    public String getProjectNature(){
        return getText(ebp.getProjectNature());
    }

    public String getBudgetAmount(ContractBudget name){
        return getText(ebp.getBudgetAmountByName(name));
    }

    public void sendKeysToAdjustPercent(ContractBudget name, String value){
        sendKeys(ebp.getBudgetAdjustPercentByName(name), value);
    }

    public void sendKeysToAdjustAmount(ContractBudget name, String value){
        sendKeys(ebp.getBudgetAdjustAmountByName(name), value);
    }

    public String getAfterAdjustAmount(ContractBudget name){
        return getText(ebp.getBudgetAfterAdjustByName(name));
    }

    public void sendKeysToRemark(ContractBudget name, String value){
        sendKeys(ebp.getBudgetRemarkByName(name), value);
    }

    public String getRemark(ContractBudget name){
        return getAttribute(ebp.getBudgetRemarkByName(name));
    }

    public String getBudgetAmount(int index){
        return getText(ebp.getBudgetAmountByIndex(index));
    }

    public void sendKeysToAdjustPercent(int index, String value){
        sendKeys(ebp.getBudgetAdjustPercentByIndex(index), value);
    }

    public void sendKeysToAdjustAmount(int index, String value){
        sendKeys(ebp.getBudgetAdjustAmountByIndex(index), value);
    }

    public String getAfterAdjustAmount(int index){
        return getText(ebp.getBudgetAfterAdjustByIndex(index));
    }

    public void sendKeysToRemark(int index, String value){
        sendKeys(ebp.getBudgetRemarkByIndex(index), value);
    }

    public String getRemark(int index){
        return getAttribute(ebp.getBudgetRemarkByIndex(index));
    }
}
