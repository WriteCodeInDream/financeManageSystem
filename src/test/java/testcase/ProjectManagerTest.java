package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageHandle.ProjectManegeHandle;

public class ProjectManagerTest extends BaseCase{
    public ProjectManegeHandle pmh;
    public ProjectManagerTest() {
        super("chrome");
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

    @AfterTest
    public void afterTest(){
        baseDriver.closeDriver();
    }
}
