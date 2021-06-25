package testCase.mainContractOpetateTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.mainContractHandle.EditPaymentHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class EditPaymentTest extends BaseCase {
    public EditPaymentHandle eph;
    public EditPaymentTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void beforeTest(){
        this.eph = new EditPaymentHandle(baseDriver);
    }

    @Test
    public void test(){
        eph.testEditPayment();
    }

    @AfterTest
    public void afterTest(){
        baseDriver.closeDriver();
    }
}
