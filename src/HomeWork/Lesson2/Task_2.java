package HomeWork.Lesson2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();

        if (a <= 0 || b <= 0 || c <= 0 || d <= 0 || e <= 0 || f <= 0) {
            System.out.println("Information incorrect");
        } else {
            if ((izSumSide(a, c) <= e) && (b <= f && d <= f) || (izSumSide(a, c) <= f) && (d <= e && b <= f)) {
                System.out.println("Fit");
            } else if ((izSumSide(b, d) <= e) && (a <= f && c <= f) || (izSumSide(d, b) <= f) && (a <= e && c <= e)) {
                System.out.println("Fit");
            } else if ((izSumSide(a, d) <= e) && (b <= f && c <= f) || (izSumSide(a, d) <= f) && (b <= e && c <= e)) {
                System.out.println("Fit");
            } else if ((izSumSide(b, c) <= e) && (a <= f && d <= e) || (izSumSide(b, c) <= f) && (a <= e && d <= f)) {
                System.out.println("Fit");
            } else {
                System.out.println("Don't fit");
            }
        }
    }

    public static int izSumSide(int x, int y) {
        return x + y;
    }
}





