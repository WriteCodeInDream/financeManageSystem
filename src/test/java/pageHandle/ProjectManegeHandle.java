package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.ProjectManegeOperate;

import java.lang.ref.PhantomReference;

public class ProjectManegeHandle {
    public ProjectManegeOperate pmo;
    public ProjectManegeHandle(BaseDriver baseDriver){
        this.pmo = new ProjectManegeOperate(baseDriver);
    }

    public String getTableValues(){
       return pmo.getTableCellsMap(1).toString();
    }

    public String getTableValue(){
        return pmo.getTableCellValue("合同编号", 1);
    }
}
