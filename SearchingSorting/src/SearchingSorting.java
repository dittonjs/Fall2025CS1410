public class SearchingSorting {
    public static void main(String[] args) {
        int[] nums = generate(100000, 10000);
//        report(nums);
        long start = System.currentTimeMillis();
        selectionSort(nums);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
//        report(nums);
//        int[] nums = {1,1,2,3,5,8,13,21,34};
//        System.out.println(binarySearch(nums, 100));
    }// 21
    //           s  e
    // 1,1,2,3,5,8,13,21,34
    public static boolean binarySearch(int[] array, int search) {
        int start = 0;
        int end = array.length - 1;
        // 1 2 3 4 5 6 7
        while(start <= end) {
            int middle = (start + end) / 2;
            if (array[middle] == search) {
                return true;
            } else if (search < array[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return false;
    }

    /*
        2
        56
        3
        1
     */
    public static boolean linearSearch(int[] array, int search) {
        for (int value: array) {
            if (value == search) {
                return true;
            }
        }
        return false;
    }
    //2^n
    //n^2
    //n*log(n)
    //n
    //log(n)
    //C
    public static void betterBubbleSort(int[] array) {

        for(int i = 0; i < array.length; i++) {
            boolean didSwap = false;

            for(int scan = 0; scan < array.length - 1 - i; scan++) {
                if (array[scan] > array[scan+1]) {
                    // swap operation
                    int temp = array[scan];
                    array[scan] = array[scan+1];
                    array[scan+1] = temp;
                    didSwap = true;
                }
            }
            if (!didSwap) break;
        }
    }

    public static void bubbleSort(int[] array) {
        boolean didSwap;
        do {
            didSwap = false;

            for(int scan = 0; scan < array.length - 1; scan++) {
                if (array[scan] > array[scan+1]) {
                    // swap operation
                    int temp = array[scan];
                    array[scan] = array[scan+1];
                    array[scan+1] = temp;
                    didSwap = true;
                }
            }
        } while(didSwap);
    }

    public static void selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1; i ++) {
            int smallest = i;
            for (int scan = i + 1; scan < array.length; scan++) {
                if (array[scan] < array[smallest]) {
                    smallest = scan;
                }
            }
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }
    }

    public static void report(int[] array) {
        if (array.length == 0) return;
        for(int i = 0; i<array.length - 1; i ++) {
            System.out.printf("%d, ", array[i]);
        }
        System.out.println(array[array.length - 1]);
    }

    public static int[] generate(int size, int max) {
        int[] array = new int[size];
        for(int i = 0; i<size; i++) {
            array[i] = (int)(Math.random() * max);
        }
        return array;
    }
}
