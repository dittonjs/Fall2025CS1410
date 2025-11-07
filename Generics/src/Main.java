public class Main {
    public static void main(String[] args) {
        String[] data = {"asdf",  "asdfasfd", "asdfasdfasdf"};
        Integer[] data2 = {1,2,3,4,5};
        System.out.println(search(data, "asdf"));
        System.out.println(linearSearch(data, 10));

        String result = get(data, 1);
        Integer result2 = get(data2, 1);

        int smallest = min(10, 12);

//        min(10, "asdf"); // cant to this!!
        System.out.println(smallest);
        System.out.println(min("c", "b"));

    }

    public static <T> T get(T[]array, int index) {
        return array[index];
    }

    public static <T extends Comparable<T>> T min(T value1, T value2) {
        if (value1.compareTo(value2) < 0) return value1;
        else return value2;
    }

    public static <T> void display(T[] data) {
        for (T obj: data) {
            System.out.println(obj);
        }
    }

    public static <T> boolean search(T[] data, T search) {
        for(T value: data) {
            if (value == search) return true;
        }
        return false;
    }

    public static <T> int linearSearch(T[] arr, T target) {
        if (arr == null) {
            return -1; // Handle null array case
        }

        for (int i = 0; i < arr.length; i++) {
            // Use .equals() for object comparison, not ==
            if (arr[i] != null && arr[i].equals(target)) {
                return i; // Element found at this index
            } else if (arr[i] == null && target == null) {
                return i; // Handle case where both are null
            }
        }
        return -1; // Element not found
    }
}
