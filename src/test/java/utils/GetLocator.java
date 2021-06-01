package utils;

import org.openqa.selenium.By;

/**
 * 获取配置文件中定位预算的方法
 */
public class GetLocator {
    // locator 文件名
    final static String fileName = "elementPath.properties";
    public static By getElementLocator(String key){
        String value = ReadProperties.valueOfProperties(key, fileName);
        String type = value.split(">")[0];
        String path = value.split(">")[1];
        if("name".equals(type)){
            return By.name(path);
        }if("id".equals(type)){
            return By.id(path);
        }if("tagName".equals(type)){
            return By.tagName(path);
        }if("className".equals(type)){
            return By.className(path);
        }
        if("linkText".equals(type)){
            return By.linkText(path);
        }else{
            return By.xpath(path);
        }

    }
}
