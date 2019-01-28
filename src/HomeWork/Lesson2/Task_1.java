package HomeWork.Lesson2;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the day of the month: ");
        int number = scan.nextInt();
        if (number > 31 || number < 1) {
            System.out.println("Information incorrect");
            return;
        }
        System.out.println("Enter month: ");
        int month = scan.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("Information incorrect");
            return;
        }
        System.out.println("Enter year: ");
        int year = scan.nextInt();
        if (year < 1) {
            System.out.println("Information incorrect");
            return;
        }

        if (month == 2 && number > isLeapYear(year)) {
            System.out.println("Information incorrect");
        } else if (number > isMaxDateMonth(month, year)) {
            System.out.println(("Information incorrect"));
        } else {
            System.out.println(isFollowDay(number, month, year));
        }
    }

    public static int isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 29;
        }
        return 28;
    }

    public static int isMaxDateMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year);
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static String isFollowDay(int number, int month, int year) {
        number += 1;
        if (number > isMaxDateMonth(month, year)) {
            number = 1;
            month++;
            if (month > 12) {
                month = 1;
                year += 1;
            }
        }
        return (number + "." + month + "." + year);
    }
}


