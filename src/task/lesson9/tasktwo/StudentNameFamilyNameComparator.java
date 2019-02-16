package task.lesson9.tasktwo;

import java.util.Comparator;

public class StudentNameFamilyNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            result = o1.getFamilyName().compareTo(o2.getFamilyName());
        }
        return result;
    }
}