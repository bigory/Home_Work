package task.lesson9;

import java.util.ArrayList;
import java.util.List;

public class TaskOne {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("123");
        stringList.add("1234");
        stringList.add("abcd");
        stringList.add("123");
        stringList.add("1234123");
        stringList.add("1234123");
        stringList.add("123");
        stringList.add("ABCD");
        stringList.add("1231");

        System.out.println(markLenght4(stringList));
    }

    public static List<String> markLenght4(List<String> stringList) {

        int stringListSize = stringList.size();
        String str = "----";

        for (int i = 0; i <= stringListSize; i++)
            if (str.length() == stringList.get(i).length()) {
                stringListSize = stringList.size();
                stringList.add(i, "****");
                i++;
            }
        return stringList;
    }
}