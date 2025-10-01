public class Country {
    private String name;
    private static int numCountries = 0;


    public Country() {
        setName("Unmarked Territory");
        numCountries++;
    }

    public Country(String name) {
        setName(name);
        numCountries++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Cannot set name to be empty");
        }
        this.name = name;
    }

    public static int getNumCountries() {
        return numCountries;
    }
}
