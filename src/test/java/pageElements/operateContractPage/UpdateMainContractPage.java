package pageElements.operateContractPage;

import driverRelative.BaseDriver;
import enumString.ContractOperate;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;
import utils.GetDownList;
import utils.GetLocator;

import java.util.List;


public class UpdateMainContractPage extends BasePage {
    public WebElement ump;
    public UpdateMainContractPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.ump = new ProjectManagePage(baseDriver).getOperatePage(ContractOperate.UPDATE_CONTRACT.contractOperate, 1);
    }


    // 主合同登记时间
    public WebElement registerDate(){
        return getElementsByElement(ump, "contentInput").get(0);
    }
    // 主合同类型
    public WebElement mainContractType(){
        return getElementsByElement(ump, "contentInput").get(1);
    }

    // 所有主合同类型
    private List<WebElement> allMainContractType(){
        clickElement(mainContractType());
        return GetDownList.getDownList(baseDriver);
    }

    // 随机选择主合同类型
    public WebElement getMainContractTypeByRandom(){
        return getElementByRandom(allMainContractType());
    }

    // 确定的主合同类型
    public WebElement getMainContractTypeByValue(String value){
        return getElementByValue(value, allMainContractType());
    }

    //主合同编号
    public WebElement mainContractNumber(){
        return getElementsByElement(ump, "contentInput").get(2);
    }

    // 项目名称
    public WebElement projectName(){
        return getElementsByElement(ump, "contentInput").get(3);
    }

    // 委托单位
    public WebElement entrustCompany(){
        return getElementsByElement(ump, "contentInput").get(4);
    }

    // 主合同金额
    public WebElement contractAmount(){
        return getElementsByElement(ump, "contentInput").get(5);
    }

    // 主合同结算金额
    public WebElement settlementAmount(){
        return getElementsByElement(ump, "contentInput").get(6);
    }

    // 主合同开票金额
    public WebElement invoiceAmount(){
        return getElementsByElement(ump, "contentInput").get(7);
    }

    // 主合同收款金额
    public WebElement receiveAmount(){
        return getElementsByElement(ump, "contentInput").get(8);
    }

    // 主合同实施实体
    public WebElement practicingEntity(){
        return getElementsByElement(ump, "contentInput").get(9);
    }

    // 所有的实施实体
    private List<WebElement> allPracticingEntity(){
        clickElement(practicingEntity());
        return GetDownList.getDownList(baseDriver);
    }

    // 随机实施实体
    public WebElement getPracticingEntityByRandom(){
        return getElementByRandom(allPracticingEntity());
    }

    // 确定的实施实体
    public WebElement getPracticingEntityByName(String name){
        return getElementByValue(name, allPracticingEntity());
    }

    // 项目性质
    public WebElement projectNature(){
        return getElementsByElement(ump, "contentInput").get(10);
    }

    // 项目来源
    public WebElement projectSource(){
        return getElementsByElement(ump, "contentInput").get(11);
    }

    // 合同经办人
    public WebElement contractAgent(){
        return getElementsByElement(ump, "contentInput").get(12);
    }

    // 合同审批人
    public WebElement contractApprove(){
        return getElementsByElement(ump, "contentInput").get(13);
    }

    // 合同份数
    public WebElement contractCopies(){
        return getElementsByElement(ump, "contentInput").get(14);
    }

    // 工程地点
    public WebElement projectSite(){
        return getElementsByElement(ump, "contentInput").get(15);
    }

    // 履约时间
    public WebElement performanceTime(){
        return getElementsByElement(ump, "contentInput").get(16);
    }

    // 返回时间
    public WebElement returnTime(){
        return getElementsByElement(ump, "contentInput").get(17);
    }

    // 备注
    public WebElement remark(){
        return getElementByElement(ump, "remarkInput");
    }

    // 时间选择器
    public List<WebElement> chooseDate(){
        return baseDriver.getElementsByLocator(GetLocator.getElementLocator("dateControl"));
    }

    public WebElement saveButton(){
        return getElementByElement(ump, "commitButton");
    }

}
