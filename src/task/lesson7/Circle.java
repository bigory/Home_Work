package task.lesson7;

public class Circle extends GeometricFigure implements Radius {

    private Point pointCentralCircle;
    private static final double NUM_PI = 3.14;

    public Circle(Point pointUpperLeft, Point pointLowerRight, Point pointCentralCircle, String name) {
        super(pointUpperLeft, pointLowerRight, name);
        this.pointCentralCircle = pointCentralCircle;
    }

    @Override
    public double countRadius() {
        return Math.sqrt(Math.pow(getPointLowerRight().getX() - getPointUpperLeft().getX(), 2) +
                Math.pow(getPointUpperLeft().getY() - getPointLowerRight().getY(), 2));
    }

    @Override
    public String toString() {
        return "Figure: " + getName() + '\n' +
                "Coordinates point figure: " + draw() + '\n' +
                "Radius lenght: " + countRadius() + '\n' +
                "Figure area: " + calculateSquare();
    }

    @Override
    public String draw() {
        return "(Center circle: " + this.pointCentralCircle.getX() + ":" + this.pointCentralCircle.getY() +
                ");(" + getPointUpperLeft().getX() + ":" + getPointUpperLeft().getY() + ");(" +
                getPointLowerRight().getX() + ":" + getPointLowerRight().getY() + ")";
    }

    @Override
    public double calculateSquare() {
        return NUM_PI * Math.pow(countRadius(), 2);
    }

    public Point getPointCentralCircle() {
        return pointCentralCircle;
    }

    public void setPointCentralCircle(Point pointCentralCircle) {
        this.pointCentralCircle = pointCentralCircle;
    }
}