package utils;

import java.io.IOException;

public class UploadFile {
    public static void uploadFile(String folder, String[] fileName){
        StringBuilder pickName = new StringBuilder();
        pickName.append(folder);
        for(int i = 0; i<fileName.length; i++){
            pickName.append("\"");
            pickName.append(fileName[i]);
            pickName.append("\" ");
        }
        pickName.toString();
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("src/test/resource/ChromeUploadFile.exe "+pickName);
            TimeSleep.TimeWaiting(5000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
