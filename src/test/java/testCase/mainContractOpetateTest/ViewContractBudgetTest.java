package testCase.mainContractOpetateTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.mainContractHandle.ViewContractBudgetHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class ViewContractBudgetTest extends BaseCase {
    public ViewContractBudgetHandle vbh;
    public ViewContractBudgetTest() {
        super(GetDriver.getBaseDriver());
    }
    @BeforeMethod
    public void beforeTest(){
        this.vbh = new ViewContractBudgetHandle(baseDriver);
    }

    @Test
    public void testViewContractBudget(){
        vbh.testViewContractBudget();
    }

    @AfterTest
    public void testAfter(){
        baseDriver.closeDriver();
    }
}
