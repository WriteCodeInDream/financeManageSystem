package pageElementOperate;

import driverRelative.BaseDriver;
import pageElements.addContractPage.AddMainContractPage;
import utils.ChooseDate;
import utils.GetLocator;



public class MainContractOperate extends BaseOperate{
    public AddMainContractPage acp;
    public BaseDriver baseDriver;

    public MainContractOperate(BaseDriver baseDriver){
        super(baseDriver);
        this.acp = new AddMainContractPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(300);
    }

    /**
     *
     * @return 最新合同编号
     */
    public String getLastNumber(){
        return getText(acp.getNewNumber());
    }

    /**
     *  选择登记时间
     * @param value 登记时间
     */
    public void sendKeysToRegisterDateInput(String value){
        clickElement(acp.registerDateInput());
        ChooseDate.chooseDate(value,baseDriver,baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));

    }

    /**
     * 随机选择主合同类型
     */
    public void chooseTypeRandom(){
        clickElement(acp.oneMainContractTypeRandom());
    }

    /**
     *  根据输入的主合同类型选择主合同类型
     * @param value 主合同类型
     */
    public void chooseTypeByValue(String value){
        clickElement(acp.oneMainContractTypeByValue(value));
    }

    /**
     *   输入主合同编号
     * @param value 主合同编号
     */
    public void sendKeysToContractNumberInput(String value){
        sendKeys(acp.contractNumberInput(), value);
    }

    /**
     *
     * @param value 项目名称 必填项
     */
    public void sendKeysToProjectNameInput(String value){
        sendKeys(acp.projectNameInput(), value);
    }

    /**
     *
     * @param value 委托单位 必填
     */
    public void sendKeysToEntrustCompany(String value){
        sendKeys(acp.entrustCompanyInput(),value);
    }

    /**
     *
     * @param value 合同金额 必填
     */
    public void sendKeysToContractMoneyInput(String value){
        sendKeys(acp.contractMoneyInput(), value);
    }

    /**
     *
     * @param value 结算金额    非必填
     */
    public void sendKeysToSettlementAmountInput(String value){
        sendKeys(acp.settlementAmountInput(), value);
    }

    /**
     *
     * @param value 开票金额 非必填
     */
    public void sendKeysToInvoiceAmountInput(String value){
        sendKeys(acp.invoiceAmountInput(), value);
    }

    /**
     *
     * @param value 收款金额 非必填
     */
    public void sendKeysToReceiveAmountInput(String value){
        sendKeys(acp.receivableAmountInput(), value);
    }

    /**
     * 随机选择实施实体
     */
    public void choosePracticingEntityRandom(){
        clickElement(acp.onePracticingEntityRandom());
    }

    /***
     * 根据输入的实施实体选择
     * @param value 实施实体
     */
    public void choosePracticingEntityByValue(String value){
        clickElement(acp.onePracticingEntityByValue(value));
    }

    /**
     *
     * @param value 项目性质 必填
     */
    public void sendKeysToProjectNatureInput(String value){
        sendKeys(acp.projectNatureInput(), value);
    }

    /**
     *
     * @param value 项目来源，非必填
     */
    public void sendKeysToProjectSourceInput(String value){
        sendKeys(acp.projectSourceInput(), value);
    }

    /**
     *
     * @param value 合同经办人，必填
     */
    public void sendKeysToContractAgentInput(String value){
        sendKeys(acp.contractAgentInput(), value);
    }

    /**
     *
     * @param value 合同审批人，必填
     */
    public void sendKeysToContractApproveInput(String value){
        sendKeys(acp.contractApproveInput(), value);
    }

    /**
     *
     * @param value 合同份数 非必填
     */
    public void sendKeysToContractCopiesInput(String value){
        sendKeys(acp.contractCopiesInput(), value);
    }

    /**
     *
     * @param value 工程地点，非必填
     */
    public void sendKeysToContractSiteInput(String value){
        sendKeys(acp.projectSiteInput(), value);
    }

    /**
     *
     * @param value 合同率约时间，非必填
     */
    public void sendKeysToPerformanceTimeInput(String value){
        clickElement(acp.performanceTimeInput());
        ChooseDate.chooseDate(value,baseDriver,baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }

    /**
     *
     * @param value 合同返回时间，非必填
     */
    public void sendKeysToReturnTimeInput(String value){
        clickElement(acp.returnTimeInput());
        ChooseDate.chooseDate(value,baseDriver,baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl")));
    }

    /**
     *
     * @param value 备注，非必填
     */
    public void sendKeysToRemarkInput(String value){
        sendKeys(acp.remarkInput(), value);
    }

   }
