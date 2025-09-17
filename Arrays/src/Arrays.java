public class Arrays {
    public static void main(String[] args) {
        int size = 8;
        int[] values = new int[5];
        String[] myStrings = new String[size];
        int[] hardCodedValues = {4,3,67,43,14,76};
        doubleValues(hardCodedValues);
        report(hardCodedValues);
        report(myStrings);
    }

    public static void report(int[] values) {
        for(int x : values) {
            System.out.println(x);
        }
    }

    public static void report(String[] values) {
        for(String x : values) {
            System.out.println(x);
        }
    }

    public static void doubleValues(int[] values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * 2;
        }
    }
}
