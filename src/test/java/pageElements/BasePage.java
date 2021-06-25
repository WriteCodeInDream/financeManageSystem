package pageElements;

import driverRelative.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.GetEnvironment;
import utils.GetLocator;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class BasePage {
    public BaseDriver baseDriver;
    Random random = new Random();
    public BasePage(BaseDriver baseDriver){
        this.baseDriver = baseDriver;
        baseDriver.setImplicitlyWait();
        // 判断是否为driver初始页面，初始就获取url，否则不获取
        if(baseDriver.getCurrentUrl().equals("data:,")){
            baseDriver.getUrl(GetEnvironment.getValue("testUrl"));
            baseDriver.windowsPageMax();
        }
    }

    /**
     *
     * @param value
     * @return
     */
    public WebElement getElement(String value){
        return baseDriver.getElementByLocator(getBy(value));
    }


    public WebElement getElementByElement(WebElement element, String value){
        return baseDriver.getElementByElement(element, getBy(value));
    }

    public List<WebElement> getElementsByElement(WebElement element, String value){
        return baseDriver.getElementsByElement(element, getBy(value));
    }

    /**
     * 从下拉列表中随机获取一个元素
     */
    public WebElement getElementByRandom(List<WebElement> elements){
        int index = random.nextInt(elements.size());
        return elements.get(index);
    }

    /**
     * 从下拉列表中固定获取一个元素
     */
    public WebElement getElementByValue(String value, List<WebElement> webElements){
        for(WebElement element : webElements){
            if(value.equals(element.getText())){
                return element;
            }
        }
        throw new NoSuchElementException("没有找到“"+value+"”请检查元素是否输入正确");
    }

    /**
     *
     * @param value
     * @return
     */
    public List<WebElement> getElements(String value){
        return baseDriver.getElements(getBy(value));
    }

    /**
     *
     * @param value
     */
    public void clickElement(String value){
        baseDriver.clickElement(getBy(value));
    }

    public void clickElement(WebElement element){
        baseDriver.clickElement(element);
    }

    public void clickElementByElement(WebElement element, String value){
        baseDriver.clickElement(element.findElement(getBy(value)));
    }



    public By getBy(String value){
        return GetLocator.getElementLocator(value);
    }

    public void switchToPage(String url){
        baseDriver.getUrl(url);
    }

}
