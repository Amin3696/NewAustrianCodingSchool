package controller;

import model.Bean;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class CanProducer {

    public Queue<Bean> produceCan(Integer beansAmount) {
        Queue<Bean> can = new LinkedList<>();

        for (int time = 0; time < beansAmount; time++) {
            Bean bean = produceRandomBean();
            can.add(bean);
        }
        return can;
    }

    private Bean produceRandomBean() {

        Random random = new Random();
        int beanType = random.nextInt(2);
        if (beanType == 0) {
            return Bean.builder().color("White").build();
        } else {
            return Bean.builder().color("Black").build();

        }

    }
}
