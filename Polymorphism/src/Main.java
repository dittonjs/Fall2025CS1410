public class Main {
    public static void main(String[] args) {

        Object dateObject = new GregorianDate();
        System.out.println(dateObject);

        Point p1 = new Point(5, 10);
        Point p2 = new Point(5, 10);
        System.out.println(p1.equals(dateObject));
//        reportDate(date);
    }


    public static void reportDate(Date date) {
        date.report();
    }

    public static void gregorianThings(GregorianDate date) {
        date.doGregorianChant();
    }
}

class Date {
    public void addDays() {
        isLeapYear(1997);
    }

    public void subtractDays() {
        System.out.println("sub days");
    }

    public boolean isLeapYear(int year) {
        System.out.println("DATE is leap year called");
        return false;
    }

    public void report() {
        System.out.println("I am a date");
    }

    @Override
    public String toString() {
        return "I am a date";
    }
}

class JulianDate extends Date {
    @Override
    public boolean isLeapYear(int year) {
        System.out.println("JULIAN DATE is leap year called");
        return false;
    }

    @Override
    public void report() {
        System.out.println("I am a julian date");
    }
}

class GregorianDate extends Date {
    @Override
    public boolean isLeapYear(int year) {
        System.out.println("GREGORIAN DATE is leap year called");
        return false;
    }

    @Override
    public void report() {
        System.out.println("I am a gregorian date");
    }

    public void doGregorianChant() {
        System.out.println("OOOOOOOMMMMMMM");
    }

    @Override
    public String toString() {
        return super.toString() + " and a Gregorian Date";
    }
}


class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point)obj;
            return this.getX() == other.getX() && this.getY() == other.getY();
        }
        return false;
    }
}