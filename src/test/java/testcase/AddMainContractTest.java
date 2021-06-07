package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.AddMainContractHandel;
import utils.GetDriver;

public class AddMainContractTest extends BaseCase{
    AddMainContractHandel ach;
    public AddMainContractTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void testBefore(){
        this.ach = new AddMainContractHandel(baseDriver);
    }

    @Test
    public void testAddMainContract(){
        ach.addMainContract();
    }

}
