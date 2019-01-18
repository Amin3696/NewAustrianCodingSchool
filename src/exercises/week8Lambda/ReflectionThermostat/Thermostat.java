package exercises.week8Lambda.ReflectionThermostat;

import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {



    public String sauna(Double temperature) {
        return sense(temperature, e -> e >= 80.0, e -> (e + 273.15) + " degrees Kelvin!");
    }

    public String skiAlaram(Double temperature) {
        return sense(temperature, e -> e <= 0, e -> e + " degrees Celsius!");
    }


    public String sense(Double temperature, Predicate<Double> trigger, Function<Double, String> display) {

        if (trigger.test(temperature)) {
            return "Warning!";

        }
        return display.apply(temperature);
    }
}
