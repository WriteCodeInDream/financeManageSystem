package testCase;

import driverRelative.BaseDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.ViewMainContractHandle;
import utils.GetDriver;

public class ViewMainContractTest extends BaseCase{

    public ViewMainContractHandle mch;
    public ViewMainContractTest() {
        super(GetDriver.getBaseDriver());
    }
    @BeforeMethod
    public void testBefore(){
        this.mch = new ViewMainContractHandle(baseDriver);
    }

    @Test
    public void testViewMainContract(){
        mch.testViewMainContract();
    }
}
