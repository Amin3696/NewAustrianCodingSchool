package view;

import controller.BeanCounter;
import controller.CanFilter;
import controller.CanProducer;
import lombok.extern.java.Log;
import model.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

@Log
public class CanDisplay {
    public void beanApplication (){

        {
            int whiteResult = 0;
            int blackResult = 0;
            int numberOfTry = 0;
            List<String> statisticData = new ArrayList<>();

            for (int time = 0; time < 20; time++) {

                CanProducer canProducer = new CanProducer();
                Queue<Bean> can = canProducer.produceCan(10000);
                BeanCounter beanCounter = new BeanCounter();
                String statistics = beanCounter.countBeansType(can);

                CanFilter canFilter = new CanFilter();
                Optional<Bean> finalBean = canFilter.filterBeans(can);

                if (finalBean.get().getColor().equals("Black")) {
                    blackResult++;

                } else {
                    whiteResult++;

                }
                numberOfTry++;
                String data = "Final Bean is: " + finalBean.get()+"\n" + statistics;
                statisticData.add(data);
            }
            double whitePercent = whiteResult * 100 / numberOfTry;
            double blackPercent = blackResult * 100 / numberOfTry;
            log.severe(" BlackResult: " + blackPercent + " % " + "\n whiteResult: " + whitePercent + " % ");
            statisticData.stream().forEach(e-> log.severe("\n"+e));
        }
    }
}
