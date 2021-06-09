package pageElements.OperateContractPage;

import driverRelative.BaseDriver;
import enumString.ContractOperate;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;
import utils.GetLocator;

import java.util.List;

public class AddInvoiceAmountPage extends BasePage {
    public WebElement iap;
    public AddInvoiceAmountPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.iap = new ProjectManagePage(baseDriver).getOperateContent(ContractOperate.ADD_INVOICE_AMOUNT.contractOperate);
    }

    /**
     *
     * @return 开票金额输入框
     */
    public WebElement getInvoiceTimeInput(){
        return getElementsByElement(iap, "contentInput").get(0);
    }

    /**
     *
     * @return 开票时间选择器
     */
    public List<WebElement> getInvoiceTimeDate(){
        return baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl"));
    }

    /***
     *
     * @return 开票金额输入框
     */
    public WebElement getInvoiceAmountInput(){
        return getElementsByElement(iap, "contentInput").get(1);
    }

    /**
     *
     * @return 开票方
     */
    public WebElement getBuyerName(){
        return getElementsByElement(iap, "remarkInput").get(0);
    }

    /**
     *
     * @return 备注
     */
    public WebElement getRemarkInput(){
        return getElementsByElement(iap, "remarkInput").get(1);
    }
}
