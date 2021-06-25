package testCase.mainContractOpetateTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.mainContractHandle.AddSettlementAmountHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class AddSettlementAmountTest extends BaseCase {
    public AddSettlementAmountHandle sah;
    public AddSettlementAmountTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void beforeTest(){
        this.sah = new AddSettlementAmountHandle(baseDriver);
    }

    @Test
    public void test(){
        sah.addSettlementAmount();
    }

}
