public class Circle extends Shape implements Comparable {
    /// .... circle things
    ///
    public double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void writeToFile() {
        System.out.println("Writing circle");
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Circle) {
            Circle other  = (Circle) o;
            double diff = this.radius - other.radius;
            if (diff < 0) {
                return -1;
            } else if (diff > 0) {
                return 1;
            }
            return 0;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Circle with Radius " + radius + "\n";
    }
}
