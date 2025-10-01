public class Number {
    private double value = 0.0;

    public double getValue() {
        return value;
    }

    public Number add(double amount) {
        value += amount;
        return this;
    }

    public Number subtract(double amount) {
        value -= amount;
        return this;
    }

}
