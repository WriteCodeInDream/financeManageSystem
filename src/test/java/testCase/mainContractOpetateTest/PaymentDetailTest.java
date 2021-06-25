package testCase.mainContractOpetateTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.mainContractHandle.PaymentDetailHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class PaymentDetailTest extends BaseCase {
    public PaymentDetailHandle pdh;
    public PaymentDetailTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void testBefore(){
        this.pdh = new PaymentDetailHandle(baseDriver);
    }

    @Test
    public void test(){
        pdh.testPaymentDetail();
    }
}
