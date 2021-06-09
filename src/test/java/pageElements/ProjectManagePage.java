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
    // 下载合同导入模板 按钮
    public WebElement downloadTemplateButton(){
        return getElement("downloadTemplateButton");
    }

    // 导入合同按钮
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
     * 获取第几个操作 是用户名下拉列表，
     * @param index + 1 主合同列表第几个操作按钮
     * @return 一个操作列表
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
        return getElements("allOperateButtons");
    }

    /**
     *  获取主合同操作列表的一个操作
     * @param value  操作名称
     * @return  操作元素，点击跳转至操作页面
     */
    private WebElement getOneOperate(String value, int index){
        return getElementByValue(value,operateButton(index));
    }

    /**
     *  获取页面content页面  包括新增合同预算、合同结算、开票、收款、付款、完工情况、查看合同付款
     * @param value 操作名称
     * @param index 第 index + 1 个列表操作
     * @return 主合同操作后跳转出来的模态框
     */
    public WebElement getOperateContent(String value, int index){
        clickElement(getOneOperate(value,index));
        return getElement("contentPage");
    }

    /***
     *
     * @param value 操作名称
     * @return 操作content 返回列表第一个
     */
    public WebElement getOperateContent(String value){
        clickElement(getOneOperate(value,0));
        return getElement("contentPage");
    }

    /**
     *  获取页面，包括查看主合同、编辑主合同、编辑合同预算、查看合同预算、查看关联合同、查看项目综合信息
     * @param value 操作名称
     * @return 主合同操作跳转后页面
     */
    public WebElement getOperatePage(String value, int index){
        clickElement(getOneOperate(value,index));
        return getElement("pageWrap");
    }

    /**
     *
     * @param value 操作名称
     * @return 默认取第一个操作
     */
    public WebElement getOperatePage(String value){
        clickElement(getOneOperate(value,0));
        return getElement("pageWrap");
    }

    /**
     *
     * @return 获取所有的主合同列表行
     */
    public List<WebElement> getAllTableRows(){
        List<WebElement> elements = new ArrayList<>();
        for (WebElement element : getElements("tableRow")){
            if (baseDriver.isDisplayed(element)){
                elements.add(element);
            }
        }
        return elements;
    }

    /**
     *
     * @param index 行数
     * @return 所有的字段信息 主合同编号、项目名称、主合同金额等
     */
    public List<WebElement> getAllTableCells(int index){
        return getElementsByElement(getAllTableRows().get(index), "tableCell");
    }

    /**
     *
     * @param value 字段名称
     * @param index 行数
     * @return 单个字段
     */
    public WebElement getTableCell(String value, int index){
        return getAllTableCells(index).get(map.get(value));
    }

    /**
     * 初始化map信息
     */
    public void initMap(){
       for(int i = 0; i <mainHtList.size(); i++){
           map.put(mainHtList.get(i), i );
       }
    }

    /**
     * 初始化list信息 主合同字段
     */
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
