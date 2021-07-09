package pageElements.approvePage;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageHandle.LoginHandle;
import utils.GetEnvironment;
import utils.GetPage;

import java.util.ArrayList;
import java.util.List;


public class ApproveBasePage extends BasePage {

    LoginHandle lh;
    public ApproveBasePage(BaseDriver baseDriver) {
        super(baseDriver);
        // 判断当前页面是否是登录页面
        if(baseDriver.getCurrentUrl().contains("login")){
            this.lh = new LoginHandle(baseDriver);
            lh.handleLogin(GetEnvironment.getValue("userAdmin"),GetEnvironment.getValue("passwordAdmin"));
            switchToPage(GetPage.getValue("approvalIndex"));
        }else if(!baseDriver.getCurrentUrl().contains("contract")){
            switchToPage(GetPage.getValue("approvalIndex"));
        }
    }

    public WebElement getSearchInput(int index){
        return getElements("input").get(index);
    }

    public WebElement getSearchButton(){
        return getElement("searchButton");
    }

    public WebElement getResetButton(){
        return getElement("resetButton");
    }

    public List<WebElement> getApproveTab(){
        return getElements("tabChange");
    }


    public List<WebElement> getAllTableRows(){
        List<WebElement> elements = new ArrayList<>();
        for (WebElement element : getElements("tableRow")){
            if (baseDriver.isDisplayed(element)){
                elements.add(element);
            }
        }
        return elements;
    }


    public List<WebElement> getAllTableCells(int index){
        return getElementsByElement(getAllTableRows().get(index), "tableCell");
    }

    public List<WebElement> getOperateButton(int index){
        return getElementsByElement(getAllTableRows().get(index),"tableOperate");
    }


}
