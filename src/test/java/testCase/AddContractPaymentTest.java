package testCase;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.AddContractPaymentHandle;
import utils.GetDriver;

public class AddContractPaymentTest extends BaseCase {
    public AddContractPaymentHandle cph;
    public AddContractPaymentTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void beforeTest(){
    this.cph = new AddContractPaymentHandle(baseDriver);
    }

    @Test
    public void testAddPayment(){
        cph.addContractPayment();
    }

}
