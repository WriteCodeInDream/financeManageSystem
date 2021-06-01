package pageElements.OperateContractPage;

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

    public WebElement getReceiveTimeInput(){
        return getElementsByElement(crp, "contentInput").get(0);
    }

    public List<WebElement> getReceiveTimeDate(){
       return baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl"));
    }

    public WebElement getReceiveAmountInput(){
        return getElementsByElement(crp, "contentInput").get(1);
    }

    public WebElement getPayerInput(){
        return getElementsByElement(crp, "remarkInput").get(0);
    }

    public WebElement getRemarkInput(){
        return getElementsByElement(crp, "remarkInput").get(1);
    }
}
