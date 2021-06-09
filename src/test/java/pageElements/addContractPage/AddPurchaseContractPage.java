package pageElements.addContractPage;

import driverRelative.BaseDriver;
import enumString.ContractType;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;
import utils.GetDownList;

import java.util.List;

public class AddPurchaseContractPage extends BasePage {
    public WebElement pcp;
    public AddPurchaseContractPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.pcp = new ProjectManagePage(baseDriver).addMainContractPage();
    }

    /**
     * 获取所有的合同类型
     * @return 所有类型类型
     */
    public List<WebElement> getAllContractType(){
        clickElementByElement(pcp, "mainContractType");
        return GetDownList.getDownList(baseDriver);
    }

    /**
     *
     * @return 获取采购合同li元素
     */
    public WebElement getAddPurContractPageByValue(){
        return getElementByValue(ContractType.PURCHASES_TYPE.contractType, getAllContractType());
    }
    /**
     * 最新合同编号
     * @return 最新合同编号
     */
    public WebElement getPurContractNumber(){
        return getElementByElement(pcp,"pur-newContractNumber");
    }

    /***
     * 关联主合同输入 框
     * @return 关联合同输入框
     */
    public WebElement getRelativeContract(){
        return getElementByElement(pcp,"pur-relativeContractInput");
    }

    /**
     *
     * @return 主合同编号前十五条记录
     */
    public List<WebElement> getRelativeContractList(){
        clickElementByElement(pcp, "pur-relativeContractInput");
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
     * @return 登记时间输入框
     */
    public WebElement getRegisterDate(){
        return getElementByElement(pcp,"pur-registerDateInput");
    }

    /**
     * 采购合同合同编号
     * @return 最新合同编号
     */
    public WebElement getPurContractNumberInput(){
        return getElementByElement(pcp,"pur-contractNumberInput");
    }

    /**
     * 采购合同项目名称
     * @return 项目名称
     */
    public WebElement getProjectName(){
        return getElementByElement(pcp,"pur-projectNameInput");
    }

    /**
     *
     * @return 采购合同工程地点输入框
     */
    public WebElement getProjectSite(){
        return getElementByElement(pcp,"pur-projectSiteInput");
    }

    /**
     *
     * @return 采购合同需方名称
     */
    public WebElement getBuyerNameInput(){
        return getElementByElement(pcp,"pur-buyerNameInput");
    }
    // 供方名称
    public WebElement getSupplierNameInput(){
        return getElementByElement(pcp,"pur-supplierNameInput");
    }



    /**
     *
     * @return 所有的实施实体下拉列表
     */
    public List<WebElement> getPracticingEntityList(){
        clickElementByElement(pcp,"pur-practicingEntityInput");
        return GetDownList.getDownList(baseDriver);
    }


    public WebElement getOnePracticingEntityRandom(){
        return getElementByRandom(getPracticingEntityList());
    }

    public WebElement getOnePracticingEntityByValue(String value){
        return getElementByValue(value, getPracticingEntityList());
    }


    /**
     *
     * @return 采购合同所有委托方式
     */
    public List<WebElement> getEntrustMethodList(){
        clickElementByElement(pcp,"pur-entrustMethodInput");
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
     * @return 采购合同合同经办人输入框
     */
    public WebElement getContractAgentInput(){
        return getElementByElement(pcp,"pur-contractAgentInput");
    }

    /**
     *
     * @return 采购合同合同审批人输入框
     */
    public WebElement getContractApproveInput(){
        return getElementByElement(pcp,"pur-contractApproveInput");
    }

    /**
     *
     * @return 采购合同合同份数输入框
     */
    public WebElement getContractCopiesInput(){
        return getElementByElement(pcp,"pur-contractCopiesInput");
    }

    /**
     *
     * @return 采购合同合同金额
     */
    public WebElement getContractAmountInput(){
        return getElementByElement(pcp,"pur-contractAmountInput");
    }

    /**
     *
     * @return 采购合同履约时间
     */
    public WebElement getContractPerformanceTimeInput(){
        return getElementByElement(pcp,"pur-PerformanceTimeInput");
    }


    /**
     *
     * @return 采购合同结算金额输入框
     */
    public WebElement getSettlementAmountInput(){
        return getElementByElement(pcp,"pur-settlementAmountInput");
    }

    /**
     *
     * @return 采购合同开票金额
     */
    public WebElement getInvoiceAmountInput(){
        return getElementByElement(pcp,"pur-invoiceAmountInput");
    }


    /**
     *
     * @return 付款状态下拉列表
     */
    public List<WebElement> getPaymentStatusList(){
        clickElementByElement(pcp,"pur-paymentStatusInput");
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
     * @return 采购合同付款金额
     */
    public WebElement getPaymentAmountInput(){
        return getElementByElement(pcp,"pur-paymentAmountInput");
    }
    /**
     *
     * @return 采购合同返回时间
     */
    public WebElement getReturnDateInput(){
        return getElementByElement(pcp,"pur-returnDateInput");
    }

    /**
     *
     * @return 采购合同备注输入框
     */
    public WebElement getRemarkInput(){
        return getElementByElement(pcp,"pur-remarkInput");
    }

}

