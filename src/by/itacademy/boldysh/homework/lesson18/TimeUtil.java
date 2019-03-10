package by.itacademy.boldysh.homework.lesson18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
    private static final int MIC_SEC = 60000;
    private static final int PROCENT = 100;

    private TimeUtil() {
    }

    public static Date convertTime(String startTime) {
        Date date = null;
        SimpleDateFormat format = new SimpleDateFormat("H:mm");
        try {
            date = format.parse(startTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static Integer getHoldTime(Date dateStart, Date dateEnd) {
        long timeDefference = dateEnd.getTime() - dateStart.getTime();
        return (int) (timeDefference / (MIC_SEC));
    }

    public static Integer getProcentTime(int actionTime, int totalTime) {
        return actionTime * PROCENT / totalTime;
    }
}
