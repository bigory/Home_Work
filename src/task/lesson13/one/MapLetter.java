package task.lesson13.one;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapLetter {

    public Map<Character, Integer> createMapLetter(Path path) throws FileNotFoundException {
        Map<Character, Integer> mapLetter = new TreeMap<>();

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(path.toFile())))) {
            while (scanner.hasNext()) {
                String str = scanner.next().toLowerCase().replaceAll("[ё]", "е")
                        .replaceAll("[^а-я]", "");
                int count = 0;
                while (str.length() > count) {
                    if (!(mapLetter.containsKey(str.charAt(count)))) {
                        mapLetter.put(str.charAt(count), 1);
                    } else {
                        mapLetter.put(str.charAt(count), mapLetter.get(str.charAt(count)) + 1);
                    }
                    count++;
                }
            }
        }
        return mapLetter;
    }
}