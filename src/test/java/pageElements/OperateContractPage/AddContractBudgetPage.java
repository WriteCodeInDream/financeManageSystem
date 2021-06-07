package pageElements.OperateContractPage;

import driverRelative.BaseDriver;
import enumString.ContractOperate;
import org.openqa.selenium.WebElement;
import pageElements.BasePage;
import pageElements.ProjectManagePage;

import java.util.List;
import java.util.Random;

public class AddContractBudgetPage extends BasePage {
    public WebElement cbp;
    public AddContractBudgetPage(BaseDriver baseDriver) {
        super(baseDriver);
        this.cbp = new ProjectManagePage(baseDriver).getOperateContent(ContractOperate.ADD_CONTRACT_BUDGET.contractOperate, 1);
    }

    /**
     *
     * @return 新增预算的百分比输入框和调整预算金额输入框 取值范围是1-54，奇数为调整百分比，偶数为调整预算
     */
    private List<WebElement> amountListInput(){
        return getElementsByElement(cbp, "contentInput");
    }


    public WebElement oneBudgetInput(int index){
        return amountListInput().get(index);
    }

    public WebElement getOneAmountInputRandom(){
            Random random = new Random();
           int index = random.nextInt(53) + 1;
           return oneBudgetInput(index);
        }

    private List<WebElement> remarkInput(){
        return getElementsByElement(cbp, "remarkInput");
    }

    public WebElement oneRemarkInput(int index){
        return remarkInput().get(index);
    }

    public WebElement getOneRemarkInputRandom(){
        Random random = new Random();
        int index = random.nextInt(27) + 1;
        return oneBudgetInput(index);
    }

    /**
     *
     *
     */
}
