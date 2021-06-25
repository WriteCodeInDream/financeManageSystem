package testCase.CostManageTest;

import driverRelative.BaseDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.costManageHandle.EditCostPaymentHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class EditCostPaymentTest extends BaseCase {
    public EditCostPaymentHandle cph;
    public EditCostPaymentTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void testBefore(){
        this.cph = new EditCostPaymentHandle(baseDriver, 1);
    }

    @Test
    public void test1(){
        cph.testEditPayment();
    }

    //@AfterTest
    public void testAfter(){
        baseDriver.closeDriver();
    }

}
