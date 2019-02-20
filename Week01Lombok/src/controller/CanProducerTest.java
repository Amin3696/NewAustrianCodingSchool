package controller;

import model.Bean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CanProducerTest {

    private CanProducer canProducer = new CanProducer();

    @Test
    private void testProduceBean() {
        List<Bean> can = canProducer.produceCan(4);
       Integer actual = can.size();
        Integer expected = 3;
        Assertions.assertEquals(expected,actual);
        System.out.println(can);


    }
}