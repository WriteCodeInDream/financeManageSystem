package testCase.relativeContractTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageHandle.relativeContractOperate.OtherContractListHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class OtherContractListTest extends BaseCase {
    public OtherContractListHandle clh;
    public OtherContractListTest() {
        super(GetDriver.getBaseDriver());
        this.clh = new OtherContractListHandle(baseDriver);
    }

    @Test
    public void test1(){
        System.out.println(clh.testAllRawValue(1));
    }

    @Test
    public void test2(){
        System.out.println(clh.testGetRawValue(1, "合同经办人"));
    }

    @Test
    public void test3(){
        clh.testSearchCondition();
    }

    @AfterTest
    public void afterTest(){
        baseDriver.closeDriver();
    }
}
