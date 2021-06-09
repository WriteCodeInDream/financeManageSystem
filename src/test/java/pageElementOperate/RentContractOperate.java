package pageElementOperate;

import driverRelative.BaseDriver;
import pageElements.addContractPage.AddRentContractPage;
import utils.ChooseDate;
import utils.GetLocator;

public class RentContractOperate extends BaseOperate{
    public AddRentContractPage rcp;
    public BaseDriver baseDriver;
    public RentContractOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.baseDriver = baseDriver;
        this.rcp = new AddRentContractPage(baseDriver);
        clickElement(rcp.getAddRentContractPageByValue());
        baseDriver.setRunSpeed(500);
    }
    /**
     *
     * @return 最新合同编号
     */
    public String lastContractNumber(){
        return getText(rcp.getRentContractNumber());
    }

    /**
     * @value 需要匹配的主合同字眼
     * 随机选择关联主合同
     */
    public void clickRelativeContractByRandom(String value){
        sendKeys(rcp.getRelativeContract(),value);
        clickElement(rcp.getOneRelativeContractByRandom());
    }
    public void clickRelativeContractByRandom() {
        clickElement(rcp.getOneRelativeContractByRandom());
    }

    /**
     * 输入选择关联主合同
     * @param value 关联主合同
     */
    public void clickRelativeContractByValue(String value){
        sendKeys(rcp.getRelativeContract(),value);
        clickElement(rcp.getOneRelativeContractByValue(value));
    }

    /**
     *  选择登记时间
     * @param value 日期
     */
    public void sendKeysToRegisterDateInput(String value){
        clickElement(rcp.getRegisterDate());
        ChooseDate.chooseDate(value,baseDriver, baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }

    /**
     *  新增合同编号
     * @param value 合同编号，必填
     */
    public void sendKeysToContractNumber(String value){
        sendKeys(rcp.getRentContractNumberInput(),value);
    }

    /**
     *
     * @param value 项目名称，必填
     */
    public void sendKeysToProjectNameInput(String value){
        sendKeys(rcp.getProjectName(),value);
    }

    /**
     *
     * @param value 工程地点，非必填
     */
    public void sendKeysToProjectSiteInput(String value){
        sendKeys(rcp.getProjectSite(), value);
    }

    /**
     *
     * @param value 需方名称，非必填
     */
    public void sendKeysToPartANameInput(String value){
        sendKeys(rcp.getPartANameInput(), value);
    }

    public void sendKeysToPartBNameInput(String value){
        sendKeys(rcp.getPartBNameInput(),value);
    }
    /**
     *  根据传入的实施实体选择
     * @param value 实施实体
     */
    public void choosePracticingEntityByValue(String value){
        clickElement(rcp.getOnePracticingEntityByValue(value));
    }
    //随机选择实施实体
    public void choosePracticingEntityRandom(){
        clickElement(rcp.getOnePracticingEntityRandom());
    }

    /**
     *
     * @param value 委托方式 非必须
     */
    public void chooseEntrustMethodByValue(String value){
        clickElement(rcp.getEntrustMethodByValue(value));
    }

    // 随机选择委托方式
    public void chooseEntrustMethodRandom(){
        clickElement(rcp.getEntrustMethodRandom());
    }

    /**
     *
     * @param value 合同经办人，必填
     */
    public void sendKeysToContractAgentInput(String value){
        sendKeys(rcp.getContractAgentInput(),value);
    }

    /**
     *
     * @param value 审批人，必填
     */
    public void sendKeysToContractApproveInput(String value){
        sendKeys(rcp.getContractApproveInput(),value);
    }

    /**
     *
     * @param value 合同份数，非必填
     */
    public void sendKeysToContractCopiesInput(String value){
        sendKeys(rcp.getContractCopiesInput(),value);
    }

    /**
     *
     * @param value 合同金额 必填
     */
    public void sendKeysToContractAmountInput(String value){
        sendKeys(rcp.getContractAmountInput(),value);
    }

    /**
     *
     * @param value 合同率约时间，非必填
     */
    public void sendKeysToPerformanceTimeInput(String value){
        clickElement(rcp.getContractPerformanceTimeInput());
        ChooseDate.chooseDate(value,baseDriver, baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }


    /**
     *
     * @param value 结算金额，非必填
     */
    public void sendKeysToSettlementAmountInput(String value){
        sendKeys(rcp.getSettlementAmountInput(),value);
    }

    /**
     *
     * @param value 开票金额，非必填
     */
    public void sendKeysToInvoiceAmountInput(String value){
        sendKeys(rcp.getInvoiceAmountInput(),value);
    }

    /**
     *
     * @param value 付款状态
     */
    public void choosePaymentStatusByValue(String value){
        clickElement(rcp.getPaymentStatusByValue(value));
    }
    // 随机选择付款状态
    public void choosePaymentStatusRandom(){
        clickElement(rcp.getPaymentStatusByRandom());
    }

    /**
     *
     * @param value 付款金额 非必填
     */
    public void sendKeysToPaymentInput(String value){
        sendKeys(rcp.getPaymentAmountInput(),value);
    }

    /**
     *
     * @param value 合同返回时间，非必填
     */
    public void sendKeysToReturnTimeInput(String value){
        clickElement(rcp.getReturnDateInput());
        ChooseDate.chooseDate(value,baseDriver, baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }

    /**
     *
     * @param value 备注，非必填
     */
    public void sendKeysToRemarkInput(String value){
        sendKeys(rcp.getRemarkInput(),value);
    }


}