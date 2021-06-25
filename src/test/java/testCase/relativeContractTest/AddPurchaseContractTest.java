package testCase.relativeContractTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.relativeContractOperate.AddPurchaseContractHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class AddPurchaseContractTest extends BaseCase {
    public AddPurchaseContractHandle pch;
    public AddPurchaseContractTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void beginMethod(){
        this.pch = new AddPurchaseContractHandle(baseDriver);
    }
    @Test
    public void test(){
        pch.addPurchaseContract();
    }
    @Test
    public void test1(){
        pch.addPurchaseContract();
    }
}
