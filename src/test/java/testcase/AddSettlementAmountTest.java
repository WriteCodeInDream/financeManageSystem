package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.AddSettlementAmountHandle;

public class AddSettlementAmountTest extends BaseCase{
    public AddSettlementAmountHandle sah;
    public AddSettlementAmountTest() {
        super("chrome");
    }

    @BeforeMethod
    public void beforeTest(){
        this.sah = new AddSettlementAmountHandle(baseDriver);
    }

    @Test
    public void test(){
        sah.addSettlementAmount();
    }

    @AfterTest
    public void afterTest(){
        baseDriver.closeDriver();
    }
}
