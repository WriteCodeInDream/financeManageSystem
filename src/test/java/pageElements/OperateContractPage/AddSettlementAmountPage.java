package pageElements.OperateContractPage;

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

    public WebElement getSettlementTimeInput(){
        return getElementsByElement(sap, "contentInput").get(0);
    }

    public List<WebElement> getSettlementTimeDate(){
        return baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl"));
    }

    public WebElement getSettlementAmountInput(){
        return getElementsByElement(sap, "contentInput").get(1);
    }
}
