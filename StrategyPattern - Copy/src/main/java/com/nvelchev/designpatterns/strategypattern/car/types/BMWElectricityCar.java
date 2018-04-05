package com.nvelchev.designpatterns.strategypattern.car.types;

import com.nvelchev.designpatterns.strategypattern.behaviours.impl.BrakeWithABS;
import com.nvelchev.designpatterns.strategypattern.behaviours.impl.DriveWithElectricity;
import com.nvelchev.designpatterns.strategypattern.behaviours.impl.ShortBeep;
import com.nvelchev.designpatterns.strategypattern.car.Car;

public class BMWElectricityCar extends Car {

    public BMWElectricityCar() {
        super(
                new DriveWithElectricity(),
                new BrakeWithABS(),
                new ShortBeep()
        );
    }

}
