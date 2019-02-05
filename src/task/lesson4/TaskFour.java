package task.lesson4;

import java.util.Arrays;

public class TaskFour {

    public static void main(String[] args) {
        int[][] arrayNumTwodimen = new int[][]{{0, 0, 0, 0}, {1, 1}, {2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4, 4}};

        System.out.println(Arrays.toString((linearize(arrayNumTwodimen))));
    }

    public static int[] linearize(int[][] arrayNumTwodimen) {
        int sumLength = 0;

        for (int[] arrayNumOnedimen : arrayNumTwodimen) {
            sumLength += arrayNumOnedimen.length;
        }

        int[] arrayNumOne = new int[sumLength];
        int k = 0;

        for (int[] arrayNumOnedimen : arrayNumTwodimen) {
            for (int i : arrayNumOnedimen) {
                arrayNumOne[k] = i;
                k++;
            }
        }
        return arrayNumOne;
    }
}