package task.lesson9.tasktwo;

public class Student {

    private String name;
    private String familyName;
    private int age;
    private double averageMark;

    public Student(String name, String familyName, int age, double averageMark) {

        this.name = name;
        this.familyName = familyName;
        this.age = age;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age=" + age +
                ", averageMark=" + averageMark +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}