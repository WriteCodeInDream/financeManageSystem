package testCase.relativeContractTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageHandle.relativeContractOperate.QueryContractListHandle;
import testCase.BaseCase;
import utils.GetDriver;

public class QueryContractListTest extends BaseCase {
    public QueryContractListHandle clh;
    public QueryContractListTest() {
        super(GetDriver.getBaseDriver());
        this.clh = new QueryContractListHandle(baseDriver);
    }

    @Test
    public void test1(){
        System.out.println(clh.testAllRawValue(1));
    }

    @Test
    public void test2(){
        System.out.println(clh.testGetRawValue(1, "合同经办人"));
    }

    @AfterTest
    public void afterTest(){
        baseDriver.closeDriver();
    }
}
