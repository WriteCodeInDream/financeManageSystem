package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageHandle.UserManageHandle;

public class UserManegeTest extends BaseCase{
    public UserManegeTest() {
        super("chrome");
        this.umh = new UserManageHandle(baseDriver);
    }
    public UserManageHandle umh;

    @Test
    public void test(){
        umh.getUserDept();
    }

    @AfterTest
    public void afterTest(){
        baseDriver.closeDriver();
    }
}
