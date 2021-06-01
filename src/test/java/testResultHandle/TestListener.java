package testResultHandle;

import annotation.TestTitle;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import testcase.BaseCase;

import java.io.*;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestListener extends TestListenerAdapter {
    private String fileName;
    private String filePath;
    private String testResult;

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        super.onTestFailure(iTestResult);
        takeScreenShot(iTestResult);
        this.testResult = getTestTitle(iTestResult) + ":测试失败";
        System.out.println(testResult);
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        super.onTestSuccess(iTestResult);
        takeScreenShot(iTestResult);
        this.testResult = getTestTitle(iTestResult) + ":测试成功";
        System.out.println(testResult);
    }


    public void takeScreenShot(ITestResult iTestResult){

        //获取当前driver 对象
        BaseCase baseCase = (BaseCase) iTestResult.getInstance();
        WebDriver driver = baseCase.baseDriver.getBaseDriver();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        StringBuilder pathSb = new StringBuilder();
        pathSb.append("D:\\自动化测试截图\\");
        pathSb.append(sdf.format(currentDate));
        pathSb.append("\\");
        filePath = pathSb.toString();
        File storeFile = new File(filePath);
        if(!storeFile.exists()){
            storeFile.mkdirs();
        }
        StringBuilder nameSb = new StringBuilder();
        nameSb.append(iTestResult.getMethod().getMethodName());
        nameSb.append("_");
        nameSb.append(System.currentTimeMillis());
        nameSb.append(".png");
        fileName = nameSb.toString();
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try  {
            FileInputStream shot = new FileInputStream(screenshot);
            File screenShot = new File(filePath, fileName);
            FileOutputStream out = new FileOutputStream(screenShot);
            BufferedOutputStream testFile = new BufferedOutputStream(out);
            byte[] bytes = new byte[1024];
            int numberRead;
            while ((numberRead = shot.read(bytes)) != -1) {
                testFile.write(bytes,0,numberRead);
            }
            testFile.close();out.close();shot.close();
        }catch (IOException e){
            e.printStackTrace();
        }



    }

    public String getTestTitle(ITestResult iTestResult){
        BaseCase baseCase = (BaseCase) iTestResult.getInstance();
        Method method = null;
        try {
            method = baseCase.getClass().getMethod(iTestResult.getMethod().getMethodName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        if(method != null && method.isAnnotationPresent(TestTitle.class)){
            return method.getAnnotation(TestTitle.class).value();
        }else {
            return iTestResult.getMethod().getMethodName();
        }

    }
}
