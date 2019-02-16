package task.lesson7;

public class TaskOne {

    public static void main(String[] args) {

        Point point1 = new Point(1, 6);
        Point point2 = new Point(3, 6);
        Point point3 = new Point(6, 6);
        Point point4 = new Point(6, 4);
        Point point5 = new Point(1, 4);
        Point point6 = new Point(3, 4);
        Point point7 = new Point(3, 4);
        Point point8 = new Point(1, 1);
        Point point9 = new Point(6, 1);

        Rectangle rectangle = new Rectangle(point2, point3, point6, point4, "Rectangle");
        Treangle treangle = new Treangle(point7, point8, point9, "Treangle");
        Squares squares = new Squares(point1, point2, point5, point6, "Squares");
        Circle circle = new Circle(point7, point5, point4, "Circle");

        System.out.println(rectangle + "\n");
        System.out.println(squares + "\n");
        System.out.println(treangle + "\n");
        System.out.println(circle + "\n");

        System.out.println(rectangle.isDefinitionEqualityArea(squares));
        System.out.println(rectangle.isDefinitionEqualityArea(treangle));
        System.out.println(squares.isDefinitionEqualityArea(circle));
        System.out.println(treangle.isDefinitionEqualityArea(treangle));
        System.out.println(ShapeUtils.isTreangle(treangle));
        System.out.println(ShapeUtils.isRectangle(circle));
    }
}