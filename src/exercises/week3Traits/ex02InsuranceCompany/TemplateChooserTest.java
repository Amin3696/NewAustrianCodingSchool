package exercises.week3Traits.ex02InsuranceCompany;

import exercises.week3Traits.ex01BusinessAndEconomicCustomers.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TemplateChooserTest {
    TemplateChooser templateChooser = new TemplateChooser();

    @Test
    void testManTemplate() {
        Customer shahimian = new Customer("Mr.Shahimian", "");
        String template = templateChooser.choseTemplate(shahimian);
        String expected = "Man";
        Assertions.assertEquals(expected, template);
    }

    @Test
    void testPrivileged() {
        Customer martin_hokopoko = new Customer("Martin Hokopoko", "");
        String template = templateChooser.choseTemplate(martin_hokopoko);
        String expected = "Privilege";
        Assertions.assertEquals(expected, template);
    }

    @Test
    void testWomn() {
        Customer bakhshiani = new Customer("Ms.Bakhshiani", "");
        String template = templateChooser.choseTemplate(bakhshiani);
        String expected = "Woman";
        Assertions.assertEquals(expected, template);
    }

    @Test
    void testDefault() {
        Customer shamissa = new Customer("shamissa", "");
        String template = templateChooser.choseTemplate(shamissa);
        String expected = "default";
        Assertions.assertEquals(expected, template);
    }
}