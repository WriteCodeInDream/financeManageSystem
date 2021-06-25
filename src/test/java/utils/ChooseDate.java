package utils;

import driverRelative.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChooseDate {
    public static void chooseDate(String date , BaseDriver baseDriver, List<WebElement> elements){
        // 先点击需要输入日期的时间选择器
        String[] dateListStr = date.split("-");
        String yearStr;
        String monthStr;
        WebElement dateControl = null;
        for(WebElement element : elements){
            if(baseDriver.isDisplayed(element)){
                dateControl = element;
            }
        }

        yearStr = baseDriver.getTextByElement(GetLocator.getElementLocator("dataControlYear"),dateControl).split(" ")[0];
        monthStr = baseDriver.getTextByElement(GetLocator.getElementLocator("dataControlMonth"),dateControl).split(" ")[0];
        //选择到年份
        int year = Integer.parseInt(yearStr);
        int month = Integer.parseInt(monthStr);
        int yearChoose = Integer.parseInt(dateListStr[0]);
        int monthChoose = Integer.parseInt(dateListStr[1]);
        int dateChoose = Integer.parseInt(dateListStr[2]);
        chooseYear(year,yearChoose,dateControl,baseDriver);
        chooseMonth(month,monthChoose,dateControl,baseDriver);
        chooseDate(dateChoose,dateControl,baseDriver,true);
    }


    public static void chooseDate(String startTime, String endTime, BaseDriver baseDriver, List<WebElement> elements){
        WebElement dateControl = null;
        List<WebElement> tdTag;
        for(WebElement element: elements){
            if(baseDriver.isDisplayed(element)){
                dateControl = element;
            }
        }
        if( dateControl == null){
            throw new NoSuchElementException("没有找到该时间选择器，请检查输入");
        }
        WebElement leftDateControl = dateControl.findElements(By.xpath("div")).get(0);
        WebElement rightDateControl = dateControl.findElements(By.xpath("div")).get(1);
        String leftTitle = baseDriver.getTextByElement(GetLocator.getElementLocator("dataTitle"),leftDateControl);
        int leftYear = Integer.parseInt(leftTitle.split(" ")[0]);
        int leftMonth = Integer.parseInt(leftTitle.split(" ")[2]);
        String rightTitle = baseDriver.getTextByElement(GetLocator.getElementLocator("dataTitle"),rightDateControl);
        int rightYear = Integer.parseInt(rightTitle.split(" ")[0]);
        int rightMonth = Integer.parseInt(rightTitle.split(" ")[2]);
        int beginYear = Integer.parseInt(startTime.split("-")[0]);
        int beginMonth = Integer.parseInt(startTime.split("-")[1]);
        int beginDate = Integer.parseInt(startTime.split("-")[2]);
        int endYear = Integer.parseInt(endTime.split("-")[0]);
        int endMonth = Integer.parseInt(endTime.split("-")[1]);
        int endDate = Integer.parseInt(endTime.split("-")[2]);
        // 如果起止时间都小于目前的左选择，可以只用左边的选择器确定时间
        // 如果起止时间都大于目前的右选择，可以只用右边的选择器确定时间
        if(beginYear>rightYear || (beginYear ==rightYear &&beginMonth >= rightMonth)){
            // 选择起始年份
            chooseYear(rightYear,beginYear,rightDateControl,baseDriver);
            // 选择起始月份
            chooseMonth(rightMonth,beginMonth,rightDateControl,baseDriver);
            // 选择时间
            chooseDate(beginDate,rightDateControl,baseDriver,false);

            // 选择截至年份
            chooseYear(beginYear,endYear,rightDateControl,baseDriver);
            //选择截至月份
            chooseMonth(beginMonth,endMonth,rightDateControl,baseDriver);
            // 选择截至日期
            chooseDate(endDate,rightDateControl,baseDriver,false);

        }
        //  只用左边的时间选择器
        else if (endYear<leftYear || (endMonth==leftYear && endMonth <= leftMonth)){
            // 选择开始时间
            // 选择起始年份
            chooseYear(leftYear,endYear,leftDateControl,baseDriver);
            // 选择起始月份
            chooseMonth(leftMonth,endMonth, leftDateControl,baseDriver);
            // 选择时间
            chooseDate(endDate,leftDateControl,baseDriver,false);

            // 选择截至年份
            chooseYear(endYear,beginYear,leftDateControl,baseDriver);
            //选择截至月份
            chooseMonth(endMonth,beginMonth,leftDateControl,baseDriver);
            // 选择截至日期
            chooseDate(beginDate,leftDateControl,baseDriver,false);
            //选择截止时间
        }
        // 开始时间用左边的，结束时间用右边的选择器
        else {
            // 选择开始时间
            chooseYear(leftYear,beginYear,leftDateControl,baseDriver);
            // 选择起始月份
            chooseMonth(leftMonth,beginMonth, leftDateControl,baseDriver);
            // 选择时间
            chooseDate(beginDate,leftDateControl,baseDriver,false);

            // 选择截至年份
            chooseYear(rightYear,endYear,rightDateControl,baseDriver);
            //选择截至月份
            chooseMonth(rightMonth,endMonth,rightDateControl,baseDriver);
            // 选择截至日期
            chooseDate(endDate,rightDateControl,baseDriver,false);
            //选择截止时间

        }

    }

    public static void chooseYear(int dateYear, int chooseYear,WebElement dateControl,BaseDriver baseDriver){
        for(int i = 0 ;i < chooseYear-dateYear; i++){
            baseDriver.clickElement(baseDriver.getElementByElement(dateControl,GetLocator.getElementLocator("yearNext")));
        }
        for(int i = 0; i < dateYear -chooseYear; i++){
            baseDriver.clickElement(baseDriver.getElementByElement(dateControl,GetLocator.getElementLocator("yearPrev")));
        }
    }

    public static void chooseMonth(int dateMonth, int chooseMonth,WebElement dateControl,BaseDriver baseDriver){
        for(int i = 0 ;i < chooseMonth-dateMonth; i++){
            baseDriver.clickElement(baseDriver.getElementByElement(dateControl,GetLocator.getElementLocator("monthNext")));
        }
        for(int i = 0; i < dateMonth -chooseMonth; i++){
            baseDriver.clickElement(baseDriver.getElementByElement(dateControl,GetLocator.getElementLocator("monthPrev")));
        }
    }

    public static void chooseDate(int date,WebElement dateControl,BaseDriver baseDriver,boolean flag){
        int sumOfPrevMonth = 0;
        List<WebElement> tdTag= baseDriver.getElementsByElement(dateControl,By.tagName("td"));
        for(WebElement element : tdTag){
            if(baseDriver.getAttribute(element, "class").equals("prev-month")){
                sumOfPrevMonth++;
            }else {
                break;
            }
        }
        int row = (sumOfPrevMonth+date)/7 + 2;
        int col = (sumOfPrevMonth+date)%7 == 0 ? 7 : (sumOfPrevMonth+date)%7 ;
        if(flag){
            baseDriver.clickElement(baseDriver.getElementByElement(dateControl, By.xpath("div[2]/table[1]/tbody/tr["+row+"]/td["+col+"]/div/span")));
        }else {
            baseDriver.clickElement(baseDriver.getElementByElement(dateControl, By.xpath("table/tbody/tr["+row+"]/td["+col+"]/div/span")));
        }
    }

}
