package com.nvelchev.designpatterns.strategypattern.car;

import com.nvelchev.designpatterns.strategypattern.behaviours.IBeepBehaviour;
import com.nvelchev.designpatterns.strategypattern.behaviours.IBrakeBehaviour;
import com.nvelchev.designpatterns.strategypattern.behaviours.IDriveBehaviour;

public abstract class Car {

    private IDriveBehaviour iDriveBehaviour = null;
    private IBrakeBehaviour iBrakeBehaviour = null;
    private IBeepBehaviour iBeepBehaviour = null;

    public Car(IDriveBehaviour iDriveBehaviour, IBrakeBehaviour iBrakeBehaviour, IBeepBehaviour iBeepBehaviour) {
        this.iDriveBehaviour = iDriveBehaviour;
        this.iBrakeBehaviour = iBrakeBehaviour;
        this.iBeepBehaviour = iBeepBehaviour;
    }

    @Override
    public String toString() {
        return "Car specification{" +
                "Name:" + this.getClass().getSimpleName() +
                ", Drive: " + iDriveBehaviour.drive() +
                ", Brake: " + iBrakeBehaviour.brake() +
                ", Beep: " + iBeepBehaviour.beep() +
                '}';
    }
}
