package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.AddOtherContractHandle;

public class AddOtherContractTest extends BaseCase{
    public AddOtherContractHandle och;
    public AddOtherContractTest() {
        super("chrome");
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

    @AfterTest
    public void afterTest(){
        baseDriver.closeDriver();
    }
}
