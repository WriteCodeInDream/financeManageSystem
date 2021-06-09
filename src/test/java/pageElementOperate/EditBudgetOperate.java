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

        /**
         *
         * @return  获取项目名称
         */
        public String getTextOfProjectName(){
            return getText(ebp.getContractProjectName());
        }

        // 合同编号
        public String getContractNumber(){
            return getText(ebp.getContractNumber());
        }

        // 合同金额
        public String getContractAmount(){
            return getText(ebp.getContractAmount());
        }

        // 开票金额
        public String getSettlementAmount(){
            return getText(ebp.getInvoiceAmount());
        }

        // 收款金额
        public String getReceiveAmount(){
            return getText(ebp.getReceiveAmount());
        }

        // 项目性质
        public String getProjectNature(){
            return getText(ebp.getProjectNature());
        }

        /**
         *
         * @param name 预算金额
         * @return 预算子项金额
         */
        public String getBudgetAmount(ContractBudget name){
            return getText(ebp.getBudgetAmountByName(name));
        }

        /**
         *  输入调整百分比
         * @param name 预算子项
         * @param value 金额百分比
         */
        public void sendKeysToAdjustPercent(ContractBudget name, String value){
            sendKeys(ebp.getBudgetAdjustPercentByName(name), value);
        }

        /**
         * 输入调整预算金额
         * @param name 预算子项
         * @param value 预算金额
         */
        public void sendKeysToAdjustAmount(ContractBudget name, String value){
            sendKeys(ebp.getBudgetAdjustAmountByName(name), value);
        }

        /**
         * 获取调整后预算金额
         * @param name 预算子项名称
         * @return 预算子项调整后金额
         */
        public String getAfterAdjustAmount(ContractBudget name){
            return getText(ebp.getBudgetAfterAdjustByName(name));
        }

        /**
         *
         * @param name 预算子项名称
         * @param value 预算子项备注
         */
        public void sendKeysToRemark(ContractBudget name, String value){
            sendKeys(ebp.getBudgetRemarkByName(name), value);
        }

        /**
         *
         * @param name 预算子项名称
         * @return 预算子项备注
         */
        public String getRemark(ContractBudget name){
            return getAttribute(ebp.getBudgetRemarkByName(name));
        }

    /**
     *
     * @param index 第几行
     * @return 预算金额
     */
    public String getBudgetAmount(int index){
            return getText(ebp.getBudgetAmountByIndex(index));
        }

    /**
     *
     * @param index 第几行
     * @param value 预算调整金额百分比
     */
        public void sendKeysToAdjustPercent(int index, String value){
            sendKeys(ebp.getBudgetAdjustPercentByIndex(index), value);
        }

    /***
     *
     * @param index 第几行
     * @param value 预算调整金额
     */
        public void sendKeysToAdjustAmount(int index, String value){
            sendKeys(ebp.getBudgetAdjustAmountByIndex(index), value);
        }

    /**
     *
     * @param index 第几行
     * @return 调整后预算金额
     */
        public String getAfterAdjustAmount(int index){
            return getText(ebp.getBudgetAfterAdjustByIndex(index));
        }

    /**
     *
     * @param index 第几行
     * @param value 预算备注
     */
        public void sendKeysToRemark(int index, String value){
            sendKeys(ebp.getBudgetRemarkByIndex(index), value);
        }

    /**
     *
     * @param index 第几行
     * @return 预算备注
     */
        public String getRemark(int index){
            return getAttribute(ebp.getBudgetRemarkByIndex(index));
        }
}
