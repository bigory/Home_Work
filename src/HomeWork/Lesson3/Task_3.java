package HomeWork.Lesson3;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quaintlyDay = scan.nextInt();
        int sumRainfall = 0;
        int maxRainfall = 0;
        int rainfallDay;

        if (quaintlyDay == 0) {
            return;
        }

        for (int i = 0; i < quaintlyDay; i++) {
            rainfallDay = scan.nextInt();
            sumRainfall += rainfallDay;
            maxRainfall = isMaxRainfall(maxRainfall, rainfallDay);
        }

        System.out.print("QuaintlyDay: " + quaintlyDay + "\n" + "SumRainfall: " + sumRainfall + "\n");
        System.out.print("MiddleRainfall: " + isMiddleFall(sumRainfall, quaintlyDay) + "\n" + "MaxRainfall: " + maxRainfall);
    }

    public static double isMiddleFall(int sumRainfall, int quaintlyDay) {
        return (float) sumRainfall / quaintlyDay;
    }

    public static int isMaxRainfall(int maxRainfall, int rainFallDay) {
        if (rainFallDay > maxRainfall) {
            maxRainfall = rainFallDay;
        }
        return maxRainfall;
    }
}
