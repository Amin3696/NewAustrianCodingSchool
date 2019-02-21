package controller;

import model.Bean;

import java.util.LinkedList;
import java.util.Queue;

public class CanFilter {


    public Bean filterBeans(Queue<Bean> can) {

        while (can.size() > 1) {
            Bean firstBean = can.poll();
            Bean secondBean = can.poll();
            Bean finalBean = getBeansForCan(firstBean, secondBean);
            can.add(finalBean);
        }

        return can.poll();
    }

    private Bean getBeansForCan(Bean firstBean, Bean secondBean) {
        String firstColor = firstBean.getColor();
        String secondColor = secondBean.getColor();
        if (firstColor.equalsIgnoreCase(secondColor)) {
            return new Bean("Black");
        } else {
            return new Bean("White");
        }
    }
}
