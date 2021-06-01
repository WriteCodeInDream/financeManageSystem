package utils;

import java.math.BigDecimal;
import java.util.Random;

public class GetMoney {
    public static String getRandomMoney(double length, int point){
        double var1 = Math.random();
        BigDecimal var2 = new BigDecimal(var1*Math.pow(10 ,length));
        return var2.setScale(point,BigDecimal.ROUND_CEILING).toString();
    }
    public static String getRandomMoney(){
        int length = new Random().nextInt(12);
        int point = new Random().nextInt(3);
        return getRandomMoney(length, point);
    }
}
