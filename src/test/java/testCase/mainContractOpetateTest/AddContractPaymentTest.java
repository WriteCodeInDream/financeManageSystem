package testCase.mainContractOpetateTest;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.mainContractHandle.AddContractPaymentHandle;
import testCase.BaseCase;
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
