package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageHandle.ProjectManegeHandle;
import utils.GetDriver;

public class ProjectManagerTest extends BaseCase{
    public ProjectManegeHandle pmh;
    public ProjectManagerTest() {
        super(GetDriver.getBaseDriver());
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

}
