package pageElementOperate;

import driverRelative.BaseDriver;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebElement;


public class BaseOperate {
    private BaseDriver baseDriver;
    public BaseOperate(BaseDriver baseDriver){
        this.baseDriver = baseDriver;
    }
    // 发送文本
    public void sendKeys(WebElement webElement, String keys){
        clearInput(webElement);
        baseDriver.sendKeys(webElement,keys);
    }
    //清空文本输入框
    public void clearInput(@NotNull WebElement webElement){
        webElement.clear();
    }

    // 点击元素
    public void clickElement(WebElement button){
        baseDriver.clickElement(button);
    }
    // 获取文本
    public String getText(WebElement element){
       return baseDriver.getText(element);
    }
    // 获取元素属性值
    public String getAttribute(WebElement element){
        return baseDriver.getAttribute(element);
    }
}
