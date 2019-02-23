package task.lesson13.one;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

public class FileLatter {

    public void createNewFile(Map<Character, Integer> mapLetters, Path pathNew) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathNew.toFile()))) {
            for (Map.Entry<Character, Integer> m : mapLetters.entrySet()) {
                bufferedWriter.write(m.getKey() + "-" + m.getValue());
                bufferedWriter.newLine();
            }
        }
    }
}