package testCase.CostManageTest;

import driverRelative.BaseDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.costManageHandle.CostPaymentHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class CostPaymentListTest extends BaseCase {
    public CostPaymentHandle cph;
    public CostPaymentListTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void beforeTest(){
        this.cph = new CostPaymentHandle(baseDriver);
    }

    @Test
    public void test(){
        cph.testViewPayment();
    }

    @AfterTest
    public void afterTest(){
        baseDriver.closeDriver();
    }
}
