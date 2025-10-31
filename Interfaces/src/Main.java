import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Comparable> data = new ArrayList<>();
        data.add(new Circle(5));
        data.add(new Circle(3));
        data.add(new Circle(1));
        data.add(new Circle(8));
        data.add(new Circle(4));
        data.add(new Circle(5));
        data.add(new Circle(9));
        data.add(new Circle(1));
        data.add(new Circle(2));
        data.add(56);
        data.add(45);
        data.add(18);

        bubbleSort(data);

        for (Comparable c: data) {
            System.out.println(c);
        }


        ArrayList<Comparable> doubles = new ArrayList<>();
        doubles.add(23.3);
        doubles.add(28.3);
        doubles.add(13.3);
        doubles.add(93.3);
        doubles.add(2.3);

        bubbleSort(doubles);

        for(Comparable c: doubles) {
            System.out.println(c);
        }


    }

    public static void write(Writable writable) {
        writable.writeToFile();
    }


    public static void bubbleSort(ArrayList<Comparable> data) {
        boolean didSwap;
        do {
            didSwap = false;

            for(int scan = 0; scan < data.size() - 1; scan++) {
                if (data.get(scan).compareTo(data.get(scan+1)) > 0) {
                    // swap operation
                    Comparable temp = data.get(scan);
                    data.set(scan, data.get(scan+ 1));

                    data.set(scan+1, temp);
                    didSwap = true;
                }
            }
        } while(didSwap);
    }
}
