package task.lesson13.two;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Random;

public class FileNumber {

    public Path createFileNumber(Path path) throws IOException {
        Random random = new Random();
        int qualityNumber = 50;

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path.toFile()))) {
            while (qualityNumber != 0) {
                bufferedWriter.write(String.valueOf(random.nextInt(100) + 1));
                bufferedWriter.newLine();
                qualityNumber--;
            }
        }
        return path;
    }
}