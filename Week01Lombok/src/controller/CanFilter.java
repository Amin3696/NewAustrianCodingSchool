package controller;

import model.Bean;

import java.util.List;
import java.util.Optional;

public class CanFilter {

//    private CanProducer canProducer = new CanProducer();

    public Optional<Bean> filterBeans(List<Bean> can) {

//        List<Bean> can = canProducer.produceCan(3);
        while (can.size() ==1) {
            Bean firstBean = can.get(0);
            can.remove(0);
            Bean secondBean = can.get(1);
            can.remove(1);
            Bean finalBean = getBeansForCan(firstBean, secondBean);
            can.add(finalBean);
        }

        return Optional.of(can.get(0));
    }

    private Bean getBeansForCan(Bean firstBean, Bean secondBean) {
        if (firstBean.getColor().equals(secondBean.getColor())) {

            return new Bean("Black");
        }
        return new Bean("White");
    }
}
