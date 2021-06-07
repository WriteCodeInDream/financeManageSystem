package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.AddRentContractHandle;
import utils.GetDriver;

public class AddRentContractTest extends BaseCase {
    public AddRentContractHandle rch;
    public AddRentContractTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void beforeTest(){
        this.rch = new AddRentContractHandle(baseDriver);
    }

    @Test
    public void test(){
        rch.addRentContract();
    }

    @Test
    public void test1(){
        rch.addRentContract();
    }

}
