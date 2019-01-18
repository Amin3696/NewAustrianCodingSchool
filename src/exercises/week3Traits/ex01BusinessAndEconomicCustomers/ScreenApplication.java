package exercises.week3Traits.ex01BusinessAndEconomicCustomers;

public class ScreenApplication {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Amin", "economic");
        Customer customer2 = new Customer("Mahnaz", "business");
        Screen screen = new Screen();
        screen.display(customer1);
        screen.display(customer2);
    }
}
