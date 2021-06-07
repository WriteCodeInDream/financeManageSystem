package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.AddContractBudgetHandle;
import utils.GetDriver;

public class AddContractBudgetTest extends BaseCase {
    public AddContractBudgetHandle cbh;
    public AddContractBudgetTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void beforeTest(){
        this.cbh = new AddContractBudgetHandle(baseDriver);
    }

    @Test
    public void test(){
        cbh.addContractBudget();
    }


}
