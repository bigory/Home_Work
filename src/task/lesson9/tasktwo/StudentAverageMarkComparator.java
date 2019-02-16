package task.lesson9.tasktwo;

import java.util.Comparator;

public class StudentAverageMarkComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAverageMark(), o2.getAverageMark());
    }
}