import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.insert(10);
        nums.insert(20);
        nums.insert(30);
        nums.insert(40);

        nums.forEach((v) -> {
            System.out.println("This is v: " + v);
            return true;
        });

        ArrayList<Integer> ints = new ArrayList<>();
        


        nums.forEach(v -> {
            if (v % 2 == 0) System.out.println("Even");
            else System.out.println("odd");
            return true;
        });



    }
}
