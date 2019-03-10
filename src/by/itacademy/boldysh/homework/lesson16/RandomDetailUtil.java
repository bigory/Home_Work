package by.itacademy.boldysh.homework.lesson16;

import java.util.Random;

public final class RandomDetailUtil {
    private static final Random RANDOM = new Random();
    private static final int MAX_DETAIL_SERVANT_FACTORY = 4;
    private static final int QUALITY_DETAIL_ROBOT = 9;

    private RandomDetailUtil() {
    }

    public static Random getRandom() {
        return RANDOM;
    }

    public static int getRandomNumber(int value) {
        return getRandom().nextInt(value);
    }

    public static int getRandomNumberDetailServantFactory() {
        return getRandom().nextInt(MAX_DETAIL_SERVANT_FACTORY) + 1;
    }

    public static int getQualityDetailRobot() {
        return getRandom().nextInt(QUALITY_DETAIL_ROBOT);
    }
}