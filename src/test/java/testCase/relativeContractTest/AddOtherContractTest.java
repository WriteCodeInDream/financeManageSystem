package testCase.relativeContractTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.relativeContractOperate.AddOtherContractHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class AddOtherContractTest extends BaseCase {
    public AddOtherContractHandle och;
    public AddOtherContractTest() {
        super(GetDriver.getBaseDriver());
    }
    @BeforeMethod
    public void beforeTest(){
        this.och = new AddOtherContractHandle(baseDriver);
    }
    @Test
    public void test(){
        och.addOtherContract();
    }
    @Test
    public void test1(){
        och.addOtherContract();
    }

}
