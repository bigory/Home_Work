package HomeWork.Lesson3;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int result = 0;

        for (; ; ) {
            result += value % 10;
            value /= 10;
            if (value / 10 == 0) {
                result += value % 10;
                System.out.println(result);
                break;
            }
        }
    }
}

