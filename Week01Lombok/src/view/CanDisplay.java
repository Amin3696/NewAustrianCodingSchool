package view;

import controller.BeanCounter;
import controller.CanFilter;
import controller.CanProducer;
import lombok.extern.java.Log;
import model.Bean;

import java.util.Queue;
 @Log
public class CanDisplay {
    public void beanApplication() {
        int whiteResult = 0;
        int blackResult = 0;
        int numberOfTry = 0;

        for (int time = 0; time < 20; time++) {

            CanProducer canProducer = new CanProducer();
            Queue<Bean> can = canProducer.produceCan(10000);
            BeanCounter beanCounter = new BeanCounter();
            String statistics = beanCounter.countBeansType(can);

            CanFilter canFilter = new CanFilter();
            Bean finalBean = canFilter.filterBeans(can);

            if (finalBean.getColor().equals("Black")) {
                blackResult++;

            } else {
                whiteResult++;

            }
            numberOfTry++;
        }
        double whitePercent = whiteResult * 100 / numberOfTry;
        double blackPercent = blackResult * 100 / numberOfTry;
        log.severe(" BlackResult: " + blackPercent + " % " + "\n whiteResult: " + whitePercent + " % ");
    }


}
