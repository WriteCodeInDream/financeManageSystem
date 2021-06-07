package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.AddSubcontractPageHandle;
import utils.GetDriver;


public class AddSubcontractTest extends BaseCase{
    public AddSubcontractPageHandle sph;

    public AddSubcontractTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void switchToSubContractPage(){
        this.sph = new AddSubcontractPageHandle(baseDriver);
    }
    @Test
    public void test(){
        sph.addSubContract();
    }

    @Test
    public void test1(){
        sph.addSubContract();
    }


}
