public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(20, 0), new Point(20, 10), new Point(0, 10));
        System.out.println(ShapeCalculator.getRectangleArea(rectangle));
        Circle circle = new Circle(new Point(0, 0), 15);
        Point point = new Point(5, 10);
        ShapeCalculator.printPointAndCircleRelation(circle, point);
    }
}
