package task.lesson13.one;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TaskOne {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("lesson13", "resources", "taskOne", "poemPushkin.txt");
        Path pathNew = Paths.get("lesson13", "resources", "taskOne", "qualityLetterPoemPuskin.txt");
        MapLetter mapLetter = new MapLetter();
        FileLatter fileQualityLatter = new FileLatter();

        fileQualityLatter.createNewFile(mapLetter.createMapLetter(path), pathNew);
    }
}