package HomeWork.Lesson3;

import java.util.Scanner;

public class Task_2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberUser = scan.nextInt();
        int startNum = 0;
        int currNumFibonacci = 1;
        String result = "0 1 ";

        if (numberUser == 0) {
            System.out.println(0);
            return;
        }
        System.out.print(result);
        System.out.print(isNumberFibRecurs(numberUser, startNum, currNumFibonacci));
    }

    public static String isNumberFibRecurs(int numberUser, int pastNumFib, int currNumFib) {
        int nextNumFib = pastNumFib + currNumFib;
        String result = "";
        if (nextNumFib < numberUser) {
            pastNumFib = currNumFib;
            currNumFib = nextNumFib;
            result += nextNumFib;
            System.out.print(result + " ");
            return isNumberFibRecurs(numberUser, pastNumFib, currNumFib);
        }
        return result;
    }
}
