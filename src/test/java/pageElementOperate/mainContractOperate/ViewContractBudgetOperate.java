package pageElementOperate.mainContractOperate;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import pageElementOperate.BaseOperate;
import pageElements.operateContractPage.ViewContractBudgetPage;

public class ViewContractBudgetOperate extends BaseOperate {
    public ViewContractBudgetPage vbp;
    public BaseDriver baseDriver;
    public ViewContractBudgetOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.vbp = new ViewContractBudgetPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
    }


    /**
     *
     * @return  获取项目名称
     */
    public String getTextOfProjectName(){
        return getText(vbp.getContractProjectName());
    }

    // 合同编号
    public String getContractNumber(){
        return getText(vbp.getContractNumber());
    }

    // 合同金额
    public String getContractAmount(){
        return getText(vbp.getContractAmount());
    }

    // 开票金额
    public String getSettlementAmount(){
        return getText(vbp.getInvoiceAmount());
    }

    // 收款金额
    public String getReceiveAmount(){
        return getText(vbp.getReceiveAmount());
    }

    // 项目性质
    public String getProjectNature(){
        return getText(vbp.getProjectNature());
    }

    // 返回创建人
    public String getCreateName(){
        return getText(vbp.getCreateName());
    }

    // 返回创建部门
    public String getCreateDept(){
        return getText(vbp.getCreateDept());
    }

    // 通过行数获取预算金额
    public String getBudgetAmountByIndex(int index){
        return getText(vbp.getBudgetAmountByIndex(index));
    }

    // 通过行数获取预算备注
    public String getBudgetRemarkByIndex(int index){
        return getText(vbp.getRemarkByIndex(index));
    }

    //通过预算子项获取预算金额
    public String getBudgetAmountByName(ContractBudget name){
        return getText(vbp.getBudgetAmountByName(name));
    }

    //通过预算子项获取预算金额
    public String getBudgetRemarkByName(ContractBudget name){
        return getText(vbp.getBudgetRemarkByName(name));
    }

}
