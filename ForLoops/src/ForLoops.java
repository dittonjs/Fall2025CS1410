public class ForLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) continue;
            System.out.println(i);
        }

        int[] nums = {1,2,3,4,5,10,22,18};

        for (int num: nums) {
            System.out.println(num);
        }

//        System.out.println(i);
    }
}

/*

 */
