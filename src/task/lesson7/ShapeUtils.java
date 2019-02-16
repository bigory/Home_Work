package task.lesson7;

public final class ShapeUtils {

    private ShapeUtils() {
    }

    public static boolean isRectangle(GeometricFigure figure) {
        return figure instanceof Rectangle;
    }

    public static boolean isTreangle(GeometricFigure figure) {
        return figure instanceof Treangle;
    }
}