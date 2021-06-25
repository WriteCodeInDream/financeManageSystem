package pageElementOperate.relativeContractOperate;

import driverRelative.BaseDriver;
import enumString.RelativeSearchCondition;
import pageElementOperate.BaseOperate;
import pageElements.operateContractPage.RelativeContractPage;
import utils.ChooseDate;

public class RelativeContractOperate extends BaseOperate {
    public RelativeContractPage rcp;
    public BaseDriver baseDriver;
    public RelativeContractOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.baseDriver = baseDriver;
        this.rcp = new RelativeContractPage(baseDriver);
        baseDriver.setRunSpeed(200);
    }

    // 点击返回按钮
    public void clickReturnButton(){
        clickElement(rcp.getReturnButton());
    }

    // 下拉列表输入查询条件
    public void sendKeysToDropList(String value, RelativeSearchCondition name){
        clickElement(rcp.getSearchInputByConditionName(name));
        clickElement(rcp.getElementListItem(value));
    }

    // 输入框输入查询条件
    public void sendKeysToInput(String value, RelativeSearchCondition name){
        sendKeys(rcp.getSearchInputByConditionName(name), value);
    }

    // 时间选择器输入查询条件
    public void sendKeysToDateChoose(String beginTime, String endTime, RelativeSearchCondition name){
        clickElement(rcp.getSearchInputByConditionName(name));
        ChooseDate.chooseDate(beginTime, endTime, baseDriver, rcp.beginAndEndTime(name));
    }


    // 清空查询条件
    public void clearCondition(RelativeSearchCondition name){
        clearInput(rcp.getSearchInputByConditionName(name));
    }

    // 点击切换相关合同列表 name in 分包合同、采购合同、租赁合同、咨询合同、其他合同
    public void clickRelativeContractList(String name){
        clickElement(rcp.getRelativeContractPage(name));
    }

}
