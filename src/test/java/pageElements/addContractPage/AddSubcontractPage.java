package pageElements.addContractPage;

import driverRelative.BaseDriver;
import enumString.ContractType;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;
import utils.GetDownList;

import java.util.List;

public class AddSubcontractPage extends BasePage implements IAddContractPage {
    public WebElement asp;
    public AddSubcontractPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.asp = new ProjectManagePage(baseDriver).addMainContractPage();
    }

    @Override
    public WebElement getCloseButton() {
        return getElementByElement(asp,"closeButton");
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
        clickElementByElement(asp, "mainContractType");
        return GetDownList.getDownList(baseDriver);
    }

    /**
     *
     * @return 获取分包合同li元素
     */
    public WebElement getAddSubcontractPageByValue(){
        return getElementByValue(ContractType.SUB_TYPE.contractType, getAllContractType());
    }

    /**
     * 最新合同编号
     * @return
     */
    public WebElement getSubContractNumber(){
        return getElementByElement(asp,"sub-newContractNumber");
    }

    /***
     * 关联主合同输入框
     * @return
     */
    public WebElement getRelativeContract(){
        return getElementByElement(asp,"sub-relativeContractInput");
    }

    /**
     *
     * @return 主合同编号前十五条记录
     */
    public List<WebElement> getRelativeContractList(){
        clickElementByElement(asp, "sub-relativeContractInput");
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
        return getElementByElement(asp,"sub-registerDateInput");
    }

    /**
     * 分包合同合同编号
     * @return
     */
    public WebElement getSubContractNumberInput(){
        return getElementByElement(asp,"sub-contractNumberInput");
    }

    /**
     * 分包合同项目名称
     * @return
     */
    public WebElement getProjectName(){
        return getElementByElement(asp,"sub-projectNameInput");
    }

    /**
     * 分包合同工程地点输入框
     * @return
     */
    public WebElement getProjectSite(){
        return getElementByElement(asp,"sub-projectSiteInput");
    }

    /**
     * 分包合同委托实施单位
     * @return
     */
    public WebElement getClientUnit(){
        return getElementByElement(asp,"sub-clientUnitInput");
    }

    /**
     * 实施实体输入框
     * @return
     */
    public WebElement getPracticingEntityInput(){
        return getElementByElement(asp,"sub-practicingEntityInput");
    }

    /**
     *
     * @return 所有的实施实体下拉列表
     */
    public List<WebElement> getPracticingEntityList(){
        clickElementByElement(asp,"sub-practicingEntityInput");
        return GetDownList.getDownList(baseDriver);
    }


    public WebElement getOnePracticingEntityRandom(){
        return getElementByRandom(getPracticingEntityList());
    }

    public WebElement getOnePracticingEntityByValue(String value){
        return getElementByValue(value, getPracticingEntityList());
    }
    /**
     * 分包合同委托方式
     * @return
     */
    public WebElement getEntrustMethod(){
        return getElementByElement(asp,"sub-entrustMethodInput");
    }

    /**
     *
     * @return 分包合同所有委托方式
     */
    public List<WebElement> getEntrustMethodList(){
        clickElementByElement(asp,"sub-entrustMethodInput");
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
     * @return 分包合同合同经办人输入框
     */
    public WebElement getContractAgentInput(){
        return getElementByElement(asp,"sub-contractAgentInput");
    }

    /**
     *
     * @return 分包合同合同审批人输入框
     */
    public WebElement getContractApproveInput(){
        return getElementByElement(asp,"sub-contractApproveInput");
    }

    /**
     *
     * @return 分包合同合同份数输入框
     */
    public WebElement getContractCopiesInput(){
        return getElementByElement(asp,"sub-contractCopiesInput");
    }

    /**
     *
     * @return 分包合同合同金额
     */
    public WebElement getContractAmountInput(){
        return getElementByElement(asp,"sub-contractAmountInput");
    }

    /**
     *
     * @return 分包合同履约时间
     */
    public WebElement getContractPerformanceTimeInput(){
        return getElementByElement(asp,"sub-PerformanceTimeInput");
    }

    /**
     *
     * @return 分包合同完成工作量输入框
     */
    public WebElement getCompleteAmountInput(){
        return getElementByElement(asp,"sub-completeAmountInput");
    }

    /**
     *
     * @return 分包合同结算金额输入框
     */
    public WebElement getSettlementAmountInput(){
        return getElementByElement(asp,"sub-settlementAmountInput");
    }

    /**
     *
     * @return 分包合同开票金额
     */
    public WebElement getInvoiceAmountInput(){
        return getElementByElement(asp,"sub-invoiceAmountInput");
    }

    /**
     *  付款状态输入框
     * @return
     */
    public WebElement getPaymentStatus(){
        return getElementByElement(asp,"sub-paymentStatusInput");
    }

    /**
     *
     * @return 付款状态下拉列表
     */
    public List<WebElement> getPaymentStatusList(){
        clickElementByElement(asp,"sub-paymentStatusInput");
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
     * @return 分包合同付款金额
     */
    public WebElement getPaymentAmountInput(){
        return getElementByElement(asp,"sub-paymentAmountInput");
    }

    /**
     *
     * @return 分包合同返回时间
     */
    public WebElement getReturnDateInput(){
        return getElementByElement(asp,"sub-returnDateInput");
    }

    /**
     *
     * @return 分包合同备注输入框
     */
    public WebElement getRemarkInput(){
        return getElementByElement(asp,"sub-remarkInput");
    }

    public WebElement getFileUploadButton(){
        return getElement("fileUpload");
    }

}
