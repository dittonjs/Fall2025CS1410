public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1,2,10);
        circle.move(5,5);
        System.out.printf("%f, %f", circle.getX(), circle.getY());
    }
}
