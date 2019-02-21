package controller;

import model.Bean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Queue;

class CanProducerTest {

    private CanProducer canProducer = new CanProducer();

    @Test
    private void testProduceBean() {
        Queue<Bean> can = canProducer.produceCan(4);
       Integer actual = can.size();
        Integer expected = 3;
        Assertions.assertEquals(expected,actual);
        System.out.println(can);


    }
}