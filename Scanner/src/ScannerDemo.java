import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("What score did the student get (0-100): ");
//        int score = scanner.nextInt();
//
//        if (score >= 92) {
//            System.out.println("A");
//        } else if (score >= 80) {
//            System.out.println("B");
//        } else if (score >= 70) {
//            System.out.println("C");
//        } else if (score >= 60) {
//            System.out.println("D");
//        } else {
//            System.out.println("F");
//        }

        String role = scanner.next(); // "teacher";

        if (role.equals("student")) {
            System.out.println("You are a student!");
        } else if (role.equals("teacher")) {
            System.out.println("You are a teacher!");
        } else  {
            System.out.println("I don't know what you are...");
        }

    }
}
