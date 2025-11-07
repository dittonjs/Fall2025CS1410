import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pair<String, Double> pair1 = new Pair<>("twenty 5 point 2", 25.2);
        Pair<Thread, Scanner> pair2 = new Pair<>(new Thread(() -> {}), new Scanner(System.in));
        Pair<Double, Double> pair3 = new Pair<>(25.2, 43.3);
        String value = pair1.getFirst();
        double value2 = pair1.getSecond();

        System.out.println(pair2);




    }
}
