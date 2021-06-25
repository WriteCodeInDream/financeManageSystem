package testCase.CostManageTest;

import driverRelative.BaseDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.costManageHandle.AddCostPaymentHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class AddCostPaymentTest extends BaseCase {
    public AddCostPaymentHandle cph;
    public AddCostPaymentTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void testBefore(){
        this.cph = new AddCostPaymentHandle(baseDriver);
    }

    @Test
    public void test(){
        cph.addContractPayment();
    }
}
