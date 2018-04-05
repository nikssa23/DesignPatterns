package com.nvelchev.designpatterns.strategypattern;

import com.nvelchev.designpatterns.strategypattern.car.Car;
import com.nvelchev.designpatterns.strategypattern.car.types.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<Car>() {{
            add(new Tesla());
            add(new PorscheCayenne());
            add(new BMWElectricityCar());
            add(new ToyotaHybridModelA());
            add(new ToyotaHybridModelB());
        }};

        for (Car car : cars) {
            System.out.println(car.toString());
        }

    }
}
