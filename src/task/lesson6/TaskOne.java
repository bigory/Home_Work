package task.lesson6;

public class TaskOne {

    public static void main(String[] args) {
        Point pointOne = new Point(1, 3);
        Point pointTwo = new Point(6, 1);
        Rectangle rectangle = new Rectangle(pointOne, pointTwo);

        System.out.println("Distance between point: " + pointOne.distance(pointTwo));
        System.out.println("Square rectangle: " + rectangle.squareRectangle(rectangle));
        System.out.println("Length diagonal rectangle: " + rectangle.diagonalLengthRect(rectangle));
    }
}