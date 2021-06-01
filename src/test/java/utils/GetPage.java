package utils;

public class GetPage {
    final static String fileName = "menuPath.properties";
    public static String getValue(String key){
        return ReadProperties.valueOfProperties(key, fileName);
    }
}
