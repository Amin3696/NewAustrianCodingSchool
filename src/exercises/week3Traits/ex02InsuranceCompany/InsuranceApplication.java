package exercises.week3Traits.ex02InsuranceCompany;

import exercises.week3Traits.ex01BusinessAndEconomicCustomers.Customer;

import java.util.List;

public class InsuranceApplication {
    public static void main(String[] args) {
        TemplateChooser templateChooser = new TemplateChooser();
        CustomerList customerList = new CustomerList();
        List<Customer> customers = customerList.gathereCustomers();
        for (Customer customer : customers) {
            System.out.println("The template for " + customer.getName() + " is " + templateChooser.choseTemplate(customer));
        }
    }
}
