package com.nvelchev.designpatterns.strategypattern.behaviours.impl;

import com.nvelchev.designpatterns.strategypattern.behaviours.IDriveBehaviour;

public class DriveWithGasoline implements IDriveBehaviour {
    @Override
    public String drive() {
        return "I drive with gasoline.";
    }
}
