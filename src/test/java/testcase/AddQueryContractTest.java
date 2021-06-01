package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.AddQueryContractHandle;

public class AddQueryContractTest extends BaseCase {
    public AddQueryContractHandle qch;
    public AddQueryContractTest() {
        super("chrome");
    }
    @BeforeMethod
    public void beforeTest(){
        this.qch = new AddQueryContractHandle(baseDriver);
    }

    @Test
    public void test(){
        qch.addQueryContract();
    }

    @Test
    public void test1(){
        qch.addQueryContract();
    }

    @AfterTest
    public void afterTest(){
        baseDriver.closeDriver();
    }
}
