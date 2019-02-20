package view;

import controller.BeanCounter;
import controller.CanFilter;
import controller.CanProducer;
import model.Bean;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class CanDisplay {
    public static void main(String[] args) {

        CanProducer canProducer = new CanProducer();
        List<Bean> can = canProducer.produceCan(4);
        System.out.println(can);

        CanFilter canFilter = new CanFilter();
        Optional<Bean> finalBean = canFilter.filterBeans(can);

        BeanCounter beanCounter = new BeanCounter();
        HashMap<String, Long> statistics = beanCounter.countBeansType(can);

        System.out.println(finalBean);
//        System.out.println(statistics.entrySet());
    }

}
