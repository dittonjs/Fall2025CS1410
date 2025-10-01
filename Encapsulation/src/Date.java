public class Date {
    private double dayRatio;
    private double monthRatio;
    private int year;

    public Date(int day, int month, int year) {
        this.dayRatio = day / 30.0;
        this.monthRatio = month / 12.0;
        this.year = year;
    }

    public int getDay() {
        return (int)(dayRatio * 30);
    }

    public int getMonth() {
        return (int)(monthRatio * 12);
    }

    public int getYear() {
        return year;
    }

    public void addDay() {
        int day = getDay() + 1;
        dayRatio = day/30.0;
    }


    /**sets the calendar day of the month*/
    public void setDay(int day) {
        this.dayRatio = day / 30.0;
    }
}
