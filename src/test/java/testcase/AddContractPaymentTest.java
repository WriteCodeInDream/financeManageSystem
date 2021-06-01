package testcase;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.AddContractPaymentHandle;

public class AddContractPaymentTest extends BaseCase {
    public AddContractPaymentHandle cph;
    public AddContractPaymentTest() {
        super("chrome");
    }

    @BeforeMethod
    public void beforeTest(){
    this.cph = new AddContractPaymentHandle(baseDriver);
    }

    @Test
    public void testAddPayment(){
        cph.addContractPayment();
    }


    @AfterTest
    public void afterTest(){
        baseDriver.closeDriver();
    }
}
