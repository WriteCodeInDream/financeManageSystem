package utils;

import java.io.UnsupportedEncodingException;
import java.util.Random;

public class GetRandomChinese {

    public static String create(int length) {
        StringBuilder sb = new StringBuilder();
        String str = null;
        int heightPos, lowPos; // 定义高低位
        Random random = new Random();
        for(int i = 0 ; i<length; i++){
            heightPos = (176 + Math.abs(random.nextInt(39)));//获取高位值
            lowPos = (161 + Math.abs(random.nextInt(93)));//获取低位值
            byte[] b = new byte[2];
            b[0] = (new Integer(heightPos).byteValue());
            b[1] = (new Integer(lowPos).byteValue());
            try {
                str = new String(b, "GBk");//转成中文
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            sb.append(str);
        }
        return sb.toString();
    }
    public static String create(){
        int length = new Random().nextInt(50);
        return create(length);
    }
}
