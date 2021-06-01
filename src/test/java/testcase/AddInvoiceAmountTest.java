package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.AddInvoiceAmountHandle;

public class AddInvoiceAmountTest extends BaseCase{
    public AddInvoiceAmountHandle iah;
    public AddInvoiceAmountTest() {
        super("chrome");
    }
    @BeforeMethod
    public void beforeTest(){
        this.iah = new AddInvoiceAmountHandle(baseDriver);
    }

    @Test
    public void test(){
        iah.addInvoiceAmount();
    }
    @AfterTest
    public void after(){
        baseDriver.closeDriver();
    }
}
