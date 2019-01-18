package exercises.week3Traits.ex01BusinessAndEconomicCustomers;

public class Customer {
    private String name;
    private String category;

    public Customer(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
