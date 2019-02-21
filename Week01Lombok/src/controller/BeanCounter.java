package controller;

import model.Bean;

import java.util.Queue;

public class BeanCounter {

    public String countBeansType(Queue<Bean> can) {


        long whiteBeansAmount = countWhiteBeans(can);
        long blackBeansAmount = countBlackBeans(can);
        Integer totalSize = can.size();
        long total = totalSize.longValue();

        double whitePercent = whiteBeansAmount * 100.00 / total;
        double blackPercent = blackBeansAmount * 100.00 / total;

        String result = "The percentage of White Beans is " + whitePercent + "% and the percentage of Black is " + blackPercent + "%";

        return result;
    }

    private Long countWhiteBeans(Queue<Bean> can) {
        return can.stream()
                .filter(e -> e.getColor().equals("White"))
                .count();
    }

    private Long countBlackBeans(Queue<Bean> can) {
        return can.stream()
                .filter(e -> e.getColor().equals("Black"))
                .count();
    }
}

 