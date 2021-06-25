package testCase;

import driverRelative.BaseDriver;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testResultHandle.RetryListener;
import testResultHandle.TestRetry;
import utils.GetDriver;

public class RetryTest extends BaseCase{

    public RetryTest() {
        super(GetDriver.getBaseDriver());
    }

    @Test()
    public void test1(){
        System.out.println(">>>>>>>>>1");
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2(){
        System.out.println(">>>>>>>>>2");
        System.out.println(1 / 0);
    }

    @Test
    public void test3(){
        System.out.println(">>>>>>>>>3");
        Assert.assertEquals(1,32);
    }
}
