package pageElementOperate;

import driverRelative.BaseDriver;
import enumString.ContractBudget;
import pageElements.OperateContractPage.AddContractBudgetPage;

public class AddBudgetOperate extends BaseOperate{
    public AddContractBudgetPage abp;
    public BaseDriver baseDriver;

    public AddBudgetOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.baseDriver = baseDriver;
        this.abp = new AddContractBudgetPage(baseDriver);
        baseDriver.setRunSpeed(500);
    }


    /**
     *
     * @return 返回主合同编号
     */
    public String getContractNumber(){
        return getText(abp.getContractNumber());
    }

    public String getProjectName(){
        return getText(abp.getContractProjectName());
    }

    /**
     *
     * @return 返回主合同金额
     */
    public String getContractAmount(){
        return getText(abp.getContractAmount());
    }

    /**
     *
     * @return 获取开票金额
     */
    public String getInvoiceAmount() {
        return getText(abp.getInvoiceAmount());
    }

    /**
     *
     * @return 主合同收款金额
     */
    public String getReceiveAmount(){
        return getText(abp.getReceiveAmount());
    }

    /**
     *
     * @return 获取项目性质
     */
    public String getProjectNature(){
        return getText(abp.getProjectNature());
    }

    /**
     *  第几行的预算调整金额
     * @param index 第 index +1 行   index = 0 报账合计 index = 1 人员费 index = 2 其中技术绩效
     * @param value 输入金额具体数值
     */
    public void sendKeysToAdjustAmountInput(int index ,String value){
        if(index > 1){
            sendKeys(abp.getBudgetAdjustAmountByIndex(index), value);
        }
    }

    /**
     *
     * @param index 第 index + 1 行
     * @param value 输入具体的调整百分比
     */
    public void sendKeysToAdjustPercentInput(int index, String value) {
        if (index > 1) {
            sendKeys(abp.getBudgetAdjustPercentByIndex(index), value);
        }
    }


    /**
     *
     * @param index 第index + 1行
     * @param value 输入具体备注信息
     */
    public void sendKeysToRemarkInput(int index, String value){
        if( index >  0 ){
            sendKeys(abp.getBudgetRemarkByIndex(index), value);
        }
    }

    /**
     *   具体预算子项的调整预算金额输入框输入
     * @param budget 预算子项名称
     * @param value 输入金额具体数值
     */
    public void sendKeysToAdjustAmountInput(ContractBudget budget ,String value){
        sendKeys(abp.getBudgetAdjustAmountByName(budget), value);
    }

    /**
     *  具体预算子项的调整百分比输入框输入
     * @param budget 预算子项名称
     * @param value 预算金额
     */
    public void sendKeysToAdjustPercentInput(ContractBudget budget, String value){
        sendKeys(abp.getBudgetAdjustPercentByName(budget), value);
    }
    /**
     *
     * @param budget 预算子项名称
     * @param value 输入具体备注信息
     */
    public void sendKeysToRemarkInput(ContractBudget budget, String value){
        sendKeys(abp.getBudgetRemarkByName(budget), value);
    }

}
