package controller;

import model.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class CanProducer {

    public List<Bean> produceCan(Integer beansAmount) {

        List<Bean> can = new ArrayList();


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
            return new Bean("White");
        }
        return new Bean("Black");
    }


}
