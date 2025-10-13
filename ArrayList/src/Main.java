import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Joseph");
        names.add("Sophie");
        names.add("Catelyn");
        names.add("Rowan");



        System.out.println(names.size());
        names.removeLast();
        System.out.println(names.size());

        for(String name: names) {
            System.out.println(name);
        }

        ArrayList<Integer> nums = new ArrayList<>();
        Integer a = 10;
        int b = a;
        Integer c = b;
        Object d = 10;

        ArrayList<Object> values = new ArrayList<>();
        values.add(10);
        values.add("Joseph");
        values.add(new Scanner(System.in));

        int result = (int)values.get(0) + 20;
        System.out.println(result);
    }
}
