package exercises.week3Traits.ex02InsuranceCompany;

import exercises.week3Traits.ex01BusinessAndEconomicCustomers.Customer;

public class TemplateChooser {

    public String choseTemplate(Customer customer) {
        if (isPrivilaged(customer)) {
            return "Privilege";
        }
        if (isManTemplate(customer)) {
            return "Man";
        }
        if (isWomanTemplate(customer)) {
            return "Woman";
        }
        return "default";
    }

    private Boolean isPrivilaged(Customer customer) {
        String name = customer.getName();
        return name.contains("Hokopoko");
    }

    private Boolean isManTemplate(Customer customer) {
        String name = customer.getName();
        return name.startsWith("Mr.");
    }

    private Boolean isWomanTemplate(Customer customer) {
        String name = customer.getName();
        return name.startsWith("Ms") || name.startsWith("Mrs");
    }
}
 /*public void choseTemplate(Customer customer) {
        String name = customer.getName();
        if (name.contains("Hokopoko")) {
            System.out.println("The template for " + customer.getName() + " is Privileged Template");
        } else if (name.startsWith("Ms.") || name.startsWith("Mrs")) {
            System.out.println("The template for " + customer.getName() + " is Woman Template");
        } else if (name.startsWith("Mr.")) {
            System.out.println("The template for " + customer.getName() +" is Man Template");
        } else {
            System.out.println("The template for " + customer.getName() + "is defult Template");
        }
    }*/