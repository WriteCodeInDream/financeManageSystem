package testCase.CostManageTest;

import driverRelative.BaseDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.costManageHandle.EditCostBudgetHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class EditCostBudgetTest extends BaseCase {
    public EditCostBudgetHandle cbh;
    public EditCostBudgetTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void testBefore(){
        this.cbh = new EditCostBudgetHandle(baseDriver,1);
    }

    @Test
    public void test(){
        cbh.testEditBudget();
    }
    @AfterTest
    public void testAfter(){
        baseDriver.closeDriver();
    }
}
