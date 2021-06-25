package pageElements.operateContractPage;

import driverRelative.BaseDriver;
import enumString.ContractOperate;
import enumString.RelativeSearchCondition;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;
import utils.GetDownList;

import java.util.List;

public class RelativeContractPage extends BasePage {
    public  WebElement rcp;
    public  BaseDriver baseDriver;

    public RelativeContractPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.baseDriver = baseDriver;
        this.rcp = new ProjectManagePage(baseDriver).getOperatePage(ContractOperate.VIEW_RELATIVE_CONTRACT.contractOperate,1);
    }

    public   WebElement getRelativeContractPage(String value) {
        if(value.equals("分包合同")){
            return getElementsByElement(rcp,"relativePageItem").get(0);
        } if(value.equals("其他合同")){
            return getElementsByElement(rcp,"relativePageItem").get(4);
        } if(value.equals("咨询合同")){
            return getElementsByElement(rcp,"relativePageItem").get(2);
        } if(value.equals("租赁合同")){
            return getElementsByElement(rcp,"relativePageItem").get(3);
        } if(value.equals("采购合同")){
            return getElementsByElement(rcp,"relativePageItem").get(1);
        }else {
            throw new NoSuchElementException("没有“"+value+"”页面，请检查输入");
        }

    }
    public WebElement getReturnButton(){
        return getElementsByElement(rcp,"reBackButton").get(0);
    }

    // 通过名称获取条件查询框 主要针对所有权限人员，无权限人员不进行
    public WebElement getSearchInputByConditionName(RelativeSearchCondition name){
        return getElements("input").get(name.ordinal());
    }

    public WebElement getElementListItem(String value){
        return getElementByValue(value, GetDownList.getDownList(baseDriver));
    }

    public List<WebElement> beginAndEndTime(RelativeSearchCondition name){
        clickElement(getElements("input").get(name.ordinal()));
        return getElements("dateControl");
    }




}
