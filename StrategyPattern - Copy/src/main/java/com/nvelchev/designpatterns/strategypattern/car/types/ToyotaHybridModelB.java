package com.nvelchev.designpatterns.strategypattern.car.types;

import com.nvelchev.designpatterns.strategypattern.behaviours.impl.BrakeWithCeramic;
import com.nvelchev.designpatterns.strategypattern.behaviours.impl.HybridDrive;
import com.nvelchev.designpatterns.strategypattern.behaviours.impl.LongBeep;
import com.nvelchev.designpatterns.strategypattern.car.Car;

public class ToyotaHybridModelB extends Car {
    public ToyotaHybridModelB() {
        super(
                new HybridDrive(),
                new BrakeWithCeramic(),
                new LongBeep()
        );
    }
}
