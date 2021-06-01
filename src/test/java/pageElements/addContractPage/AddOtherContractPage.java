package pageElements.addContractPage;

import driverRelative.BaseDriver;
import enumString.ContractType;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;
import utils.GetDownList;

import java.util.List;

public class AddOtherContractPage extends BasePage implements IAddContractPage{
    public WebElement ocp;
    public AddOtherContractPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.ocp = new ProjectManagePage(baseDriver).addMainContractPage();
    }

    @Override
    public WebElement getCloseButton() {
       return getElementByElement(ocp,"closeButton");

    }

    @Override
    public WebElement getCommitButton() {
        return getElementByElement(ocp,"commitButton");
    }

    @Override
    public WebElement getCancelButton() {
        return getElementByElement(ocp,"cancelButton");
    }

    /**
     * 获取所有的合同类型
     * @return
     */
    public List<WebElement> getAllContractType(){
        clickElementByElement(ocp, "mainContractType");
        return GetDownList.getDownList(baseDriver);
    }

    /**
     *
     * @return 获取其他合同li元素
     */
    public WebElement getAddOtherContractPageByValue(){
        return getElementByValue(ContractType.OTHER_TYPE.contractType, getAllContractType());
    }

    /**
     * 最新合同编号
     * @return
     */
    public WebElement getOtherContractNumber(){
        return getElementByElement(ocp,"other-newContractNumber");
    }

    /***
     * 关联主合同输入框
     * @return
     */
    public WebElement getRelativeContract(){
        return getElementByElement(ocp,"other-relativeContractInput");
    }

    /**
     *
     * @return 主合同编号前十五条记录
     */
    public List<WebElement> getRelativeContractList(){
        clickElementByElement(ocp, "other-relativeContractInput");
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
        return getElementByElement(ocp,"other-registerDateInput");
    }

    /**
     * 其他合同合同编号
     * @return
     */
    public WebElement getOtherContractNumberInput(){
        return getElementByElement(ocp,"other-contractNumberInput");
    }

    /**
     * 其他合同项目名称
     * @return
     */
    public WebElement getProjectName(){
        return getElementByElement(ocp,"other-projectNameInput");
    }

    /**
     * 其他合同工程地点输入框
     * @return
     */
    public WebElement getProjectSite(){
        return getElementByElement(ocp,"other-projectSiteInput");
    }

    /**
     * 其他合同对方单位
     * @return
     */
    public WebElement getOtherSideInput(){
        return getElementByElement(ocp,"other-otherSideInput");
    }

    /**
     * 实施实体输入框
     * @return
     */
    public WebElement getPracticingEntityInput(){
        return getElementByElement(ocp,"other-practicingEntityInput");
    }

    /**
     *
     * @return 所有的实施实体下拉列表
     */
    public List<WebElement> getPracticingEntityList(){
        clickElementByElement(ocp,"other-practicingEntityInput");
        return GetDownList.getDownList(baseDriver);
    }


    public WebElement getOnePracticingEntityRandom(){
        return getElementByRandom(getPracticingEntityList());
    }

    public WebElement getOnePracticingEntityByValue(String value){
        return getElementByValue(value, getPracticingEntityList());
    }
    /**
     * 其他合同委托方式
     * @return
     */
    public WebElement getEntrustMethod(){
        return getElementByElement(ocp,"other-entrustMethodInput");
    }

    /**
     *
     * @return 其他合同所有委托方式
     */
    public List<WebElement> getEntrustMethodList(){
        clickElementByElement(ocp,"other-entrustMethodInput");
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
     * @return 其他合同合同经办人输入框
     */
    public WebElement getContractAgentInput(){
        return getElementByElement(ocp,"other-contractAgentInput");
    }

    /**
     *
     * @return 其他合同合同审批人输入框
     */
    public WebElement getContractApproveInput(){
        return getElementByElement(ocp,"other-contractApproveInput");
    }

    /**
     *
     * @return 其他合同合同份数输入框
     */
    public WebElement getContractCopiesInput(){
        return getElementByElement(ocp,"other-contractCopiesInput");
    }

    /**
     *
     * @return 其他合同合同金额
     */
    public WebElement getContractAmountInput(){
        return getElementByElement(ocp,"other-contractAmountInput");
    }

    /**
     *
     * @return 其他合同履约时间
     */
    public WebElement getContractPerformanceTimeInput(){
        return getElementByElement(ocp,"other-PerformanceTimeInput");
    }

    /**
     *
     * @return 其他合同完成工作量输入框
     */
    public WebElement getCompleteAmountInput(){
        return getElementByElement(ocp,"other-completeAmountInput");
    }

    /**
     *
     * @return 其他合同结算金额输入框
     */
    public WebElement getSettlementAmountInput(){
        return getElementByElement(ocp,"other-settlementAmountInput");
    }

    /**
     *
     * @return 其他合同开票金额
     */
    public WebElement getInvoiceAmountInput(){
        return getElementByElement(ocp,"other-invoiceAmountInput");
    }

    /**
     *  付款状态输入框
     * @return
     */
    public WebElement getPaymentStatus(){
        return getElementByElement(ocp,"other-paymentStatusInput");
    }

    /**
     *
     * @return 付款状态下拉列表
     */
    public List<WebElement> getPaymentStatusList(){
        clickElementByElement(ocp,"other-paymentStatusInput");
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
     * @return 其他合同付款金额
     */
    public WebElement getPaymentAmountInput(){
        return getElementByElement(ocp,"other-paymentAmountInput");
    }

    /**
     *
     * @return 其他合同返回时间
     */
    public WebElement getReturnDateInput(){
        return getElementByElement(ocp,"other-returnDateInput");
    }

    /**
     *
     * @return 其他合同备注输入框
     */
    public WebElement getRemarkInput(){
        return getElementByElement(ocp,"other-remarkInput");
    }

}
