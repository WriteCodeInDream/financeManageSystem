package testResultHandle;

import org.openqa.selenium.WebDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import testCase.BaseCase;
import utils.TimeSleep;

public class TestRetry implements IRetryAnalyzer {
    private int retryCount = 0;
    private int maxRetryCount = 2;
    @Override
    public boolean retry(ITestResult result) {
        if(retryCount < maxRetryCount){
            retryCount ++;
            // 测试失败后，重新刷新下页面后进行测试
            BaseCase baseCase = (BaseCase) result.getInstance();
            baseCase.baseDriver.refreshPage();
            return true;
        }
        return false;
    }
}
