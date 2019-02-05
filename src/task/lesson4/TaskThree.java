package task.lesson4;

import java.util.Arrays;

public class TaskThree {

    public static void main(String[] args) {
        int[] arrayNumOne = {3, 4, 5, 6, 7};
        int[] arrayNumTwo = {1, 2};

        System.out.println(Arrays.toString(createArrayOneTwo(arrayNumOne, arrayNumTwo)));
    }

    public static int[] createArrayOneTwo(int[] arrayNumOne, int[] arrayNumTwo) {
        int k = 0;
        int j = 0;
        int[] arrayNumFinal = new int[sumlLengthArray(arrayNumOne.length, arrayNumTwo.length)];

        for (int i = 0; i < arrayNumFinal.length; i++) {
            if ((i % 2 == 0 || i > arrayNumTwo.length * 2)) {
                if (i >= arrayNumOne.length * 2) {
                    arrayNumFinal[i] = arrayNumTwo[k];
                    k++;
                } else {
                    arrayNumFinal[i] = arrayNumOne[j];
                    j++;
                }
            } else {
                arrayNumFinal[i] = arrayNumTwo[k];
                k++;
            }
        }
        return arrayNumFinal;
    }

    public static int sumlLengthArray(int lengthOneArray, int lengthTwoArray) {
        return lengthOneArray + lengthTwoArray;
    }
}