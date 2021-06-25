package pageHandle;

import driverRelative.BaseDriver;
import enumString.MainSearchCondition;
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

    public void searchMainContract(){
        pmo.sendKeysToDateChoose("2022-03-25", "2023-04-18", MainSearchCondition.REGISTER_TIME_STARE);
        pmo.sendKeysToDropList("勘察",MainSearchCondition.MAIN_TYPE);
        pmo.sendKeysToInput("aaaaaaaa", MainSearchCondition.NUMBER);
        pmo.sendKeysToInput("2021-见证-009", MainSearchCondition.ENTRUST_COMPANY);
        pmo.sendKeysToInput("2021-见证-009", MainSearchCondition.PROJECT_NAME);
        pmo.sendKeysToInput("2021-见证-009", MainSearchCondition.PROJECT_NATURE);
        pmo.sendKeysToDropList("建设公司",MainSearchCondition.PRACTICING_ENTITY);
        pmo.sendKeysToDateChoose("2019-12-25", "2023-05-19",MainSearchCondition.INVOICE_TIME_START);
        pmo.sendKeysToDateChoose("2019-12-25", "2020-06-12",MainSearchCondition.PAY_TIME_END);
    }
}
