package testcase;

import annotation.TestTitle;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageHandle.LoginHandle;
import testResultHandle.TestListener;
import utils.GetDriver;
import utils.GetEnvironment;

@Listeners(TestListener.class)
public class LoginTest extends BaseCase{
    LoginHandle loginHandle;

    public LoginTest() {
        super(GetDriver.getBaseDriver());
    }


    @BeforeTest
    public void testBefore(){
        loginHandle = new LoginHandle(baseDriver);
    }
    @Test
    @TestTitle(value = "测试正常登录系统")
    public void testLoginNormal(){
        loginHandle.handleLogin(GetEnvironment.getValue("userAdmin"),GetEnvironment.getValue("passwordAdmin"));
    }


}
