package testCase.CostManageTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.costManageHandle.ViewCostBudgetHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class ViewCostBudgetTest extends BaseCase {
    public ViewCostBudgetHandle cbh;
    public ViewCostBudgetTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void beforeTest(){
        this.cbh = new ViewCostBudgetHandle(baseDriver, 8);
    }

    @Test
    public void test(){
        cbh.testViewBudget();
    }

    @AfterTest
    public void testAfter(){
        baseDriver.closeDriver();
    }
}
