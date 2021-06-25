package testCase.CostManageTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.costManageHandle.AddCostBudgetHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class AddCostBudgetTest extends BaseCase {
    public AddCostBudgetHandle cbh;
    public AddCostBudgetTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void testBefore(){
        this.cbh = new AddCostBudgetHandle(baseDriver);
    }

    @Test
    public void test1(){
        cbh.testAddBudget();
    }
}
