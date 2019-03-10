package by.itacademy.boldysh.homework.lesson18;

import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReportCommonTimeActionUtil {
    private static final String REGEX_ONE = "(\\d{2}:\\d{2})-(\\d{2}:\\d{2})\\s(\\W*)";
    private static final String REGEX_TWO = "^(Упражнения|Перерыв|Обеденный перерыв|Решения)$";
    private static final String FORMAT_REPORT_TIME = "%s: %s минут %s %%";
    private static final String EMPTY_LINE = "";

    private ReportCommonTimeActionUtil() {
    }

    public static Deque<String> getReportCommonTimeAction(List<String> timeIntervalAction) {
        Pattern pattern = Pattern.compile(REGEX_ONE);
        Deque<String> resultLogCourses = new LinkedList<>();
        Map<String, Integer> totalTimeAction = new LinkedHashMap<>();
        Map<String, Integer> actionTime = new LinkedHashMap<>();

        for (String value : timeIntervalAction) {
            if (!value.equals(EMPTY_LINE)) {
                Matcher matcher = pattern.matcher(value);
                while (matcher.find()) {
                    Integer intervalTimeAction = TimeUtil.getHoldTime(TimeUtil.convertTime(matcher.group(1)),
                            TimeUtil.convertTime(matcher.group(2)));
                    if (!isAction(matcher.group(3))) {
                        totalTimeAction.merge("Лекции", intervalTimeAction, (a, b) -> a + b);
                        actionTime.put(matcher.group(3), intervalTimeAction);
                    } else {
                        totalTimeAction.merge(matcher.group(3), intervalTimeAction, (a, b) -> a + b);
                    }
                }
            } else {
                composeTimeAction(resultLogCourses, totalTimeAction, actionTime);
                totalTimeAction = new LinkedHashMap<>();
                actionTime = new LinkedHashMap<>();
            }
        }
        composeTimeAction(resultLogCourses, totalTimeAction, actionTime);
        return resultLogCourses;
    }

    private static boolean isAction(String action) {
        Pattern pattern = Pattern.compile(REGEX_TWO);
        Matcher matcher = pattern.matcher(action);
        return matcher.matches();
    }

    private static void composeTimeAction(Deque<String> resultLogCourses, Map<String, Integer> totalTimeAction, Map<String, Integer> actionTime) {
        Optional<Integer> totalTime = totalTimeAction.values().stream()
                .reduce((s1, s2) -> s1 + s2);
        for (String s1 : totalTimeAction.keySet()) {
            resultLogCourses.addLast(String.format(FORMAT_REPORT_TIME, s1, totalTimeAction.get(s1),
                    TimeUtil.getProcentTime(totalTimeAction.get(s1), totalTime.get())));
        }
        resultLogCourses.addLast("Лекции: ");
        for (String s : actionTime.keySet()) {
            resultLogCourses.addLast(String.format(FORMAT_REPORT_TIME, s, actionTime.get(s),
                    TimeUtil.getProcentTime(actionTime.get(s), totalTime.get())));
        }
        resultLogCourses.addLast(EMPTY_LINE);
    }
}
