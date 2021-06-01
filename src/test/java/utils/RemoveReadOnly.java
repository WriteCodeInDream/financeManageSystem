package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RemoveReadOnly {
    public   static void removeAttribute(WebDriver driver, WebElement element, String attributeName) {

        ((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute(arguments[1],arguments[2])",element,attributeName);


    }
}
