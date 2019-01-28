package HomeWork.Lesson2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int argumentA = scan.nextInt();
        int argumentB = scan.nextInt();
        int argumentC = scan.nextInt();

        double discrimininant = isDiscriminant(argumentA, argumentB, argumentC);
        System.out.println(isRoots(discrimininant, argumentA, argumentB));
    }

    public static double isDiscriminant(int argumentA, int argumentB, int argumentC) {
        return (Math.pow(argumentB, 2) - (4 * argumentA * argumentC));
    }

    public static boolean isPositive(double discriminant) {
        return discriminant > 0;
    }

    public static boolean isZero(double discriminant) {
        return discriminant == 0;
    }

    public static String isRoots(double discrimininant, double argumentA, double argumentB) {
        if (isPositive(discrimininant)) {
            double root1 = (-argumentB + Math.sqrt(discrimininant)) / (argumentA * 2);
            double root2 = (-argumentB - Math.sqrt(discrimininant)) / (argumentA * 2);
            return "roots:" + root1 + ";" + root2;
        }
        if (isZero(discrimininant)) {
            double root = -argumentB / (2 * argumentA);
            return "root:" + root;
        } else {
            return "Nigative discriminant!Not root!";
        }
    }
}
