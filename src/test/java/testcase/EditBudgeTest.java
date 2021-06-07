package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.EditBudgetHandle;
import utils.GetDriver;

public class EditBudgeTest extends BaseCase {
    public EditBudgetHandle ebh;
    public EditBudgeTest() {
        super(GetDriver.getBaseDriver());
    }
    @BeforeMethod
    public void beforeTest(){
        this.ebh = new EditBudgetHandle(baseDriver);
    }

    @Test
    public void test(){
        ebh.editBudget();
    }

}
