public class Circle {

    private double radius;
    private Point center;
    public Circle(double x, double y, double radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public double getX() {
        return center.getX();
    }

    public double getY() {
        return center.getY();
    }

    public void move(double deltaX, double deltaY) {
        center.move(deltaX, deltaY);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
