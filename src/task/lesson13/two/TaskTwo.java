package task.lesson13.two;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TaskTwo {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("lesson13", "resources", "taskTwo", "number.txt");
        FileNumber fileNumber = new FileNumber();
        FileNumberSort numberFileSort = new FileNumberSort();

        numberFileSort.sortedNumberFile(fileNumber.createFileNumber(path));
    }
}