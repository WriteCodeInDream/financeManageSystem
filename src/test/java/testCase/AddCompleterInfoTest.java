package testCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.AddCompleteInfoHandle;
import utils.GetDriver;

public class AddCompleterInfoTest extends BaseCase{
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
