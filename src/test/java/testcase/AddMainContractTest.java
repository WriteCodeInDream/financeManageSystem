package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.AddMainContractHandel;

public class AddMainContractTest extends BaseCase{
    AddMainContractHandel ach;
    public AddMainContractTest() {
        super("chrome");
    }

    @BeforeMethod
    public void testBefore(){
        this.ach = new AddMainContractHandel(baseDriver);
    }

    @Test
    public void testAddMainContract(){
        ach.addMainContract();
    }

    @AfterTest
    public void test(){
        baseDriver.closeDriver();
    }
}
