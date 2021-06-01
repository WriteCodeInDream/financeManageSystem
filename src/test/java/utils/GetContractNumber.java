package utils;

import org.testng.annotations.Test;

public class GetContractNumber {

    public  static String getLastNumber(String number){

        String num = number.split("-")[2];
        int numArry[] = new int[num.length()];
        for(int i =0; i<num.length();i++){
            numArry[i] = Integer.parseInt(num.split("")[i]);
        }
        if(numArry[2] != 9){
            numArry[2] = numArry[2] + 1;
        }else if( numArry[1] != 9){
            numArry[2] = 0;
            numArry[1] = numArry[1] + 1;
        }else{
            numArry[2] = 0;
            numArry[1] = 0;
            numArry[0] = numArry[0] + 1;
        }
        String after = changeArryToString(numArry);
        return number.replaceFirst(num, after);
    }


    public static String changeArryToString(int[] numArry){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < numArry.length; i++ ){
            sb.append(numArry[i]);
        }
        return sb.toString();

    }

    @Test
    public  void test(){
        System.out.println(getLastNumber("2021-勘察-299"));
    }
}
