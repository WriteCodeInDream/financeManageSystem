package pageElements.addContractPage;

import driverRelative.BaseDriver;
import enumString.ContractType;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;
import utils.GetDownList;

import java.util.List;

public class AddQueryContractPage extends BasePage implements IAddContractPage{
    public WebElement qcp;
    public AddQueryContractPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.qcp = new ProjectManagePage(baseDriver).addMainContractPage();
    }

    @Override
    public WebElement getCloseButton() {
        return getElementByElement(qcp,"closeButton");
    }

    @Override
    public WebElement getCommitButton() {
        return null;
    }

    @Override
    public WebElement getCancelButton() {
        return null;
    }

    /**
     * 获取所有的合同类型
     * @return
     */
    public List<WebElement> getAllContractType(){
        clickElementByElement(qcp, "mainContractType");
        return GetDownList.getDownList(baseDriver);
    }

    /**
     *
     * @return 获取咨询合同li元素
     */
    public WebElement getAddQueryContractPageByValue(){
        return getElementByValue(ContractType.QUERY_TYPE.contractType, getAllContractType());
    }
    /**
     * 最新合同编号
     * @return
     */
    public WebElement getQueryContractNumber(){
        return getElementByElement(qcp,"query-newContractNumber");
    }

    /***
     * 关联主合同输入框
     * @return
     */
    public WebElement getRelativeContract(){
        return getElementByElement(qcp,"query-relativeContractInput");
    }

    /**
     *
     * @return 主合同编号前十五条记录
     */
    public List<WebElement> getRelativeContractList(){
        clickElementByElement(qcp, "query-relativeContractInput");
        return GetDownList.getDownList(baseDriver);
    }

    /**
     *
     * @return 随机关联主合同编号li
     */
    public WebElement getOneRelativeContractByRandom(){
        return getElementByRandom(getRelativeContractList());
    }

    /**
     *
     * @param value 主合同编号
     * @return 主合同编号li
     */
    public WebElement getOneRelativeContractByValue(String value){
        return getElementByValue(value, getRelativeContractList());
    }
    /**
     * 登记时间
     * @return
     */
    public WebElement getRegisterDate(){
        return getElementByElement(qcp,"query-registerDateInput");
    }

    /**
     * 咨询合同合同编号
     * @return
     */
    public WebElement getQueryContractNumberInput(){
        return getElementByElement(qcp,"query-contractNumberInput");
    }

    /**
     * 咨询合同项目名称
     * @return
     */
    public WebElement getProjectName(){
        return getElementByElement(qcp,"query-projectNameInput");
    }

    /**
     * 咨询合同工程地点输入框
     * @return
     */
    public WebElement getProjectSite(){
        return getElementByElement(qcp,"query-projectSiteInput");
    }

    /**
     * 咨询合同对方单位输入框
     * @return
     */
    public WebElement getOtherSideInput(){
        return getElementByElement(qcp,"query-otherSideInput");
    }

    /**
     * 实施实体输入框
     * @return
     */
    public WebElement getPracticingEntityInput(){
        return getElementByElement(qcp,"query-practicingEntityInput");
    }

    /**
     *
     * @return 所有的实施实体下拉列表
     */
    public List<WebElement> getPracticingEntityList(){
        clickElementByElement(qcp,"query-practicingEntityInput");
        return GetDownList.getDownList(baseDriver);
    }


    public WebElement getOnePracticingEntityRandom(){
        return getElementByRandom(getPracticingEntityList());
    }

    public WebElement getOnePracticingEntityByValue(String value){
        return getElementByValue(value, getPracticingEntityList());
    }
    /**
     * 咨询合同委托方式
     * @return
     */
    public WebElement getEntrustMethod(){
        return getElementByElement(qcp,"query-entrustMethodInput");
    }

    /**
     *
     * @return 咨询合同所有委托方式
     */
    public List<WebElement> getEntrustMethodList(){
        clickElementByElement(qcp,"query-entrustMethodInput");
        return GetDownList.getDownList(baseDriver);
    }

    public WebElement getEntrustMethodRandom(){
        return getElementByRandom(getEntrustMethodList());
    }
    /**
     *
     * @param value 输入的委托方式
     * @return 委托方式li
     */
    public WebElement getEntrustMethodByValue(String value){
        return getElementByValue(value, getEntrustMethodList());
    }

    /**
     *
     * @return 咨询合同合同经办人输入框
     */
    public WebElement getContractAgentInput(){
        return getElementByElement(qcp,"query-contractAgentInput");
    }

    /**
     *
     * @return 咨询合同合同审批人输入框
     */
    public WebElement getContractApproveInput(){
        return getElementByElement(qcp,"query-contractApproveInput");
    }

    /**
     *
     * @return 咨询合同合同份数输入框
     */
    public WebElement getContractCopiesInput(){
        return getElementByElement(qcp,"query-contractCopiesInput");
    }

    /**
     *
     * @return 咨询合同合同金额
     */
    public WebElement getContractAmountInput(){
        return getElementByElement(qcp,"query-contractAmountInput");
    }




    /**
     *
     * @return 咨询合同结算金额输入框
     */
    public WebElement getSettlementAmountInput(){
        return getElementByElement(qcp,"query-settlementAmountInput");
    }

    /**
     *
     * @return 咨询合同开票金额
     */
    public WebElement getInvoiceAmountInput(){
        return getElementByElement(qcp,"query-invoiceAmountInput");
    }

    /**
     *  付款状态输入框
     * @return
     */
    public WebElement getPaymentStatus(){
        return getElementByElement(qcp,"query-paymentStatusInput");
    }

    /**
     *
     * @return 付款状态下拉列表
     */
    public List<WebElement> getPaymentStatusList(){
        clickElementByElement(qcp,"query-paymentStatusInput");
        return GetDownList.getDownList(baseDriver);
    }

    /**
     *
     * @param value 付款状态
     * @return  付款状态li
     */
    public WebElement getPaymentStatusByValue(String value){
        return getElementByValue(value,getPaymentStatusList());
    }



    /**
     *
     * @return 随机返回的付款状态li
     */
    public WebElement getPaymentStatusByRandom(){
        return getElementByRandom(getPaymentStatusList());
    }
    /***
     *
     * @return 咨询合同付款金额
     */
    public WebElement getPaymentAmountInput(){
        return getElementByElement(qcp,"query-paymentAmountInput");
    }

    /**
     *
     * @return 咨询合同履约时间
     */
    public WebElement getContractPerformanceTimeInput(){
        return getElementByElement(qcp,"query-PerformanceTimeInput");
    }

    // 咨询合同完成工作量
    public WebElement getCompleteAmountInput(){
        return getElementByElement(qcp,"query-completeAmountInput");
    }
    /**
     *
     * @return 咨询合同返回时间
     */
    public WebElement getReturnDateInput(){
        return getElementByElement(qcp,"query-returnDateInput");
    }

    /**
     *
     * @return 咨询合同备注输入框
     */
    public WebElement getRemarkInput(){
        return getElementByElement(qcp,"query-remarkInput");
    }

}
