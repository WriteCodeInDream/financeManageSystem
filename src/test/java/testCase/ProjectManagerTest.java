package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageHandle.ProjectManegeHandle;
import utils.GetDriver;
import utils.GetLocator;

import java.util.List;

public class ProjectManagerTest extends BaseCase{
    public ProjectManegeHandle pmh;
    public ProjectManagerTest() {
        super(GetDriver.getBaseDriver());
        //this.pmh = new ProjectManegeHandle(baseDriver);
    }

    @BeforeMethod
    public void beforeTest(){
        this.pmh = new ProjectManegeHandle(baseDriver);
    }

    @Test
    public void test(){
        System.out.println(pmh.getTableValues());
    }

    @Test
    public void test1(){
        System.out.println(pmh.getTableValue());
    }

    @Test
    public void test2(){
        pmh.searchMainContract();
    }


}