package driverRelative;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelectDriver {
    private String driverType;
    public SelectDriver(String driverType){
        this.driverType = driverType;
    }


    public WebDriver getWebDriver(){
        // 当前浏览器为谷歌浏览器
        if("chrome".equalsIgnoreCase(driverType)){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Wulj\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
            return new ChromeDriver();
        }
        // 当前浏览器为火狐浏览器
        if("firefox".equalsIgnoreCase(driverType)){
            System.setProperty("","");
            return new FirefoxDriver();
        }
        // 当前浏览器为IE浏览器
        if("ie".equalsIgnoreCase(driverType)){
            System.setProperty("","");
            return new InternetExplorerDriver();
        }
        // 没有返回null
        else {
            return null;
        }
    }
}
