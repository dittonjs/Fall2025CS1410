import java.util.Scanner;

public class StringFormatting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many spaces for the number output: ");
        int howManySpaces = scanner.nextInt();
        String formatString = "%" + howManySpaces + ".2f was spent\n";


        for (int i = 0; i < 1000; i++) {
            double randomNum = Math.random() * 50000;
            System.out.printf(formatString, randomNum);
        }

        int a = 10;
        System.out.printf("The num is %10d\n", a);

        String name = "Joseph";
        System.out.printf("Your name is %10s\n", scanner);


    }
}
