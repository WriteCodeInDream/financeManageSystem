package pageElements.operateContractPage;

import driverRelative.BaseDriver;
import enumString.ContractOperate;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;
import utils.GetLocator;

import java.util.List;

public class AddSettlementAmountPage extends BasePage {
    public WebElement sap;
    public AddSettlementAmountPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.sap = new ProjectManagePage(baseDriver).getOperateContent(ContractOperate.ADD_SETTLEMENT_AMOUNT.contractOperate);
    }

    /**
     *
     * @return 结算金额输入框
     */
    public WebElement getSettlementTimeInput(){
        return getElementsByElement(sap, "contentInput").get(0);
    }

    /**
     *
     * @return 结算时间时间选择器
     */
    public List<WebElement> getSettlementTimeDate(){
        return baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl"));
    }

    /**
     *
     * @return 结算时间
     */
    public WebElement getSettlementAmountInput(){
        return getElementsByElement(sap, "contentInput").get(1);
    }

}
