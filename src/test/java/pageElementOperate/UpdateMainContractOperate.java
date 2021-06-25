package pageElementOperate;

import driverRelative.BaseDriver;
import pageElements.operateContractPage.UpdateMainContractPage;
import utils.ChooseDate;

public class UpdateMainContractOperate extends BaseOperate{
    public UpdateMainContractPage ump;
    public BaseDriver baseDriver;
    public UpdateMainContractOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.ump = new UpdateMainContractPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
    }

    // 主合同登记时间
    public String getTextOfRegisterDate(){
        return getAttribute(ump.registerDate());
    }
    // 主合同类型
    public String getTextOfMainContractType(){
        return getAttribute(ump.mainContractType());
    }

    //主合同编号
    public String getTextOfMainContractNumber(){
        return getAttribute(ump.mainContractNumber());
    }

    // 项目名称
    public String getTextOfProjectName(){
        return getAttribute(ump.projectName());
    }

    // 委托单位
    public String getTextOfEntrustCompany(){
        return getAttribute(ump.entrustCompany());
    }

    // 主合同金额
    public String getTextOfContractAmount(){
        return getAttribute(ump.contractAmount());
    }

    // 主合同结算金额
    public String getTextOfSettlementAmount(){
        return getAttribute(ump.settlementAmount());
    }

    // 主合同开票金额
    public String getTextOfInvoiceAmount(){
        return getAttribute(ump.invoiceAmount());
    }

    // 主合同收款金额
    public String getTextOfReceiveAmount(){
        return getAttribute(ump.receiveAmount());
    }

    // 主合同实施实体
    public String getTextOfPracticingEntity(){
        return getAttribute(ump.practicingEntity());
    }

    // 项目性质
    public String getTextOfProjectNature(){
        return getAttribute(ump.projectNature());
    }

    // 项目来源
    public String getTextOfProjectSource(){
        return getAttribute(ump.projectSource());
    }

    // 合同经办人
    public String getTextOfContractAgent(){
        return getAttribute(ump.contractAgent());
    }

    // 合同审批人
    public String getTextOfContractApprove(){
        return getAttribute(ump.contractApprove());
    }

    // 合同份数
    public String getTextOfContractCopies(){
        return getAttribute(ump.contractCopies());
    }

    // 工程地点
    public String getTextOfProjectSite(){
        return getAttribute(ump.projectSite());
    }

    // 履约时间
    public String getTextOfPerformanceTime(){
        return getAttribute(ump.performanceTime());
    }

    // 返回时间
    public String getTextOfReturnTime(){
        return getAttribute(ump.returnTime());
    }

    // 备注
    public String getTextOfRemark(){
        return getAttribute(ump.remark());
    }

    public void clickSubmitButton(){
        clickElement(ump.saveButton());
    }

    // 主合同登记时间
    public void sendKeysToRegisterDate(String completeTime){
        clickElement(ump.registerDate());
        ChooseDate.chooseDate(completeTime, baseDriver, ump.chooseDate());
    }
    // 主合同类型
    public void sendKeysToMainContractType(String value){
         clickElement(ump.getMainContractTypeByValue(value));
    }

    // 随机选择主合同类型
    public void sendKeysToMainContractType(){
        clickElement(ump.getMainContractTypeByRandom());
    }

    //主合同编号
    public void sendKeysToMainContractNumber(String value){
         sendKeys(ump.mainContractNumber(), value);
    }

    // 项目名称
    public void sendKeysToProjectName(String value){
         sendKeys(ump.projectName(), value);
    }

    // 委托单位
    public void sendKeysToEntrustCompany(String value){
         sendKeys(ump.entrustCompany(), value);
    }

    // 主合同金额
    public void sendKeysToContractAmount(String value){
         sendKeys(ump.contractAmount(), value);
    }

    // 主合同实施实体
    public void sendKeysToPracticingEntity(String value){
         clickElement(ump.getPracticingEntityByName(value));
    }

    // 随机选择实施实体
    public void sendKeysToPracticingEntity(){
        clickElement(ump.getPracticingEntityByRandom());
    }

    // 项目性质
    public void sendKeysToProjectNature(String value){
         sendKeys(ump.projectNature(), value);
    }

    // 项目来源
    public void sendKeysToProjectSource(String value){
         sendKeys(ump.projectSource(), value);
    }

    // 合同经办人
    public void sendKeysToContractAgent(String value){
         sendKeys(ump.contractAgent(), value);
    }

    // 合同审批人
    public void sendKeysToContractApprove(String value){
         sendKeys(ump.contractApprove(), value);
    }

    // 合同份数
    public void sendKeysToContractCopies(String value){
         sendKeys(ump.contractCopies(), value);
    }

    // 工程地点
    public void sendKeysToProjectSite(String value){
         sendKeys(ump.projectSite(), value);
    }

    // 履约时间
    public void sendKeysToPerformanceTime(String completeTime){
        clickElement(ump.performanceTime());
        ChooseDate.chooseDate(completeTime, baseDriver, ump.chooseDate());
    }

    // 返回时间
    public void sendKeysToReturnTime(String completeTime){
        clickElement(ump.returnTime());
        ChooseDate.chooseDate(completeTime, baseDriver, ump.chooseDate());
    }

    // 备注
    public void sendKeysToRemark(String value){
         sendKeys(ump.remark(), value);
    }

    // 点击保存按钮
    public void clickSubmitButton(String value){
        clickElement(ump.saveButton());
    }

}
