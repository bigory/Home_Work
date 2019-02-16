package task.lesson7;

public class Squares extends Rectangle {

    public Squares(Point pointUpperLeft, Point pointUpperRight, Point pointLowerLeft,
                   Point pointLowerRight, String name) {
        super(pointUpperLeft, pointLowerRight, pointLowerLeft, pointUpperRight, name);
    }

    @Override
    public double countDiagonalLength() {
        return Math.sqrt(2) * (getPointLowerRight().getX() - getPointLowerLeft().getX());
    }

    @Override
    public double calculateSquare() {
        return Math.abs((getPointLowerRight().getX() - getPointLowerLeft().getX()) * 2);
    }
}