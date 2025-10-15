import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            int result = divide(10,2);
            System.out.println(result);

            Scanner scanner = new Scanner(new File("inf.txt"));
            System.out.println(scanner.nextLine());
        } catch (DivideByZeroException ex) {
            System.out.println(ex.getMessage());
            System.out.printf("A was %d, and B was %d\n", ex.getA(), ex.getB()) ;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            throw ex;
        } catch (Exception ex) {
            System.out.println("An unexpected error occurred");
        } finally {
            System.out.println("Thanks for playing!");
        }

        System.out.println(" I am at the end");
    }


    public static int divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException(a, b);
        }
        return a / b;
    }
}


class DivideByZeroException extends Exception {
    private int a;
    private int b;
    public DivideByZeroException(int a, int b) {
        super("Cannot divide by zero, you moron.");
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
