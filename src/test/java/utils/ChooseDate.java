package utils;

import driverRelative.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ChooseDate {
    public static void chooseDate(String date , BaseDriver baseDriver, List<WebElement> elements){
        // 先点击需要输入日期的时间选择器
        String[] dateListStr = date.split("-");
        WebElement dateControl = null;
        for(WebElement element : elements){
            if(baseDriver.isDisplayed(element)){
                dateControl = element;
            }
        }
        String yearStr = baseDriver.getTextByElement(GetLocator.getElementLocator("dataControlYear"),dateControl).split(" ")[0];
        String monthStr = baseDriver.getTextByElement(GetLocator.getElementLocator("dataControlMonth"),dateControl).split(" ")[0];
        //选择到年份
        String[] myDateList = {yearStr, monthStr};
        String[] myDateList1 = {"year","month"};
        // 循环选择月份以及年份
        for(int i =0; i<2; i++){
            int inputYear = Integer.parseInt(dateListStr[i]);
            int year = Integer.parseInt(myDateList[i]);
            if(inputYear >= year){
                for(int j = year; j < inputYear; j++){
                    baseDriver.clickElement(baseDriver.getElementByElement(dateControl,GetLocator.getElementLocator(myDateList1[i]+"Next")));
                }
            }else {
                for(int j = inputYear; j < year; j++){
                    baseDriver.clickElement(baseDriver.getElementByElement(dateControl,GetLocator.getElementLocator(myDateList1[i]+"prev")));
                }
            }
        }


        // 确定到日期
        List<WebElement> allPrevMonth = baseDriver.getElementsByElement(dateControl,GetLocator.getElementLocator("prevMonthDate"));
        int sumOfPrevMonth = 0;
        for(WebElement element : allPrevMonth){
            if(element.isDisplayed()){
                sumOfPrevMonth++;
            }
        }
        int row = (sumOfPrevMonth+Integer.parseInt(dateListStr[2]))/7 + 2;
        int col = (sumOfPrevMonth+Integer.parseInt(dateListStr[2]))%7 == 0 ? 7 : (sumOfPrevMonth+Integer.parseInt(dateListStr[2]))%7 ;
        baseDriver.clickElement(baseDriver.getElementByElement(dateControl, By.xpath("div[2]/table[1]/tbody/tr["+row+"]/td["+col+"]/div/span")));

    }

}
