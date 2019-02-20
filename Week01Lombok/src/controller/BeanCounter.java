package controller;

import model.Bean;

import java.util.HashMap;
import java.util.List;

public class BeanCounter {

    public HashMap<String, Long> countBeansType(List<Bean> can) {


        Long whiteBeansAmount = countWhiteBeans(can);
        Long BlackBeansAmount = countBlackBeans(can);
        Integer totalSize = can.size();
        long whitePercentage = (whiteBeansAmount / totalSize) * 100;
        long blackPercentage = (BlackBeansAmount / totalSize) * 100;

        HashMap<String, Long> statistics = new HashMap<>();
        statistics.put("Black",blackPercentage);
        statistics.put("White",whitePercentage);

        return statistics;
    }


    private Long countWhiteBeans(List<Bean> can) {
        return can.stream()
                .filter(e -> e.getColor().equals("White"))
                .count();
    }

    private Long countBlackBeans(List<Bean> can) {
        return can.stream()
                .filter(e -> e.getColor().equals("Black"))
                .count();
    }
}

 