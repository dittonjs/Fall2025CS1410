import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/test.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextDouble()) {
            System.out.printf("Amount: $%-10f is a good amount\n", scanner.nextDouble());
        }


        Scanner otherScanner = new Scanner(System.in);

        boolean done = false;
        do {
            System.out.println("Give me a number!");
            System.out.println(otherScanner.nextInt());
            System.out.println("Do you want to continue?: ");
            if (otherScanner.next().equalsIgnoreCase("n")) {
                done = true;
            }
        } while(!done);
     }
}
