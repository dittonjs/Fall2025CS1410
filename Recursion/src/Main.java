public class Main {
    public static void main(String[] args) {
        printGood(20);
        int[] nums = {1,2,3,4,5};
        System.out.println(sum(nums));
        System.out.println(search(nums, 8));
        System.out.println(factorial(5));
        System.out.println(fib(100));
    }

    public static void printBad(int count) {
        System.out.println(count);
        if (count - 1 >= 0) {
            printBad(count - 1);
        }
    }

    public static void printGood(int count) {
        if (count < 0) return;
        System.out.println(count);
        printGood(count - 1);
    }

    public static int sum(int[] nums) {
        return sum(nums, 0);
    }

    private static int sum(int[] nums, int i) {
        if (i >= nums.length) return 0;
        return nums[i] + sum(nums, i + 1);
    }

    public static boolean search(int[] nums, int search) {
        return search(nums, 0, search);
    }

    private static boolean search(int[] nums, int i, int search) {
        if (i >= nums.length) return false;
        if (nums[i] == search) return true;
        return search(nums, i + 1, search);
    }

    public static double factorial(double n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
}
