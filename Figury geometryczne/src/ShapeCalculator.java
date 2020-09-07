public class ShapeCalculator {

    public static double getRectangleArea(Rectangle rectangle) {
        double side1 = Math.sqrt(Math.pow(rectangle.getP2().getX() - rectangle.getP1().getX(), 2) + Math.pow(rectangle.getP2().getY() - rectangle.getP1().getY(), 2));
        double side2 = Math.sqrt(Math.pow(rectangle.getP3().getX() - rectangle.getP2().getX(), 2) + Math.pow(rectangle.getP3().getY() - rectangle.getP2().getY(), 2));
        return side1 * side2;
    }

    public static void printPointAndCircleRelation(Circle circle, Point point) {
        double pointsDistance = Math.sqrt(Math.pow(point.getX() - circle.getMiddlePoint().getX(), 2) + Math.pow(point.getY() - circle.getMiddlePoint().getY(), 2));
        if (pointsDistance == circle.getRadius()) {
            System.out.println("Punkt leży na okręgu.");
        } else if (pointsDistance < circle.getRadius()) {
            System.out.println("Punkt leży wewnątrz okręgu.");
        } else {
            System.out.println("Punkt leży poza okręgiem.");
        }
    }
}
