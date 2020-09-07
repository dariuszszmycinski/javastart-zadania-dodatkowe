public class Circle {
    private Point middlePoint;
    private double radius;

    public Circle(Point middlePoint, double radius) {
        this.middlePoint = middlePoint;
        this.radius = radius;
    }

    public Point getMiddlePoint() {
        return middlePoint;
    }

    public double getRadius() {
        return radius;
    }
}
