package pageElements.OperateContractPage;

import driverRelative.BaseDriver;
import enumString.ContractOperate;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;
import utils.GetLocator;

import java.util.List;

public class AddCompleteInfoPage extends BasePage {
    public WebElement cip;
    public AddCompleteInfoPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.cip = new ProjectManagePage(baseDriver).getOperateContent(ContractOperate.ADD_COMPLETE_INFO.contractOperate);
    }
    public WebElement getCompleteTimeInput(){
        return getElementByElement(cip, "contentInput");
    }

    /**
     *  项目完工时间
     * @return 项目完工时间输入框
     */
    public List<WebElement> getCompleteTime(){
        return baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl"));
    }

    /**
     *
     * @return 项目完工情况输入框
     */
    public WebElement getCompleteInfo(){
        return getElementByElement(cip, "remarkInput");
    }

}
