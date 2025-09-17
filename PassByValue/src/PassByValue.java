public class PassByValue {
    public static void main(String[] args) {
        int x = 10;
        String name = "Joseph";
        doubleX(x);
        changeString(name);
        System.out.println(name);
        name = "something else";
        System.out.println(x);
    }

    public static void doubleX(int x) {
        x = x * 2;
    }

    public static void changeString(String value) {
        value = value + "Hello, world!";
        System.out.println(value);
    }
}
