package pageElements;

import driverRelative.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageHandle.LoginHandle;
import utils.GetEnvironment;
import utils.GetPage;
import utils.TimeSleep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectManagePage extends BasePage{
    LoginHandle lh;
    Map<String, Integer> map = new HashMap<>();
    public List<String> mainHtList = new ArrayList<>();
    public ProjectManagePage(BaseDriver baseDriver) {
        super(baseDriver);
        initList();
        initMap();
        // 判断当前页面是否是登录页面
        if(baseDriver.getCurrentUrl().contains("login")){
            this.lh = new LoginHandle(baseDriver);
            lh.handleLogin(GetEnvironment.getValue("userAdmin"),GetEnvironment.getValue("passwordAdmin"));
            switchToPage(GetPage.getValue("contractIndex"));
        }else if(!baseDriver.getCurrentUrl().contains("contract")){
            switchToPage(GetPage.getValue("contractIndex"));
        }
    }

    public WebElement downloadTemplateButton(){
        return getElement("downloadTemplateButton");
    }

    public WebElement exportContactButton(){
        return getElement("exportContractButton");
    }

    /**
     * 查询条件输入框
     */

    public WebElement addMainContractPage(){
        clickElement("addContractButton");
        return getElement("contentPage");
    }

    /**
     * 获取第几个操作
     * @param index
     * @return
     */
    private List<WebElement> operateButton(int index){
        Actions actions = new Actions(baseDriver.getBaseDriver());
        WebElement operateButton;
        List<WebElement> allOperateButtons = new ArrayList<>();
        List<WebElement> allButtons = getElements("operateButton");
        for(WebElement button : allButtons){
            if(baseDriver.isDisplayed(button)){
                allOperateButtons.add(button);
            }
        }
        operateButton = allOperateButtons.get(index);
       //actions.moveToElement(operateButton).perform();
       actions.clickAndHold(operateButton).perform();
        TimeSleep.TimeWaiting(2000);
        //actions.moveToElement(operateButton,0 ,0).;
        List<WebElement> allOperations = getElements("allOperateButtons");
        return allOperations;
    }

    /***
     *  获取第一个操作
     * @return
     */
    private List<WebElement> operateButton(){
        return operateButton(1);
    }

    private WebElement getOneOperate(String value){
        return getElementByValue(value,operateButton());
    }

    /**
     *  获取页面contend页面
     * @param value
     * @return
     */
    public WebElement getOperateContent(String value){
        clickElement(getOneOperate(value));
        return getElement("contentPage");
    }

    public WebElement getOperatePage(String value){
        clickElement(getOneOperate(value));
        return getElement("pageWrap");
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

    public WebElement getTableCell(String value, int index){
        return getAllTableCells(index).get(map.get(value));
    }
    public void initMap(){
       for(int i = 0; i <mainHtList.size(); i++){
           map.put(mainHtList.get(i), i );
       }
    }
    public void initList(){
        mainHtList.add("序号");
        mainHtList.add("登记时间");
        mainHtList.add("主合同类型");
        mainHtList.add("合同编号");
        mainHtList.add("项目名称");
        mainHtList.add("委托单位");
        mainHtList.add("合同金额");
        mainHtList.add("结算金额");
        mainHtList.add("开票金额");
        mainHtList.add("收款金额");
        mainHtList.add("项目预算");
        mainHtList.add("项目累计票据");
        mainHtList.add("项目累计付款");
        mainHtList.add("实施实体");
        mainHtList.add("项目性质");
        mainHtList.add("项目来源");
        mainHtList.add("合同经办人");
        mainHtList.add("审批人");
        mainHtList.add("合同份数");
        mainHtList.add("工程地点");
        mainHtList.add("合同履约时间");
        mainHtList.add("完工情况");
        mainHtList.add("合同返回时间");
        mainHtList.add("备注");
        mainHtList.add("审批状态");
        mainHtList.add("创建人");
        mainHtList.add("最近编辑人");
        mainHtList.add("编辑时间");
    }

}
