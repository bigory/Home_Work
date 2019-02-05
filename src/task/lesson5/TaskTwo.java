package task.lesson5;

public class TaskTwo {

    public static void main(String[] args) {
        String romanNumerals = "MMIXX";

        System.out.println(conversionNumber(romanNumerals));
    }

    public static int conversionNumber(String romanNumerals) {
        int result = 0;
        int currentNum = 0;
        int pastNum;

        for (int i = romanNumerals.length() - 1; i >= 0; i--) {
            pastNum = currentNum;
            switch (romanNumerals.charAt(i)) {
                case 'M':
                    currentNum = 1000;
                    break;
                case 'D':
                    currentNum = 500;
                    break;
                case 'C':
                    currentNum = 100;
                    break;
                case 'L':
                    currentNum = 50;
                    break;
                case 'X':
                    currentNum = 10;
                    break;
                case 'V':
                    currentNum = 5;
                    break;
                case 'I':
                    currentNum = 1;
                    break;
            }
            if (currentNum < pastNum) {
                result -= currentNum;
                continue;
            }
            result += currentNum;
        }
        return result;
    }
}