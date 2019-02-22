package controller;

import model.Bean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class CanFilterTest {
    @Test
    void testCanFilter(){
        Queue<Bean> can=new LinkedList<>();
        can.add(new Bean("Black"));
        can.add(new Bean("White"));
        can.add(new Bean("White"));
//        can.add(new Bean("Black"));
//        can.add(new Bean("White"));
//        can.add(new Bean("Black"));
//        can.add(new Bean("White"));

        System.out.println(can);
        CanFilter canFilter = new CanFilter();
        Optional<Bean> actual = canFilter.filterBeans(can);
        String actualColor = actual.get().getColor();
        System.out.println(actual);
        String expected="Black";

        Assertions.assertEquals(expected,actualColor);
    }

}