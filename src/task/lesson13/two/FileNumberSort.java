package task.lesson13.two;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileNumberSort {

    public void sortedNumberFile(Path path) throws IOException {
        List<Integer> integerList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(path.toFile())))) {
            while (scanner.hasNext()) {
                integerList.add(scanner.nextInt());
            }
        }

        integerList.sort(Integer::compareTo);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path.toFile()))) {
            int i = 0;
            while (integerList.size() > i) {
                bufferedWriter.write(String.valueOf(integerList.get(i)));
                bufferedWriter.newLine();
                i++;
            }
        }
    }
}