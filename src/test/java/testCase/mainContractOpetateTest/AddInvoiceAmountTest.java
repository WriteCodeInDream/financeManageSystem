package testCase.mainContractOpetateTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.mainContractHandle.AddInvoiceAmountHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class AddInvoiceAmountTest extends BaseCase {
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
