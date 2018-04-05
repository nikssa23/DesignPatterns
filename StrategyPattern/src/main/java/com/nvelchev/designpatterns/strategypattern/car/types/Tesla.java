package com.nvelchev.designpatterns.strategypattern.car.types;

import com.nvelchev.designpatterns.strategypattern.behaviours.impl.BrakeWithABS;
import com.nvelchev.designpatterns.strategypattern.behaviours.impl.DriveWithElectricity;
import com.nvelchev.designpatterns.strategypattern.behaviours.impl.LongBeep;
import com.nvelchev.designpatterns.strategypattern.car.Car;

public class Tesla extends Car {

    public Tesla() {
        super(
                new DriveWithElectricity(),
                new BrakeWithABS(),
                new LongBeep()
        );
    }
}
