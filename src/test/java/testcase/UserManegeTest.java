package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageHandle.UserManageHandle;
import utils.GetDriver;

public class UserManegeTest extends BaseCase{
    public UserManegeTest() {
        super(GetDriver.getBaseDriver());
        this.umh = new UserManageHandle(baseDriver);
    }
    public UserManageHandle umh;

    @Test
    public void test(){
        umh.getUserDept();
    }

}
