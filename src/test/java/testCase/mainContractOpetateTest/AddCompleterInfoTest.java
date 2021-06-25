package testCase.mainContractOpetateTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.mainContractHandle.AddCompleteInfoHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class AddCompleterInfoTest extends BaseCase {
    public AddCompleteInfoHandle cih;
    public AddCompleterInfoTest() {
        super(GetDriver.getBaseDriver());
    }

    @BeforeMethod
    public void beforeTest(){
        this.cih = new AddCompleteInfoHandle(baseDriver);
    }

    @Test
    public void test(){
        cih.addCompleteInfo();
    }

}
