package testcase;

import driverRelative.BaseDriver;

public class BaseCase {
    public BaseDriver baseDriver;

    public BaseCase(String driverType){
        this.baseDriver = new BaseDriver(driverType);
    }


}
