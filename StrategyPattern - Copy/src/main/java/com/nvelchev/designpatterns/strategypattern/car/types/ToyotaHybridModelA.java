package com.nvelchev.designpatterns.strategypattern.car.types;

import com.nvelchev.designpatterns.strategypattern.behaviours.impl.BrakeWithABS;
import com.nvelchev.designpatterns.strategypattern.behaviours.impl.HybridDrive;
import com.nvelchev.designpatterns.strategypattern.behaviours.impl.LongBeep;
import com.nvelchev.designpatterns.strategypattern.car.Car;

public class ToyotaHybridModelA extends Car{

    public ToyotaHybridModelA() {
        super(
                new HybridDrive(),
                new BrakeWithABS(),
                new LongBeep()
        );
    }
}
