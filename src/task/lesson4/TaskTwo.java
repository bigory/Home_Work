package task.lesson4;

import java.util.Arrays;

public class TaskTwo {

    public static void main(String[] args) {
        int[] arrayNumber = {1, 2, 1, 3, 4, 3, 8, 2, 7, 3};

        System.out.println(Arrays.toString(createArrayDelRepeat(arrayNumber)));
    }

    public static int[] createArrayDelRepeat(int[] arrayNumber) {
        int x = 0;
        int[] arrayIndexRepeatNum = new int[arrayNumber.length];

        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayIndexRepeatNum[i] == 0) {
                for (int j = i + 1; j < arrayNumber.length; j++) {
                    if (arrayNumber[i] == arrayNumber[j]) {
                        arrayIndexRepeatNum[j] = j;
                        x++;
                    }
                }
            }
        }
        int[] arrayDelRepeat = new int[arrayNumber.length - x];

        for (int i = 0, l = 0; i < arrayNumber.length; i++) {
            if (arrayIndexRepeatNum[i] == 0) {
                arrayDelRepeat[l++] = arrayNumber[i];
            }
        }
        return arrayDelRepeat;
    }
}