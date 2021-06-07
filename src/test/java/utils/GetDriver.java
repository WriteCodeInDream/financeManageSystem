package utils;

import driverRelative.BaseDriver;

public class GetDriver {
    private static BaseDriver baseDriver = new BaseDriver(GetEnvironment.getValue("driverType"));

    private GetDriver(){}

    public static BaseDriver getBaseDriver(){
        return baseDriver;
    }
}
