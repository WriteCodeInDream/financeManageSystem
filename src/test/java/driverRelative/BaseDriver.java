package driverRelative;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.TimeSleep;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class BaseDriver {

    // webdriver 对象
    private WebDriver baseDriver;
    // 浏览运行速度设置
    long speed = 500;
    // 获取driver对象
    public BaseDriver(String driverType){
        baseDriver = new SelectDriver(driverType).getWebDriver();
    }


    /**
     *  返回driver
     */
    public WebDriver getBaseDriver(){
        return baseDriver;
    }

    /**
     * 窗口最大化
     */
    public void windowsPageMax(){
        baseDriver.manage().window().maximize();
    }

    /**
     * 返回上一操作页面
     */
    public void rebackPage(){
        baseDriver.navigate().back();
    }

    /**
     * 页面刷新
     */
    public void refreshPage(){
        baseDriver.navigate().refresh();
    }

    /**
     * 获取单个元素
     */
    public WebElement getElementByLocator(By by){
        List<WebElement> allElements =baseDriver.findElements(by);
        if (allElements.size() == 1){
            return allElements.get(0);
        }
        for(WebElement element : allElements){
            if (isDisplayed(element)){
                return element;
            }
        }
        // 没有找到页面元素
        throw new NoSuchElementException("没有找到该页面预算，检查定位方式以及运行速度");
    }

    // 通过主页面获取一组元素
    public List<WebElement> getElementsByLocator(By by){
        return baseDriver.findElements(by);
    }
    // 通过主页面元素获取单个元素
    public WebElement getElementByElement(WebElement element, By by){
        return element.findElement(by);
    }

    // 通过页面元素获取一组元素
    public List<WebElement> getElementsByElement(WebElement element, By by){
        return element.findElements(by);
    }

    /**
     * 获取一组元素
     */
    public List<WebElement> getElements(By by){
        List<WebElement> elements = new ArrayList<>();
        for(WebElement element : baseDriver.findElements(by)){
            if(element.isDisplayed()){
                elements.add(element);
            }
        }
        return elements;
    }


    /***
     * 获取url地址
     */
    public void getUrl(String url){
        baseDriver.get(url);
    }

    /***
     * 关闭浏览器（driver）
     */
    public void closeDriver(){
        if (null != baseDriver){
            baseDriver.quit();
        }
    }

    // 点击页面元素
    public void clickElement(By by){
        baseDriver.findElement(by).click();
        TimeSleep.TimeWaiting(speed);
    }

    // 点击页面元素
    public void clickElement(WebElement element){
        element.click();
        TimeSleep.TimeWaiting(speed);
    }
    // 获取元素文本内容
    public String getText(WebElement element){
        return element.getText();
    }

    public String getAttribute(WebElement element){
        return element.getAttribute("value");
    }

    public String getAttribute(WebElement element, String attributeName){
        return element.getAttribute(attributeName);
    }

    // 获取模态框下预算文本内容
    public String getTextByElement(By by, WebElement element){
        return element.findElement(by).getText();
    }

    // 文本内容输入
    public void sendKeys(WebElement element, String value){
        element.sendKeys(value);
        TimeSleep.TimeWaiting(speed);
    }
    /**
     * 设置隐式等待
     */
    public void setImplicitlyWait(){
        baseDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    // 设置浏览器运行速度
    public void setRunSpeed(long speed){
        this.speed = speed;
    }

    // 判断页面元素是否展示
    public Boolean isDisplayed(WebElement element){
        return element.isDisplayed();
    }


    public WebElement getActiveElement(){
       return baseDriver.switchTo().activeElement();
    }

    // 获取当前url
    public String getCurrentUrl(){
        return baseDriver.getCurrentUrl();
    }


}

