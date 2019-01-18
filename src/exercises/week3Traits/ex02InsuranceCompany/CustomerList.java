package exercises.week3Traits.ex02InsuranceCompany;

import exercises.week3Traits.ex01BusinessAndEconomicCustomers.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    public List<Customer> gathereCustomers() {
        List<Customer> customers = new ArrayList<>();
        Customer amin = new Customer("Mr.Amin", "");
        customers.add(amin);
        Customer mahnaz = new Customer("Mrs.Mahnaz", "");
        customers.add(mahnaz);
        Customer amin_hokopoko = new Customer("Amin Hokopoko", "");
        customers.add(amin_hokopoko);
        Customer shamissa = new Customer("shamissa", "");
        customers.add(shamissa);
        return customers;
    }
}
