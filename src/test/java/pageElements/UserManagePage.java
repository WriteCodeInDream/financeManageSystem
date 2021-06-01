package pageElements;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import pageHandle.LoginHandle;
import utils.GetDownList;
import utils.GetEnvironment;
import utils.GetPage;

import java.util.ArrayList;
import java.util.List;

public class UserManagePage extends BasePage{
    public UserManagePage(BaseDriver baseDriver) {
        super(baseDriver);
        // 判断当前页面是否是登录页面
        if(baseDriver.getCurrentUrl().contains("login")){
            this.lh = new LoginHandle(baseDriver);
            lh.handleLogin(GetEnvironment.getValue("userAdmin"),GetEnvironment.getValue("passwordAdmin"));
            switchToPage(GetPage.getValue("userIndex"));
        }else if(!baseDriver.getCurrentUrl().contains("user")){
            switchToPage(GetPage.getValue("userIndex"));
        }
    }

    LoginHandle lh;

    public WebElement getAddAccountButton(){
        return getElement("addAccountButton");
    }

    public List<WebElement> getSearchInput(){
        List<WebElement> searchInput = new ArrayList<>();
        for(WebElement element : getElements("input")){
            if( element .isDisplayed()){
                searchInput.add(element);
            }
        }
        return searchInput;
    }

    public WebElement getSearchInput(String value){
        int index;
        switch (value) {
            case "用户账户" :
                index = 0;
            break;
            default  :
                index = 1;
                break;

        }
        return getSearchInput().get(index);
    }

    private List<WebElement> userDept(){
        clickElement(getSearchInput().get(2));
       return GetDownList.getDownList(baseDriver);
    }

    public WebElement getDeptByRandom(){
        return getElementByRandom(userDept());
    }

    public WebElement getDeptByValue(String value){
        return getElementByValue(value,userDept());
    }

    private List<WebElement> userStatus(){
        if(getSearchInput().size() == 3){
            clickElement(getSearchInput().get(2));
        }else {
            clickElement(getSearchInput().get(3));
        }
        return GetDownList.getDownList(baseDriver);
    }

    public WebElement getStatusByRandom(){
        return getElementByRandom(userDept());
    }

    public WebElement getStatusByValue(String value){
        return getElementByValue(value,userDept());
    }

    public WebElement getSearchButton(){
        return getElement("searchButton");
    }

    public List<WebElement> getTableRow(){
        return getElements("tableRow");
    }
    public List<WebElement> getTableCells(int index){
        return getElementsByElement(getTableRow().get(index), "tableCell");
    }


    public WebElement getTableCell(int index , String value){
        int cellIndex;
        switch (value){
            case "用户账号":
                cellIndex = 0;
                break;
            case "用户名称":
                cellIndex = 1;
                break;
            default:
                cellIndex = 2;
        }
        return getTableCells(index).get(cellIndex);
    }
    public List<WebElement> getTableOperates(int index){
        return getElementsByElement(getTableRow().get(index), "tableOperate");
    }
    public WebElement getTableOperate(int index, String value){
        int operateIndex;
        switch (value){
            case "编辑" :
                operateIndex = 0;
                break;
            default:
                operateIndex = 1;
        }
        return getTableOperates(index).get(operateIndex);
    }
}
