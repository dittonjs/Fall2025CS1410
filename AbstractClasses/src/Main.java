public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(0,0, 10, 10);
        reportArea(shape);
        reportArea(new Circle(0,0, 1));
        reportLocation(new Point(5, 12));
        reportLocation(shape);
    }

    public static void reportLocation(TwoDimenisionalObject object) {
        System.out.printf("The location is (%f,%f)\n", object.getX(), object.getY());
    }

    public static void reportArea(Shape shape) {
        System.out.printf("The area of the shape is %f\n", shape.getArea());
    }
}
