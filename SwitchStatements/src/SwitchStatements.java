import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String role = scanner.next();
        final String adminRole = "admin";

        switch (role) {
            case "user":
                int a = 10;
                System.out.println("Welcome!");
                break;
            case "manager":
                System.out.println("Configure settings...");
                break;
            case "admin":
                System.out.println("Delete all the users?");
                break;
            default:
                System.out.println("Invalid role");
                break;
        }

    }
}
