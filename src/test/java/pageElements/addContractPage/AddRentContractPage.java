package pageElements.addContractPage;

import driverRelative.BaseDriver;
import enumString.ContractType;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;
import utils.GetDownList;

import java.util.List;

public class AddRentContractPage extends BasePage {

    public WebElement rcp;
    public AddRentContractPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.rcp = new ProjectManagePage(baseDriver).addMainContractPage();
    }

    /**
     * 获取所有的合同类型
     * @return
     */
    public List<WebElement> getAllContractType(){
        clickElementByElement(rcp, "mainContractType");
        return GetDownList.getDownList(baseDriver);
    }

    /**
     *
     * @return 获取租赁合同li元素
     */
    public WebElement getAddRentContractPageByValue(){
        return getElementByValue(ContractType.RENT_TYPE.contractType, getAllContractType());
    }
    /**
     * 最新合同编号
     * @return 最新合同编号
     */
    public WebElement getRentContractNumber(){
        return getElementByElement(rcp,"rent-newContractNumber");
    }

    /***
     * 关联主合同输入框
     * @ return 关联主合同输入款
     */
    public WebElement getRelativeContract(){
        return getElementByElement(rcp,"rent-relativeContractInput");
    }

    /**
     *
     * @return 主合同编号前十五条记录
     */
    public List<WebElement> getRelativeContractList(){
        clickElementByElement(rcp, "rent-relativeContractInput");
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
        return getElementByElement(rcp,"rent-registerDateInput");
    }

    /**
     * 租赁合同合同编号
     * @return 合同编号输入款
     */
    public WebElement getRentContractNumberInput(){
        return getElementByElement(rcp,"rent-contractNumberInput");
    }

    /**
     * 租赁合同项目名称
     * @return 项目名称输入框
     */
    public WebElement getProjectName(){
        return getElementByElement(rcp,"rent-projectNameInput");
    }

    /**
     * 租赁合同工程地点输入框
     * @return 工程地点输入框
     */
    public WebElement getProjectSite(){
        return getElementByElement(rcp,"rent-projectSiteInput");
    }

    /**
     * 租赁合同甲方名称
     * @return 甲方名称输入框
     */
    public WebElement getPartANameInput(){
        return getElementByElement(rcp,"rent-partANameInput");
    }
    // 租赁合同乙方名称
    public WebElement getPartBNameInput(){
        return getElementByElement(rcp,"rent-partBNameInput");
    }

    /**
     *
     * @return 所有的实施实体下拉列表
     */
    public List<WebElement> getPracticingEntityList(){
        clickElementByElement(rcp,"rent-practicingEntityInput");
        return GetDownList.getDownList(baseDriver);
    }

    /**
     *
     * @return 随机实施实体
     */
    public WebElement getOnePracticingEntityRandom(){
        return getElementByRandom(getPracticingEntityList());
    }

    /**
     *
     * @param value 实施实体
     * @return 实施实体li
     */
    public WebElement getOnePracticingEntityByValue(String value){
        return getElementByValue(value, getPracticingEntityList());
    }

    /**
     *
     * @return 租赁合同所有委托方式
     */
    private List<WebElement> getEntrustMethodList(){
        clickElementByElement(rcp,"rent-entrustMethodInput");
        return GetDownList.getDownList(baseDriver);
    }

    /**
     *
     * @return 随机委托方式
     */
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
     * @return 租赁合同合同经办人输入框
     */
    public WebElement getContractAgentInput(){
        return getElementByElement(rcp,"rent-contractAgentInput");
    }

    /**
     *
     * @return 租赁合同合同审批人输入框
     */
    public WebElement getContractApproveInput(){
        return getElementByElement(rcp,"rent-contractApproveInput");
    }

    /**
     *
     * @return 租赁合同合同份数输入框
     */
    public WebElement getContractCopiesInput(){
        return getElementByElement(rcp,"rent-contractCopiesInput");
    }

    /**
     *
     * @return 租赁合同合同金额
     */
    public WebElement getContractAmountInput(){
        return getElementByElement(rcp,"rent-contractAmountInput");
    }




    /**
     *
     * @return 租赁合同结算金额输入框
     */
    public WebElement getSettlementAmountInput(){
        return getElementByElement(rcp,"rent-settlementAmountInput");
    }

    /**
     *
     * @return 租赁合同开票金额
     */
    public WebElement getInvoiceAmountInput(){
        return getElementByElement(rcp,"rent-invoiceAmountInput");
    }


    /**
     *
     * @return 付款状态下拉列表
     */
    public List<WebElement> getPaymentStatusList(){
        clickElementByElement(rcp,"rent-paymentStatusInput");
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
     * @return 租赁合同付款金额
     */
    public WebElement getPaymentAmountInput(){
        return getElementByElement(rcp,"rent-paymentAmountInput");
    }
    /**
     *
     * @return 租赁合同履约时间
     */
    public WebElement getContractPerformanceTimeInput(){
        return getElementByElement(rcp,"rent-PerformanceTimeInput");
    }
    /**
     *
     * @return 租赁合同返回时间
     */
    public WebElement getReturnDateInput(){
        return getElementByElement(rcp,"rent-returnDateInput");
    }

    /**
     *
     * @return 租赁合同备注输入框
     */
    public WebElement getRemarkInput(){
        return getElementByElement(rcp,"rent-remarkInput");
    }

}
