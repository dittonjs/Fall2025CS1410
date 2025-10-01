public class Review {
    public static void main(String[] args) {
        String role = "teacher";




        role += "_admin";
        //
//        double a = Math.pow(10, 5);
        System.out.printf("John says, \"%s\".\n", "Hello");

        double b = 45.536;
        System.out.printf("The num is %10.2f\n", b);


        switch(role) {
            case "admin":
            case "teacher":
            case "content developer":
                System.out.println("You are a teacher");
//                break;
            default:
                System.out.println("You are a default.");
        }


        String output = "0";
        while(output.length() < 3) {
            int currentLength = output.length();
            output += Integer.toString(currentLength);
        }
        System.out.println(output);




        int hoursSleep = 0;
        do {
            System.out.println("Sleep");
            hoursSleep++;
        } while(hoursSleep <= 6);

        int a = 12;
        a = doMath(a);
        System.out.println(a);


    }


    public static int doMath(int a) {
        if (a > 10) {
            a = a * 2 + 5;
        } else {
            a = a * 2;
        }
        return a;
    }


}
