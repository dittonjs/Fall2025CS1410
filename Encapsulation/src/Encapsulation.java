public class Encapsulation {
    public static void main(String[] args) {
        Date date = new Date(29, 9, 2025);
        displayDate(date);
        date.addDay();
        displayDate(date);
        date.addDay();
        displayDate(date);
        date.addDay();
        displayDate(date);
        date.setDay(18);
        displayDate(date);


        Number number = new Number();
        number.add(10.9).subtract(3.2).add(1.5);
        System.out.println(number.getValue());

        StringBuilder builder = new StringBuilder();
        String name = "Joseph";
        builder.append("My name is ")
                .append(name)
                .append(".\n")
                .append("Welcome to class!\n");
                        .


        System.out.println(builder.toString());


    }

    public static void displayDate(Date date) {
        System.out.printf("%d/%d/%d\n", date.getMonth(), date.getDay(), date.getYear());
    }
}
