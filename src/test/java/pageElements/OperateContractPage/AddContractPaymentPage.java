package pageElements.OperateContractPage;

import driverRelative.BaseDriver;
import enumString.ContractOperate;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;

import java.util.List;
import java.util.Random;

public class AddContractPaymentPage extends BasePage {
    public WebElement cpp;
    public Random random = new Random();
    public AddContractPaymentPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.cpp = new ProjectManagePage(baseDriver).getOperateContent(ContractOperate.ADD_CONTRACT_PAYMENT.contractOperate);
    }

    public List<WebElement> getAllAmountInput(){
        List<WebElement> webElements= getElementsByElement(cpp, "contentInput");
       // 移除第一个，第一个是报账时间
        webElements.remove(0);
        return webElements;
    }

    public WebElement getAmountInput(int index){
        return getAllAmountInput().get(index);
    }

    public WebElement getAmountInput(){
        return getAmountInput(random.nextInt(54));
    }

    /**
     * 获取报账时间
     * @return
     */
    public WebElement getPaymentTime(){
        return getElementsByElement(cpp, " budgetInput").get(0);
    }

    /**
     *  获取付款收款方以及备注输入框
     *  0 -1 是总备注，总付款方，为置灰状态，自动获取值
     *  2-53 是子项备注，子项付款方，可输入
     * @return
     */
    public List<WebElement> getAllRemarkInputs(){
        return getElementsByElement(cpp ,"remarkInput");
    }

    public WebElement getRemarkInput(int index){
        return getAllRemarkInputs().get(index);
    }

    public WebElement getRemarkInputRandom(){
        return getAllRemarkInputs().get(random.nextInt(52) + 2);
    }
}
