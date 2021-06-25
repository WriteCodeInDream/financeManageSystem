package testCase.relativeContractTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.relativeContractOperate.AddRentContractHandle;
import testCase.BaseCase;
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
