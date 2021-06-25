package pageElements.operateContractPage;

import driverRelative.BaseDriver;
import enumString.ContractOperate;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;


public class ViewMainContractPage extends BasePage {
    public WebElement vcp;
    public ViewMainContractPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.vcp = new ProjectManagePage(baseDriver).getOperatePage(ContractOperate.VIEW_CONTRACT.contractOperate, 1);
    }

    // 主合同登记时间
    public WebElement registerDate(){
        return getElementsByElement(vcp, "detailInfo").get(0);
    }
    // 主合同类型
    public WebElement mainContractType(){
        return getElementsByElement(vcp, "detailInfo").get(1);
    }

    //主合同编号
    public WebElement mainContractNumber(){
        return getElementsByElement(vcp, "detailInfo").get(2);
    }

    // 项目名称
    public WebElement projectName(){
        return getElementsByElement(vcp, "detailInfo").get(3);
    }

    // 委托单位
    public WebElement entrustCompany(){
        return getElementsByElement(vcp, "detailInfo").get(4);
    }

    // 主合同金额
    public WebElement contractAmount(){
        return getElementsByElement(vcp, "detailInfo").get(5);
    }

    // 主合同结算金额
    public WebElement settlementAmount(){
        return getElementsByElement(vcp, "detailInfo").get(6);
    }

    // 主合同开票金额
    public WebElement invoiceAmount(){
        return getElementsByElement(vcp, "detailInfo").get(7);
    }

    // 主合同收款金额
    public WebElement receiveAmount(){
        return getElementsByElement(vcp, "detailInfo").get(8);
    }

    // 主合同实施实体
    public WebElement practicingEntity(){
        return getElementsByElement(vcp, "detailInfo").get(9);
    }

    // 项目性质
    public WebElement projectNature(){
        return getElementsByElement(vcp, "detailInfo").get(10);
    }

    // 项目来源
    public WebElement projectSource(){
        return getElementsByElement(vcp, "detailInfo").get(11);
    }

    // 合同经办人
    public WebElement contractAgent(){
        return getElementsByElement(vcp, "detailInfo").get(12);
    }

    // 合同审批人
    public WebElement contractApprove(){
        return getElementsByElement(vcp, "detailInfo").get(13);
    }

    // 合同份数
    public WebElement contractCopies(){
        return getElementsByElement(vcp, "detailInfo").get(14);
    }

    // 工程地点
    public WebElement projectSite(){
        return getElementsByElement(vcp, "detailInfo").get(15);
    }

    // 履约时间
    public WebElement performanceTime(){
        return getElementsByElement(vcp, "detailInfo").get(16);
    }

    // 返回时间
    public WebElement returnTime(){
        return getElementsByElement(vcp, "detailInfo").get(17);
    }

    // 项目预算
    public WebElement projectBudget(){
        return getElementsByElement(vcp, "detailInfo").get(18);
    }

    // 项目累计票据
    public WebElement contractBillTotal(){
        return getElementsByElement(vcp, "detailInfo").get(19);
    }

    // 项目累计付款
    public WebElement contractPaymentTotal(){
        return getElementsByElement(vcp, "detailInfo").get(20);
    }

    // 审批状态
    public WebElement approveStatus(){
        return getElementsByElement(vcp, "detailInfo").get(21);
    }

    public WebElement remark(){
        return getElementsByElement(vcp, "detailInfo").get(23);
    }

}
