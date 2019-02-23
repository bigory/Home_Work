package task.lesson10.one;

import java.util.LinkedHashMap;
import java.util.Map;

public class TaskOne {

    public static void main(String[] args) {
        String englishText = "java .....Java   abcd    Java    @@@  !!!javA javA javA JAVA JAVA JAVA JAVA";

        System.out.println(countWordText(choiceWordText(englishText)));
    }

    public static String[] choiceWordText(String englishText) {
        return englishText.replaceAll("[^A-Za-z]", " ").replaceAll
                ("\\s+ ", " ").split("\\s");
    }

    public static Map<String, Integer> countWordText(String[] arrayEnglishWord) {
        Map<String, Integer> qualityWordText = new LinkedHashMap<>();
        int quality;

        for (String word1 : arrayEnglishWord) {
            quality = 0;
            for (String word2 : arrayEnglishWord) {
                if (word1.equals(word2)) {
                    quality++;
                }
            }
            qualityWordText.put(word1, quality);
        }
        return qualityWordText;
    }
}