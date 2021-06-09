package pageHandle;

import driverRelative.BaseDriver;
import pageElementOperate.CommonPageOperate;

public class CommonPageHandel {
    public CommonPageOperate co;
    public CommonPageHandel(BaseDriver baseDriver){
            this.co = new CommonPageOperate(baseDriver);
    }

}
