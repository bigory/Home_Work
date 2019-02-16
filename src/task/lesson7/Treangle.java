package task.lesson7;

public class Treangle extends GeometricFigure implements High {

    private Point pointLowerLeft;

    public Treangle(Point pointUpperCentr, Point pointLowerRight, Point pointLowerLeft, String name) {
        super(pointUpperCentr, pointLowerRight, name);
        this.pointLowerLeft = pointLowerLeft;
    }

    @Override
    public double countHigh() {
        return Math.sqrt(((getPointUpperLeft().getY() - getPointLowerRight().getY()) - (getPointLowerRight().getX() -
                getPointLowerLeft().getX())) / 2);
    }

    @Override
    public String toString() {
        return "Figure: " + getName() + '\n' +
                "Coordinates point figure: " + draw() + '\n' +
                "High lenght: " + countHigh() + '\n' +
                "Figure area: " + calculateSquare();
    }

    @Override
    public String draw() {
        return "(" + getPointUpperLeft().getX() + ":" + getPointUpperLeft().getY() + ");(" +
                getPointLowerRight().getX() + ":" + getPointLowerRight().getY() + ");(" + this.pointLowerLeft.getX() +
                ":" + this.getPointLowerLeft().getY() + ")";
    }

    @Override
    public double calculateSquare() {
        return Math.abs((getPointLowerRight().getX() - getPointLowerLeft().getX()) / 2 * countHigh());
    }

    public Point getPointLowerLeft() {
        return pointLowerLeft;
    }

    public void setPointLowerLeft(Point pointLowerLeft) {
        this.pointLowerLeft = pointLowerLeft;
    }
}