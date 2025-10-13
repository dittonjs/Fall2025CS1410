public class Point extends TwoDimenisionalObject{
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public void move(double dX, double dY) {
        x += dX;
        y += dY;
    }
}
