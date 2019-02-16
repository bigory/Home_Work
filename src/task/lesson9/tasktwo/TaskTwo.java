package task.lesson9.tasktwo;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class TaskTwo {

    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student("Artem", "Ivanov", 18, 8.0),
                new Student("Petr", "Petrovich", 19, 9),
                new Student("Vasya", "Vasilefski", 21, 8.9),
                new Student("Artem", "Arbuzov", 22, 9.5),
                new Student("Artem", "Arbuz", 22, 7.6)
        );

        System.out.println(maxCount(studentList));

        studentList.sort(
                new StudentNameFamilyNameComparator().thenComparing(new StudentAgeComparator()).thenComparing
                        (new StudentAverageMarkComparator()));

        System.out.println(studentList);
    }

    public static Student maxCount(List<Student> studentList) {

        ListIterator<Student> iteratorList = studentList.listIterator();
        Student studentMaxBall = iteratorList.next();

        while (iteratorList.hasNext()) {
            if (iteratorList.next().getAverageMark() > studentMaxBall.getAverageMark()) {
                studentMaxBall = iteratorList.previous();
            }
        }
        return studentMaxBall;
    }
}