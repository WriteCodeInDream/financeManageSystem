package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.CommonPageOperate;

public class CommonPageHandel {
    public CommonPageOperate co;
    public CommonPageHandel(BaseDriver baseDriver){
            this.co = new CommonPageOperate(baseDriver);
    }

    public void closeContent(){
        co.clickContentCloseButton();
    }

    public void cancelOperate(){
        co.clickContentCancelButton();
    }

    public void commitOperate(){
        co.clickContentCommitButton();
    }
}
