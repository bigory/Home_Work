package task.lesson7;

public class Rectangle extends GeometricFigure implements Diagonal {

    private Point pointLowerLeft;
    private Point pointUpperRight;

    public Rectangle(Point pointUpperLeft, Point pointUpperRight, Point pointLowerLeft,
                     Point pointLowerRight, String name) {

        super(pointUpperLeft, pointLowerRight, name);
        this.pointLowerLeft = pointLowerLeft;
        this.pointUpperRight = pointUpperRight;
    }

    @Override
    public double calculateSquare() {
        return Math.abs((getPointLowerRight().getX() - getPointLowerLeft().getX()) *
                (getPointLowerRight().getY() - getPointUpperRight().getY()));
    }

    @Override
    public double countDiagonalLength() {
        return Math.sqrt(Math.pow(getPointLowerRight().getX() - getPointLowerLeft().getX(), 2) +
                Math.pow(getPointLowerRight().getY() - getPointUpperRight().getY(), 2));
    }

    @Override
    public String draw() {
        return "(" + getPointUpperLeft().getX() + ":" + getPointUpperLeft().getY() + ");(" +
                getPointLowerRight().getX() + ":" + getPointLowerRight().getY() + ");(" + this.pointUpperRight.getX() +
                ":" + this.pointUpperRight.getY() + ");(" + this.pointLowerLeft.getX() + ":" +
                this.pointLowerLeft.getY() + ")";
    }

    @Override
    public String toString() {
        return "Figure: " + getName() + '\n' +
                "Coordinates point figure: " + draw() + '\n' +
                "Diagonal lenght: " + countDiagonalLength() + '\n' +
                "Figure area: " + calculateSquare();
    }

    public Point getPointLowerLeft() {
        return pointLowerLeft;
    }

    public void setPointLowerLeft(Point pointLowerLeft) {
        this.pointLowerLeft = pointLowerLeft;
    }

    public Point getPointUpperRight() {
        return pointUpperRight;
    }

    public void setPointUpperRight(Point pointUpperRight) {
        this.pointUpperRight = pointUpperRight;
    }
}