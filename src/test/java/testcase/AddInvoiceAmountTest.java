package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.AddInvoiceAmountHandle;
import utils.GetDriver;

public class AddInvoiceAmountTest extends BaseCase{
    public AddInvoiceAmountHandle iah;
    public AddInvoiceAmountTest() {
        super(GetDriver.getBaseDriver());
    }
    @BeforeMethod
    public void beforeTest(){
        this.iah = new AddInvoiceAmountHandle(baseDriver);
    }

    @Test
    public void test(){
        iah.addInvoiceAmount();
    }
}
