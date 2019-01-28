package HomeWork.Lesson3;

import java.util.Scanner;

public class Task_2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberUser = scan.nextInt();
        int startNum = 0;
        int currNumFibonacci = 1;

        if (numberUser == 0) {
            System.out.println(0);
            return;
        }
        System.out.println(isNumberFib(numberUser, startNum, currNumFibonacci));
    }

    public static String isNumberFib(int numberUser, int pastNumFib, int currNumFib) {
        String result = "0 1 ";
        for (; ; ) {
            int nextNumFib = pastNumFib + currNumFib;
            pastNumFib = currNumFib;
            currNumFib = nextNumFib;
            if (nextNumFib < numberUser) {
                result += nextNumFib + " ";
            } else {
                break;
            }
        }
        return result;
    }
}
