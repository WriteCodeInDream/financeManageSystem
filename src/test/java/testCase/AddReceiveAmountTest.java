package testCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.AddReceiveAmountHandle;
import utils.GetDriver;

public class AddReceiveAmountTest extends BaseCase{
    public AddReceiveAmountHandle rah;
    public AddReceiveAmountTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void beforeTest(){
        this.rah = new AddReceiveAmountHandle(baseDriver);
    }

    @Test
    public void test(){
        rah.addReceiveAmount();
    }

}
