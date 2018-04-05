package com.nvelchev.designpatterns.strategypattern.car.types;

import com.nvelchev.designpatterns.strategypattern.behaviours.impl.BrakeWithAir;
import com.nvelchev.designpatterns.strategypattern.behaviours.impl.DriveWithGasoline;
import com.nvelchev.designpatterns.strategypattern.behaviours.impl.LongBeep;
import com.nvelchev.designpatterns.strategypattern.car.Car;

public class PorscheCayenne extends Car {

    public PorscheCayenne() {
        super(
                new DriveWithGasoline(),
                new BrakeWithAir(),
                new LongBeep()
        );
    }
}
