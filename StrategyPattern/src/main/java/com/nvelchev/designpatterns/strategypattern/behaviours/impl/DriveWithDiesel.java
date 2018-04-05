package com.nvelchev.designpatterns.strategypattern.behaviours.impl;

import com.nvelchev.designpatterns.strategypattern.behaviours.IDriveBehaviour;

public class DriveWithDiesel implements IDriveBehaviour {
    @Override
    public String drive() {
        return "I drive with diesel.";
    }
}
