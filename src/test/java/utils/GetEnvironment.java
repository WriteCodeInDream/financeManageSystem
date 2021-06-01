package utils;

public class GetEnvironment {
    final static String fileName = "environment.properties";
    public static String getValue(String key){
        return ReadProperties.valueOfProperties(key, fileName);
    }
}
