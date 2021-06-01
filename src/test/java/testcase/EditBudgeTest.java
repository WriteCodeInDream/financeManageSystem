package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.EditBudgetHandle;

public class EditBudgeTest extends BaseCase {
    public EditBudgetHandle ebh;
    public EditBudgeTest() {
        super("chrome");
    }
    @BeforeMethod
    public void beforeTest(){
        this.ebh = new EditBudgetHandle(baseDriver);
    }

    @Test
    public void test(){
        ebh.editBudget();
    }

    @AfterTest
    public void afterTest(){
        baseDriver.closeDriver();
    }
}
