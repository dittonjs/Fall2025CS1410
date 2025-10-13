public class Circle extends Shape {
    private Point center;
    private double radius;

    public Circle(double x, double y, double radius) {
        center = new Point(x, y);
        this.radius = radius;
    }

    @Override
    public void move(double dX, double dY) {
        center.move(dX, dY);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getX() {
        return center.getX();
    }

    @Override
    public double getY() {
        return center.getY();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
