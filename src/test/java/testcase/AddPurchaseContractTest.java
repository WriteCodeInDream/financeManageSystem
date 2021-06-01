package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageHandle.AddPurchaseContractHandle;

public class AddPurchaseContractTest extends BaseCase{
    public AddPurchaseContractHandle pch;
    public AddPurchaseContractTest() {
        super("chrome");
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
    @AfterTest
    public void closeDriver(){
        baseDriver.closeDriver();
    }
}
