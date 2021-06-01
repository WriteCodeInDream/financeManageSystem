package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
    public static String valueOfProperties(String key, String fileName){
        Properties pr = new Properties();
        InputStream inputStream = ReadProperties.class.getClassLoader().getResourceAsStream(fileName);
        try {
            pr.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pr.getProperty(key);
    }
}
