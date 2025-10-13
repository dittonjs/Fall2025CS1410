public class Rectangle extends Shape{
    private final Point topleft;
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        this.topleft = new Point(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void move(double dX, double dY) {
        topleft.move(dX, dY);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getX() {
        return topleft.getX();
    }

    @Override
    public double getY() {
        return topleft.getY();
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
