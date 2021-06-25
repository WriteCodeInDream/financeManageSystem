package testCase.CostManageTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageHandle.costManageHandle.CostBudgetListHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class CostBudgetListTest extends BaseCase {
    public CostBudgetListHandle blh;
    public CostBudgetListTest() {
        super(GetDriver.getBaseDriver());
        this.blh = new CostBudgetListHandle(baseDriver);
    }

    @Test
    public void test(){
        blh.testTableValue();
    }

    @AfterTest
    public void testAfter(){
        baseDriver.closeDriver();
    }
}
