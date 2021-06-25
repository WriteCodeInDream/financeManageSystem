package testCase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.UpdateMainContractHandle;
import utils.GetDriver;

public class UpdateMainContractTest extends BaseCase{
    public UpdateMainContractHandle umh;
    public UpdateMainContractTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void testBefore(){
        this.umh = new UpdateMainContractHandle(baseDriver);
    }

    @Test
    public void test(){
        umh.testUpdateContractTest();
    }

    @AfterTest
    public void afterTest(){
        baseDriver.closeDriver();
    }

}
