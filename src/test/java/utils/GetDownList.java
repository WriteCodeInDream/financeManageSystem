package utils;

import driverRelative.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GetDownList {
    public static List<WebElement> getDownList(BaseDriver baseDriver){
        List<WebElement> elements = baseDriver.getElements(GetLocator.getElementLocator("dropList"));
        for(WebElement element : elements){
            if (element.isDisplayed()){
                return element.findElements(By.xpath("li"));
            }
        }
        throw new RuntimeException("没有找到符合条件的下拉列表");
    }
}
