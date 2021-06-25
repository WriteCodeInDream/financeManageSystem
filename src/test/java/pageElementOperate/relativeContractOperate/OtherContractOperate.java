package pageElementOperate.relativeContractOperate;

import driverRelative.BaseDriver;
import pageElementOperate.BaseOperate;
import pageElements.addContractPage.AddOtherContractPage;
import utils.ChooseDate;
import utils.GetLocator;

public class OtherContractOperate extends BaseOperate {
    public BaseDriver baseDriver;
    public AddOtherContractPage ocp;
    public OtherContractOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.baseDriver = baseDriver;
        this.ocp = new AddOtherContractPage(baseDriver);
        clickElement(ocp.getAddOtherContractPageByValue());
        baseDriver.setRunSpeed(500);
    }
    /**
     *
     * @return 最新合同编号
     */
    public String lastContractNumber(){
        return getText(ocp.getOtherContractNumber());
    }

    /**
     * @value 需要匹配的主合同字眼
     * 随机选择关联主合同
     */
    public void clickRelativeContractByRandom(String value){
        sendKeys(ocp.getRelativeContract(),value);
        clickElement(ocp.getOneRelativeContractByRandom());
    }

    /**
     *  随机选择关联合同
     */
    public void clickRelativeContractByRandom() {
        clickElement(ocp.getOneRelativeContractByRandom());
    }

    /**
     * 输入选择关联主合同
     * @param value 关联主合同名称
     */
    public void clickRelativeContractByValue(String value){
        sendKeys(ocp.getRelativeContract(),value);
        clickElement(ocp.getOneRelativeContractByValue(value));
    }

    /**
     *  选择登记时间
     * @param value 日期
     */
    public void sendKeysToRegisterDateInput(String value){
        clickElement(ocp.getRegisterDate());
        ChooseDate.chooseDate(value,baseDriver, baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }

    /**
     *  新增合同编号
     * @param value 合同编号，必填
     */
    public void sendKeysToContractNumber(String value){
        sendKeys(ocp.getOtherContractNumberInput(),value);
    }

    /**
     *
     * @param value 项目名称，必填
     */
    public void sendKeysToProjectNameInput(String value){
        sendKeys(ocp.getProjectName(),value);
    }

    /**
     *
     * @param value 工程地点，非必填
     */
    public void sendKeysToProjectSiteInput(String value){
        sendKeys(ocp.getProjectSite(), value);
    }

    /**
     *
     * @param value 对方单位，必填
     */
    public void sendKeysToOtherSideInput(String value){
        sendKeys(ocp.getOtherSideInput(), value);
    }

    /**
     *  根据传入的实施实体选择
     * @param value 实施实体
     */
    public void choosePracticingEntityByValue(String value){
        clickElement(ocp.getOnePracticingEntityByValue(value));
    }
    //随机选择实施实体
    public void choosePracticingEntityRandom(){
        clickElement(ocp.getOnePracticingEntityRandom());
    }

    /**
     *
     * @param value 委托方式 非必须
     */
    public void chooseEntrustMethodByValue(String value){
        clickElement(ocp.getEntrustMethodByValue(value));
    }

    // 随机选择委托方式
    public void chooseEntrustMethodRandom(){
        clickElement(ocp.getEntrustMethodRandom());
    }

    /**
     *
     * @param value 合同经办人，必填
     */
    public void sendKeysToContractAgentInput(String value){
        sendKeys(ocp.getContractAgentInput(),value);
    }

    /**
     *
     * @param value 审批人，必填
     */
    public void sendKeysToContractApproveInput(String value){
        sendKeys(ocp.getContractApproveInput(),value);
    }

    /**
     *
     * @param value 合同份数，非必填
     */
    public void sendKeysToContractCopiesInput(String value){
        sendKeys(ocp.getContractCopiesInput(),value);
    }

    /**
     *
     * @param value 合同金额 必填
     */
    public void sendKeysToContractAmountInput(String value){
        sendKeys(ocp.getContractAmountInput(),value);
    }

    /**
     *
     * @param value 合同率约时间，非必填
     */
    public void sendKeysToPerformanceTimeInput(String value){
        clickElement(ocp.getContractPerformanceTimeInput());
        ChooseDate.chooseDate(value,baseDriver, baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }

    /**
     *
     * @param value 完成工作量，非必填，非负整数
     */
    public void sendKeysToCompleteAmountInput(String value){
        sendKeys(ocp.getCompleteAmountInput(),value);
    }

    /**
     *
     * @param value 结算金额，非必填
     */
    public void sendKeysToSettlementAmountInput(String value){
        sendKeys(ocp.getSettlementAmountInput(),value);
    }

    /**
     *
     * @param value 开票金额，非必填
     */
    public void sendKeysToInvoiceAmountInput(String value){
        sendKeys(ocp.getInvoiceAmountInput(),value);
    }

    /**
     *
     * @param value 付款状态
     */
    public void choosePaymentStatusByValue(String value){
        clickElement(ocp.getPaymentStatusByValue(value));
    }
    // 随机选择付款状态
    public void choosePaymentStatusRandom(){
        clickElement(ocp.getPaymentStatusByRandom());
    }

    /**
     *
     * @param value 付款金额 非必填
     */
    public void sendKeysToPaymentInput(String value){
        sendKeys(ocp.getPaymentAmountInput(),value);
    }

    /**
     *
     * @param value 合同返回时间，非必填
     */
    public void sendKeysToReturnTimeInput(String value){
        clickElement(ocp.getReturnDateInput());
        ChooseDate.chooseDate(value,baseDriver, baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }

    /**
     *
     * @param value 备注，非必填
     */
    public void sendKeysToRemarkInput(String value){
        sendKeys(ocp.getRemarkInput(),value);
    }
    // 点击关闭模态框


}
