package task.lesson4;

import java.util.Arrays;

public class TaskOne {

    public static void main(String[] args) {
        int[] arrayNum = {1, 2, 3, 4, 5, 6, 7, 8, 9,};

        System.out.println(Arrays.toString(returnArrayCycle(arrayNum)));
    }

    public static int[] returnArrayCycle(int[] arrayNum) {
        int finishNum;

        finishNum = arrayNum[arrayNum.length - 1];
        for (int i = arrayNum.length - 1; i >= 1; i--) {
            arrayNum[i] = arrayNum[i - 1];
            if (i == 1) {
                arrayNum[0] = finishNum;
            }
        }
        return arrayNum;
    }
}