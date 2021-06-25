package pageElementOperate;

import driverRelative.BaseDriver;
import pageElements.operateContractPage.ViewMainContractPage;

public class ViewMainContractOperate extends BaseOperate{
    public ViewMainContractPage mcp;
    public BaseDriver baseDriver;
    public ViewMainContractOperate(BaseDriver baseDriver) {
        super(baseDriver);
        this.mcp = new ViewMainContractPage(baseDriver);
        this.baseDriver = baseDriver;
        baseDriver.setRunSpeed(200);
    }

    // 主合同登记时间
    public String getTextOfRegisterDate(){
        return getText(mcp.registerDate());
    }
    // 主合同类型
    public String getTextOfMainContractType(){
        return getText(mcp.mainContractType());
    }

    //主合同编号
    public String getTextOfMainContractNumber(){
        return getText(mcp.mainContractNumber());
    }

    // 项目名称
    public String getTextOfProjectName(){
        return getText(mcp.projectName());
    }

    // 委托单位
    public String getTextOfEntrustCompany(){
        return getText(mcp.entrustCompany());
    }

    // 主合同金额
    public String getTextOfContractAmount(){
        return getText(mcp.contractAmount());
    }

    // 主合同结算金额
    public String getTextOfSettlementAmount(){
        return getText(mcp.settlementAmount());
    }

    // 主合同开票金额
    public String getTextOfInvoiceAmount(){
        return getText(mcp.invoiceAmount());
    }

    // 主合同收款金额
    public String getTextOfReceiveAmount(){
        return getText(mcp.receiveAmount());
    }

    // 主合同实施实体
    public String getTextOfPracticingEntity(){
        return getText(mcp.practicingEntity());
    }

    // 项目性质
    public String getTextOfProjectNature(){
        return getText(mcp.projectNature());
    }

    // 项目来源
    public String getTextOfProjectSource(){
        return getText(mcp.projectSource());
    }

    // 合同经办人
    public String getTextOfContractAgent(){
        return getText(mcp.contractAgent());
    }

    // 合同审批人
    public String getTextOfContractApprove(){
       return getText(mcp.contractApprove());
    }

    // 合同份数
    public String getTextOfContractCopies(){
        return getText(mcp.contractCopies());
    }

    // 工程地点
    public String getTextOfProjectSite(){
        return getText(mcp.projectSite());
    }

    // 履约时间
    public String getTextOfPerformanceTime(){
        return getText(mcp.performanceTime());
    }

    // 返回时间
    public String getTextOfReturnTime(){
        return getText(mcp.returnTime());
    }

    // 项目预算
    public String getTextOfProjectBudget(){
        return getText(mcp.projectBudget());
    }

    // 项目累计票据
    public String getTextOfContractBillTotal(){
        return getText(mcp.contractBillTotal());
    }

    // 项目累计付款
    public String getTextOfContractPaymentTotal(){
        return getText(mcp.contractPaymentTotal());
    }

    // 审批状态
    public String getTextOfApproveStatus(){
        return getText(mcp.approveStatus());
    }

    // 备注
    public String getTextOfRemark(){
        return getText(mcp.remark());
    }

}
