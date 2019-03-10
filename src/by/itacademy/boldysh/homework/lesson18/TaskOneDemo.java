package by.itacademy.boldysh.homework.lesson18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TaskOneDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("lesson18", "log-file.txt");
        Path pathReportTimeIntervalAction = Paths.get("lesson18", "log-file-time-interval-action.txt");
        Path pathTotalTimeCourses = Paths.get("lesson18", "log-file-total-time-courses.txt");

        List<String> actionCourses = Files.readAllLines(path);
        Files.write(pathReportTimeIntervalAction, ReportIntervalTimeActionUtil.
                getReportTimeIntervalAction(actionCourses));
        List<String> reportTimeIntervalAction = Files.readAllLines(pathReportTimeIntervalAction);
        Files.write(pathTotalTimeCourses, ReportCommonTimeActionUtil.getReportCommonTimeAction(reportTimeIntervalAction));
    }
}
