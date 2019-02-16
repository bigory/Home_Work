package task.lesson7;

public abstract class GeometricFigure implements GetParametrs {

    private Point pointUpperLeft;
    private Point pointLowerRight;
    private String name;

    public GeometricFigure(Point pointUpperLeft, Point pointLowerRight, String name) {

        this.pointUpperLeft = pointUpperLeft;
        this.pointLowerRight = pointLowerRight;
        this.name = name;
    }

        @Override
    public boolean isDefinitionEqualityArea(GeometricFigure figure) {
        return figure.calculateSquare() == this.calculateSquare();
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}