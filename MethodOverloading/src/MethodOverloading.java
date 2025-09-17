public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(divide(10.0, 4));
        System.out.println(divide(10,4));
        int value = Integer.parseInt("000012");

        double a = 10.0 / 2;
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value, 10);
    }

    public static double divide(double value1, double value2) {
        return value1 / value2;
    }

    public static int divide(int value1, int value2) {
        return value1 / value2;
    }

    public static double divide(String value1, String value2) {
        return Double.parseDouble(value1) / Double.parseDouble(value2);
    }
}
