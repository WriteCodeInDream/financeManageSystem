package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.AddCompleteInfoHandle;

public class AddCompleterInfoTest extends BaseCase{
    public AddCompleteInfoHandle cih;
    public AddCompleterInfoTest() {
        super("chrome");
    }

    @BeforeMethod
    public void beforeTest(){
        this.cih = new AddCompleteInfoHandle(baseDriver);
    }

    @Test
    public void test(){
        cih.addCompleteInfo();
    }

    @AfterTest
    public void afterTest(){
        baseDriver.closeDriver();
    }
}
