public class Main {
    public static void main(String[] args) {
        String[] data = {"asdf",  "asdfasfd", "asdfasdfasdf"};

        System.out.println(search(data, "jhg"));
        System.out.println(linearSearch(data, 10));
    }

    public static void display(Object[] data) {
        for (Object obj: data) {
            System.out.println(obj);
        }
    }

    public static <T> boolean search(Object[] data, Object search) {
        for(Object value: data) {
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
