import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        System.out.println(computePi());
    }

    private static double computePi() {
        double areaSum = 0;
        double totalChecks = 10000000;
        for (int j = 0; j < totalChecks; j ++) {
            areaSum += runSimulation();
        }
        return areaSum / 10;
    }

    private static double runSimulation(double totalChecks) {
        double timesInside = 0;
        for (int i = 0; i < totalChecks; i++) {
            double x = random(0, 1);
            double y = random(0, 1);
            if (isInsideUnitCircle(x, y)) {
                timesInside ++;
            }
        }
        return timesInside / totalChecks * 4;
    }

    private static double runSimulation() {
        return runSimulation(10000000);
    }

    private static double random(int min, int max) {
        return Math.random() * (max - min) + min;
    }

    private static boolean isInsideUnitCircle(double x, double y) {
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance <= 1;
    }





}
