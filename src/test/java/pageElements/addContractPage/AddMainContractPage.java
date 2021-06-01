package pageElements.addContractPage;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;
import utils.GetDownList;

import java.util.List;

public class AddMainContractPage  extends BasePage implements IAddContractPage {
    private WebElement mainContractPage;
    public AddMainContractPage(BaseDriver baseDriver) {
        super(baseDriver);

        this.mainContractPage = new ProjectManagePage(baseDriver).addMainContractPage();
    }

    @Override
    public WebElement getCloseButton() {
        return null;
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
     * 新增主合同元素
     */


    public WebElement getNewNumber(){
        return getElementByElement(mainContractPage,"main-newContractNumber");
    }

    public WebElement registerDateInput(){
        return getElementByElement(mainContractPage,"main-registerDateInput");
    }

    /***
     *
     * @return 主合同类型下拉列表
     */
    public List<WebElement> mainContractTypeList(){
        clickElementByElement(mainContractPage,"main-contractTypeInput");
        return GetDownList.getDownList(baseDriver);
    }


    /**
     *
     * @return 随机选择一个主合同类型
     */
    public WebElement oneMainContractTypeRandom(){
        return getElementByRandom(mainContractTypeList());
    }

    /**
     * 根据输入的值返回主合类型
     * @param value 主合同类型
     * @return  主合同类型单个li
     */
    public WebElement oneMainContractTypeByValue(String value){
        return getElementByValue(value, mainContractTypeList());
    }

    /**
     *
     * @ 主合同编号输入框
     */
    public WebElement contractNumberInput(){
        return getElementByElement(mainContractPage,"main-contractNumberInput");
    }

    /**
     *
     * @return 项目名称输入框
     */
    public WebElement projectNameInput(){
        return getElementByElement(mainContractPage,"main-projectNameInput");
    }

    /**
     *
     * @return 委托单位输入框
     */
    public WebElement entrustCompanyInput(){
        return getElementByElement(mainContractPage,"main-entrustCompanyInput");
    }

    /**
     *
     * @return 合同金额输入框
     */
    public WebElement contractMoneyInput(){
        return getElementByElement(mainContractPage,"main-contractMoneyInput");
    }

    /**
     *
     * @return 结算金额输入框
     */
    public WebElement settlementAmountInput(){
        return getElementByElement(mainContractPage,"main-settlementAmountInput");
    }

    /**
     *
     * @return 开票金额输入框
     */
    public WebElement invoiceAmountInput(){
        return getElementByElement(mainContractPage,"main-invoiceAmountInput");
    }

    /**
     *
     * @return 收款金额输入框
     */
    public WebElement receivableAmountInput(){
        return getElementByElement(mainContractPage,"main-receivableAmountInput");
    }

    /**
     *
     * @return 实施实体下拉列表
     */
    public List<WebElement> practicingEntityList(){
        clickElementByElement(mainContractPage,"main-practicingEntityInput");
        return GetDownList.getDownList(baseDriver);
    }

    /**
     *
     * @return 单个随机的实施实体
     */
    public WebElement onePracticingEntityRandom(){
        return getElementByRandom(practicingEntityList());
    }

    /**
     *
     * @param value 实施实体名称
     * @return 单个指定的实施实体
     */
    public WebElement onePracticingEntityByValue(String value){
        return getElementByValue(value, practicingEntityList());
    }

    /**
     *
     * @return 项目性质输入框
     */
    public WebElement projectNatureInput(){
        return getElementByElement(mainContractPage,"main-projectNatureInput");
    }

    /**
     *
     * @return 项目来源输入框
     */
    public WebElement projectSourceInput(){
        return getElementByElement(mainContractPage,"main-projectSourceInput");
    }

    /**
     *
     * @return 合同经办人输入框
     */
    public WebElement contractAgentInput(){
        return getElementByElement(mainContractPage,"main-contractAgentInput");
    }

    /**
     *
     * @return 合同审批人输入框
     */
    public WebElement contractApproveInput(){
        return getElementByElement(mainContractPage,"main-contractApproveInput");
    }

    /**
     *
     * @return 合同份数输入框
     */
    public WebElement contractCopiesInput(){
        return getElementByElement(mainContractPage,"main-contractCopiesInput");
    }

    /**
     *
     * @return 主合同工程地点输入框
     */
    public WebElement projectSiteInput(){
        return getElementByElement(mainContractPage,"main-projectSiteInput");
    }

    /**
     *
     * @return 合同率约时间输入框
     */
    public WebElement performanceTimeInput(){
        return getElementByElement(mainContractPage,"main-performanceTimeInput");
    }

    /**
     *
     * @return 合同返回时间输入框
     */
    public WebElement returnTimeInput(){
        return getElementByElement(mainContractPage,"main-returnTimeInput");
    }

    /***
     *
     * @return 合同备注输入框
     */
    public WebElement remarkInput(){
        return getElementByElement(mainContractPage,"main-remarkInput");
    }
}
