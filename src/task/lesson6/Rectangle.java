package task.lesson6;

public class Rectangle {
    private Point pointUpperLeft;
    private Point pointLowerRight;

    public Rectangle(Point pointUpperLeft, Point pointLowerRight) {
        this.pointUpperLeft = pointUpperLeft;
        this.pointLowerRight = pointLowerRight;
    }

    public Point getPointUpperLeft() {
        return this.pointUpperLeft;
    }

    public void setPointUpperLeft(Point pointUpperLeft) {
        this.pointUpperLeft = pointUpperLeft;
    }

    public Point getPointLowerRight() {
        return this.pointLowerRight;
    }

    public void setPointLowerRight(Point pointLowerRight) {
        this.pointLowerRight = pointLowerRight;
    }

    public double squareRectangle(Rectangle rectangle) {
        return Math.abs((rectangle.getPointUpperLeft().getX() - rectangle.getPointLowerRight().getX()) *
                (rectangle.getPointLowerRight().getY() - rectangle.getPointUpperLeft().getY()));
    }

    public double diagonalLengthRect(Rectangle rectangle) {
        return Math.sqrt(Math.pow(rectangle.getPointUpperLeft().getX() - rectangle.getPointLowerRight().getX(), 2) +
                Math.pow(rectangle.getPointLowerRight().getY() - rectangle.getPointUpperLeft().getY(), 2));
    }
}