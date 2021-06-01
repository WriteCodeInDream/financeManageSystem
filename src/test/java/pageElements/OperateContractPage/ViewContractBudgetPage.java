package pageElements.OperateContractPage;

import driverRelative.BaseDriver;
import enumString.ContractOperate;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;

public class ViewContractBudgetPage extends BasePage {
    public WebElement cbp;
    public ViewContractBudgetPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.cbp = new ProjectManagePage(baseDriver).getOperatePage(ContractOperate.VIEW_CONTRACT_BUDGET.contractOperate);
    }

}
