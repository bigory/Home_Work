package by.itacademy.boldysh.homework.lesson16;

public final class TaskOneUtil {

    public static final int QUANTITY_NIGHT = 100;
    public static final int QUANTITY_DETAIL_FIRST_NIGHT = 20;
    public static final int LENGTH_DAY = 100;

    private TaskOneUtil() {
    }

    public static String determinationWinner(CrazyScientist first, CrazyScientist second) {
        if (first.assembleRobot() > second.assembleRobot()) {
            return first.getName() + " !!Winner!!";
        } else if (first.assembleRobot() < second.assembleRobot()) {
            return second.getName() + "!!Winner!!";
        } else {
            return " !!Friendship win!! ";
        }
    }
}