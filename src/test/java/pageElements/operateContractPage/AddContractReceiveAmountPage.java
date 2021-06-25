package pageElements.operateContractPage;

import driverRelative.BaseDriver;
import enumString.ContractOperate;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;
import utils.GetLocator;

import java.util.List;

public class AddContractReceiveAmountPage extends BasePage {
    public WebElement crp;
    public AddContractReceiveAmountPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.crp = new ProjectManagePage(baseDriver).getOperateContent(ContractOperate.ADD_RECEIVE_AMOUNT.contractOperate);
    }

    /**
     *
     * @return 收款时间输入框
     */
    public WebElement getReceiveTimeInput(){
        return getElementsByElement(crp, "contentInput").get(0);
    }

    /***
     *
     * @return 收款时间时间选择器
     */
    public List<WebElement> getReceiveTimeDate(){
       return baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl"));
    }

    /**
     *
     * @return 收款金额输入框
     */
    public WebElement getReceiveAmountInput(){
        return getElementsByElement(crp, "contentInput").get(1);
    }

    /**
     *
     * @return 付款方输入框
     */
    public WebElement getPayerInput(){
        return getElementsByElement(crp, "remarkInput").get(0);
    }

    /**
     *
     * @return 备注输入框
     */
    public WebElement getRemarkInput(){
        return getElementsByElement(crp, "remarkInput").get(1);
    }

}
