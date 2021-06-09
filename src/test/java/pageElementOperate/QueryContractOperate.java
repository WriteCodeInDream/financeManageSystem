package pageElementOperate;

import driverRelative.BaseDriver;
import pageElements.addContractPage.AddQueryContractPage;
import utils.ChooseDate;
import utils.GetLocator;

public class QueryContractOperate extends BaseOperate{
    public AddQueryContractPage qcp;
    public BaseDriver baseDriver;
    public QueryContractOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.baseDriver = baseDriver;
        this.qcp = new AddQueryContractPage(baseDriver);
        clickElement(qcp.getAddQueryContractPageByValue());
        baseDriver.setRunSpeed(500);
    }
    /**
     *
     * @return 最新合同编号
     */
    public String lastContractNumber(){
        return getText(qcp.getQueryContractNumber());
    }

    /**
     * @value 需要匹配的主合同字眼
     * 随机选择关联主合同
     */
    public void clickRelativeContractByRandom(String value){
        sendKeys(qcp.getRelativeContract(),value);
        clickElement(qcp.getOneRelativeContractByRandom());
    }
    public void clickRelativeContractByRandom() {
        clickElement(qcp.getOneRelativeContractByRandom());
    }

    /**
     * 输入选择关联主合同
     * @param value 关联合同名称
     */
    public void clickRelativeContractByValue(String value){
        sendKeys(qcp.getRelativeContract(),value);
        clickElement(qcp.getOneRelativeContractByValue(value));
    }

    /**
     *  选择登记时间
     * @param value 日期
     */
    public void sendKeysToRegisterDateInput(String value){
        clickElement(qcp.getRegisterDate());
        ChooseDate.chooseDate(value,baseDriver, baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }

    /**
     *  新增合同编号
     * @param value 合同编号，必填
     */
    public void sendKeysToContractNumber(String value){
        sendKeys(qcp.getQueryContractNumberInput(),value);
    }

    /**
     *
     * @param value 项目名称，必填
     */
    public void sendKeysToProjectNameInput(String value){
        sendKeys(qcp.getProjectName(),value);
    }

    /**
     *
     * @param value 工程地点，非必填
     */
    public void sendKeysToProjectSiteInput(String value){
        sendKeys(qcp.getProjectSite(), value);
    }

    /**
     *
     * @param value 对方名称，必填
     */
    public void sendKeysToOtherSideInput(String value){
        sendKeys(qcp.getOtherSideInput(), value);
    }

    public void sendKeysToCompleteAmountInput(String value){
        sendKeys(qcp.getCompleteAmountInput(),value);
    }
    /**
     *  根据传入的实施实体选择
     * @param value 实施实体
     */
    public void choosePracticingEntityByValue(String value){
        clickElement(qcp.getOnePracticingEntityByValue(value));
    }
    //随机选择实施实体

    /**
     *  随机选择实施实体
     */
    public void choosePracticingEntityRandom(){
        clickElement(qcp.getOnePracticingEntityRandom());
    }

    /**
     *
     * @param value 委托方式 非必须
     */
    public void chooseEntrustMethodByValue(String value){
        clickElement(qcp.getEntrustMethodByValue(value));
    }

    // 随机选择委托方式
    public void chooseEntrustMethodRandom(){
        clickElement(qcp.getEntrustMethodRandom());
    }

    /**
     *
     * @param value 合同经办人，必填
     */
    public void sendKeysToContractAgentInput(String value){
        sendKeys(qcp.getContractAgentInput(),value);
    }

    /**
     *
     * @param value 审批人，必填
     */
    public void sendKeysToContractApproveInput(String value){
        sendKeys(qcp.getContractApproveInput(),value);
    }

    /**
     *
     * @param value 合同份数，非必填
     */
    public void sendKeysToContractCopiesInput(String value){
        sendKeys(qcp.getContractCopiesInput(),value);
    }

    /**
     *
     * @param value 合同金额 必填
     */
    public void sendKeysToContractAmountInput(String value){
        sendKeys(qcp.getContractAmountInput(),value);
    }

    /**
     *
     * @param value 合同率约时间，非必填
     */
    public void sendKeysToPerformanceTimeInput(String value){
        clickElement(qcp.getContractPerformanceTimeInput());
        ChooseDate.chooseDate(value,baseDriver, baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }


    /**
     *
     * @param value 结算金额，非必填
     */
    public void sendKeysToSettlementAmountInput(String value){
        sendKeys(qcp.getSettlementAmountInput(),value);
    }

    /**
     *
     * @param value 开票金额，非必填
     */
    public void sendKeysToInvoiceAmountInput(String value){
        sendKeys(qcp.getInvoiceAmountInput(),value);
    }

    /**
     *
     * @param value 付款状态
     */
    public void choosePaymentStatusByValue(String value){
        clickElement(qcp.getPaymentStatusByValue(value));
    }
    // 随机选择付款状态
    public void choosePaymentStatusRandom(){
        clickElement(qcp.getPaymentStatusByRandom());
    }

    /**
     *
     * @param value 付款金额 非必填
     */
    public void sendKeysToPaymentInput(String value){
        sendKeys(qcp.getPaymentAmountInput(),value);
    }

    /**
     *
     * @param value 合同返回时间，非必填
     */
    public void sendKeysToReturnTimeInput(String value){
        clickElement(qcp.getReturnDateInput());
        ChooseDate.chooseDate(value,baseDriver, baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }

    /**
     *
     * @param value 备注，非必填
     */
    public void sendKeysToRemarkInput(String value){
        sendKeys(qcp.getRemarkInput(),value);
    }


}
