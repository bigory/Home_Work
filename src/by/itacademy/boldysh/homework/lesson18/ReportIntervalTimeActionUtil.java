package by.itacademy.boldysh.homework.lesson18;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReportIntervalTimeActionUtil {
    private static final String REGEX_ONE = "(\\d{2}:\\d{2})\\s(\\W+)(\\d{2}:\\d{2})";
    private static final String EMPTY_LINE = "";
    private static final String FORMAT_TIME_INTERVAL = "%s-%s %s";

    private ReportIntervalTimeActionUtil() {
    }

    public static Deque<String> getReportTimeIntervalAction(List<String> logs) {
        Pattern pattern = Pattern.compile(REGEX_ONE);
        Matcher matcher = pattern.matcher(String.join(EMPTY_LINE, logs));
        Deque<String> timeIntervalAction = new LinkedList<>();

        int start = 0;
        while (matcher.find(start)) {
            String formatNumber = String.format(FORMAT_TIME_INTERVAL, matcher.group(1), matcher.group(3),
                    matcher.group(2));
            if (!matcher.group(2).equals("Конец")) {
                timeIntervalAction.addLast(formatNumber);
            } else {
                timeIntervalAction.addLast(EMPTY_LINE);
            }
            start = matcher.start(3);
        }
        return timeIntervalAction;
    }
}