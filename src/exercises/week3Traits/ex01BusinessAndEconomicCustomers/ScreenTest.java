package exercises.week3Traits.ex01BusinessAndEconomicCustomers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScreenTest {

    Screen screen = new Screen();

    @Test
    void testEconomic() {
        Customer simionov = new Customer("Dr.Simionov", "economic");
        String formatedSimionov = screen.formatName(simionov);

        Assertions.assertEquals("dr.simionov",formatedSimionov);
    }
    @Test
    void testBusiness(){
        Customer olaveri = new Customer("ms.Olaveri", "business");
        String formatedOlavero = screen.formatName(olaveri);
        Assertions.assertEquals("MS.OLAVERI",formatedOlavero);
    }
}