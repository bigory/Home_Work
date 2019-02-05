package task.lesson5;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine().toLowerCase().replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        System.out.println(isStrPalindrome(str));
    }

    public static boolean isStrPalindrome(String str) {
        double x = Math.ceil((double) str.length() / 2);
        boolean palindromeYesNo = true;

        for (int i = 0, j = str.length() - 1; i < x; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                palindromeYesNo = false;
            }
        }
        return palindromeYesNo;
    }
}