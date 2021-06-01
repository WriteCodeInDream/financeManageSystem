package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.AddReceiveAmountHandle;

public class AddReceiveAmountTest extends BaseCase{
    public AddReceiveAmountHandle rah;
    public AddReceiveAmountTest() {
        super("chrome");
    }

    @BeforeMethod
    public void beforeTest(){
        this.rah = new AddReceiveAmountHandle(baseDriver);
    }

    @Test
    public void test(){
        rah.addReceiveAmount();
    }

    @AfterTest
    public void afterTest(){
        baseDriver.closeDriver();
    }
}
