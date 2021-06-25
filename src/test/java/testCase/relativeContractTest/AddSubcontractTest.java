package testCase.relativeContractTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.relativeContractOperate.AddSubcontractPageHandle;
import testCase.BaseCase;
import utils.GetDriver;


public class AddSubcontractTest extends BaseCase {
    public AddSubcontractPageHandle sph;

    public AddSubcontractTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void switchToSubContractPage(){
        baseDriver.refreshPage();
        this.sph = new AddSubcontractPageHandle(baseDriver);
    }
    @Test
    public void test(){
        sph.addSubContract();
    }

    @Test()
    public void test1(){
        sph.addSubContract();
    }


}
