package pageElementOperate;

import driverRelative.BaseDriver;
import pageElements.addContractPage.AddSubcontractPage;
import utils.ChooseDate;
import utils.GetLocator;

public class SubcontractPageOperate  extends BaseOperate{

    public AddSubcontractPage asp;
    private BaseDriver baseDriver;
    public SubcontractPageOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.asp = new AddSubcontractPage(baseDriver);
        this.baseDriver = baseDriver;
        clickElement(asp.getAddSubcontractPageByValue());
        baseDriver.setRunSpeed(500);
    }

    /**
     *
     * @return 最新合同编号
     */
    public String lastContractNumber(){
        return getText(asp.getSubContractNumber());
    }

    /**
     * @value 需要匹配的主合同字眼
     * 随机选择关联主合同
     */
    public void clickRelativeContractByRandom(String value){
        sendKeys(asp.getRelativeContract(),value);
        clickElement(asp.getOneRelativeContractByRandom());
    }
    public void clickRelativeContractByRandom() {
        clickElement(asp.getOneRelativeContractByRandom());
    }

    /**
     * 输入选择关联主合同
     * @param value
     */
    public void clickRelativeContractByValue(String value){
        sendKeys(asp.getRelativeContract(),value);
        clickElement(asp.getOneRelativeContractByValue(value));
    }

    /**
     *  选择登记时间
     * @param value 日期
     */
    public void sendKeysToRegisterDateInput(String value){
        clickElement(asp.getRegisterDate());
        ChooseDate.chooseDate(value,baseDriver, baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }

    /**
     *  新增合同编号
     * @param value 合同编号，必填
     */
    public void sendKeysToContractNumber(String value){
        sendKeys(asp.getSubContractNumberInput(),value);
    }

    /**
     *
     * @param value 项目名称，必填
     */
    public void sendKeysToProjectNameInput(String value){
        sendKeys(asp.getProjectName(),value);
    }

    /**
     *
     * @param value 工程地点，非必填
     */
    public void sendKeysToProjectSiteInput(String value){
        sendKeys(asp.getProjectSite(), value);
    }

    /**
     *
     * @param value 委托实施单位，必填
     */
    public void sendKeysToClientUnitInput(String value){
        sendKeys(asp.getClientUnit(), value);
    }

    /**
     *  根据传入的实施实体选择
     * @param value 实施实体
     */
    public void choosePracticingEntityByValue(String value){
        clickElement(asp.getOnePracticingEntityByValue(value));
    }
    //随机选择实施实体
    public void choosePracticingEntityRandom(){
        clickElement(asp.getOnePracticingEntityRandom());
    }

    /**
     *
     * @param value 委托方式 非必须
     */
    public void chooseEntrustMethodByValue(String value){
        clickElement(asp.getEntrustMethodByValue(value));
    }

    // 随机选择委托方式
    public void chooseEntrustMethodRandom(){
        clickElement(asp.getEntrustMethodRandom());
    }

    /**
     *
     * @param value 合同经办人，必填
     */
    public void sendKeysToContractAgentInput(String value){
        sendKeys(asp.getContractAgentInput(),value);
    }

    /**
     *
     * @param value 审批人，必填
     */
    public void sendKeysToContractApproveInput(String value){
        sendKeys(asp.getContractApproveInput(),value);
    }

    /**
     *
     * @param value 合同份数，非必填
     */
    public void sendKeysToContractCopiesInput(String value){
        sendKeys(asp.getContractCopiesInput(),value);
    }

    /**
     *
     * @param value 合同金额 必填
     */
    public void sendKeysToContractAmountInput(String value){
        sendKeys(asp.getContractAmountInput(),value);
    }

    /**
     *
     * @param value 合同率约时间，非必填
     */
    public void sendKeysToPerformanceTimeInput(String value){
        clickElement(asp.getContractPerformanceTimeInput());
        ChooseDate.chooseDate(value,baseDriver, baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }

    /**
     *
     * @param value 完成工作量，非必填，非负整数
     */
    public void sendKeysToCompleteAmountInput(String value){
        sendKeys(asp.getCompleteAmountInput(),value);
    }

    /**
     *
     * @param value 结算金额，非必填
     */
    public void sendKeysToSettlementAmountInput(String value){
        sendKeys(asp.getSettlementAmountInput(),value);
    }

    /**
     *
     * @param value 开票金额，非必填
     */
    public void sendKeysToInvoiceAmountInput(String value){
        sendKeys(asp.getInvoiceAmountInput(),value);
    }

    /**
     *
     * @param value 付款状态
     */
    public void choosePaymentStatusByValue(String value){
        clickElement(asp.getPaymentStatusByValue(value));
    }
    // 随机选择付款状态
    public void choosePaymentStatusRandom(){
        clickElement(asp.getPaymentStatusByRandom());
    }

    /**
     *
     * @param value 付款金额 非必填
     */
    public void sendKeysToPaymentInput(String value){
        sendKeys(asp.getPaymentAmountInput(),value);
    }

    /**
     *
     * @param value 合同返回时间，非必填
     */
    public void sendKeysToReturnTimeInput(String value){
        clickElement(asp.getReturnDateInput());
        ChooseDate.chooseDate(value,baseDriver, baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }

    /**
     *
     * @param value 备注，非必填
     */
    public void sendKeysToRemarkInput(String value){
        sendKeys(asp.getRemarkInput(),value);
    }


    public void clickUploadFileButton(){
        clickElement(asp.getFileUploadButton());
    }
     // 关闭模态框的×
    public void clickCloseButton(){
        clickElement(asp.getCloseButton());
    }
    }
