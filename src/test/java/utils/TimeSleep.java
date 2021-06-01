package utils;

public class TimeSleep {

    public static void TimeWaiting(long waitingTime){
        try {
            Thread.sleep(waitingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
