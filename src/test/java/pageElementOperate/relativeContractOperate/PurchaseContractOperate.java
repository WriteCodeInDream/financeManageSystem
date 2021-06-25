package pageElementOperate.relativeContractOperate;

import driverRelative.BaseDriver;
import pageElementOperate.BaseOperate;
import pageElements.addContractPage.AddPurchaseContractPage;
import utils.ChooseDate;
import utils.GetLocator;

public class PurchaseContractOperate extends BaseOperate {
    public AddPurchaseContractPage pcp;
    private BaseDriver baseDriver;
    public PurchaseContractOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.pcp = new AddPurchaseContractPage(baseDriver);
        this.baseDriver = baseDriver;
        clickElement(pcp.getAddPurContractPageByValue());
        baseDriver.setRunSpeed(500);
    }
    /**
     *
     * @return 最新合同编号
     */
    public String lastContractNumber(){
        return getText(pcp.getPurContractNumber());
    }

    /**
     * @value 需要匹配的主合同字眼 比如选择 2021-见证 开头的主合同
     * 随机选择关联主合同
     */
    public void clickRelativeContractByRandom(String value){
        sendKeys(pcp.getRelativeContract(),value);
        clickElement(pcp.getOneRelativeContractByRandom());
    }

    /**
     * 随机选择关联主合同
     */
    public void clickRelativeContractByRandom() {
        clickElement(pcp.getOneRelativeContractByRandom());
    }

    /**
     * 输入选择关联主合同
     * @param value
     */
    public void clickRelativeContractByValue(String value){
        sendKeys(pcp.getRelativeContract(),value);
        clickElement(pcp.getOneRelativeContractByValue(value));
    }

    /**
     *  选择登记时间
     * @param value 日期
     */
    public void sendKeysToRegisterDateInput(String value){
        clickElement(pcp.getRegisterDate());
        ChooseDate.chooseDate(value,baseDriver, baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }

    /**
     *  新增合同编号
     * @param value 合同编号，必填
     */
    public void sendKeysToContractNumber(String value){
        sendKeys(pcp.getPurContractNumberInput(),value);
    }

    /**
     *
     * @param value 项目名称，必填
     */
    public void sendKeysToProjectNameInput(String value){
        sendKeys(pcp.getProjectName(),value);
    }

    /**
     *
     * @param value 工程地点，非必填
     */
    public void sendKeysToProjectSiteInput(String value){
        sendKeys(pcp.getProjectSite(), value);
    }

    /**
     *
     * @param value 需方名称，非必填
     */
    public void sendKeysToBuyerNameInput(String value){
        sendKeys(pcp.getBuyerNameInput(), value);
    }

    public void sendKeysToSupplierNameInput(String value){
        sendKeys(pcp.getSupplierNameInput(),value);
    }
    /**
     *  根据传入的实施实体选择
     * @param value 实施实体
     */
    public void choosePracticingEntityByValue(String value){
        clickElement(pcp.getOnePracticingEntityByValue(value));
    }


    /***
     * 随机选择实施实体
     */
    public void choosePracticingEntityRandom(){
        clickElement(pcp.getOnePracticingEntityRandom());
    }

    /**
     *
     * @param value 委托方式 非必须
     */
    public void chooseEntrustMethodByValue(String value){
        clickElement(pcp.getEntrustMethodByValue(value));
    }

    // 随机选择委托方式
    public void chooseEntrustMethodRandom(){
        clickElement(pcp.getEntrustMethodRandom());
    }

    /**
     *
     * @param value 合同经办人，必填
     */
    public void sendKeysToContractAgentInput(String value){
        sendKeys(pcp.getContractAgentInput(),value);
    }

    /**
     *
     * @param value 审批人，必填
     */
    public void sendKeysToContractApproveInput(String value){
        sendKeys(pcp.getContractApproveInput(),value);
    }

    /**
     *
     * @param value 合同份数，非必填
     */
    public void sendKeysToContractCopiesInput(String value){
        sendKeys(pcp.getContractCopiesInput(),value);
    }

    /**
     *
     * @param value 合同金额 必填
     */
    public void sendKeysToContractAmountInput(String value){
        sendKeys(pcp.getContractAmountInput(),value);
    }

    /**
     *
     * @param value 合同率约时间，非必填
     */
    public void sendKeysToPerformanceTimeInput(String value){
        clickElement(pcp.getContractPerformanceTimeInput());
        ChooseDate.chooseDate(value,baseDriver, baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }


    /**
     *
     * @param value 结算金额，非必填
     */
    public void sendKeysToSettlementAmountInput(String value){
        sendKeys(pcp.getSettlementAmountInput(),value);
    }

    /**
     *
     * @param value 开票金额，非必填
     */
    public void sendKeysToInvoiceAmountInput(String value){
        sendKeys(pcp.getInvoiceAmountInput(),value);
    }

    /**
     *
     * @param value 付款状态
     */
    public void choosePaymentStatusByValue(String value){
        clickElement(pcp.getPaymentStatusByValue(value));
    }
    // 随机选择付款状态
    public void choosePaymentStatusRandom(){
        clickElement(pcp.getPaymentStatusByRandom());
    }

    /**
     *
     * @param value 付款金额 非必填
     */
    public void sendKeysToPaymentInput(String value){
        sendKeys(pcp.getPaymentAmountInput(),value);
    }

    /**
     *
     * @param value 合同返回时间，非必填
     */
    public void sendKeysToReturnTimeInput(String value){
        clickElement(pcp.getReturnDateInput());
        ChooseDate.chooseDate(value,baseDriver, baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }

    /**
     *
     * @param value 备注，非必填
     */
    public void sendKeysToRemarkInput(String value){
        sendKeys(pcp.getRemarkInput(),value);
    }

}

