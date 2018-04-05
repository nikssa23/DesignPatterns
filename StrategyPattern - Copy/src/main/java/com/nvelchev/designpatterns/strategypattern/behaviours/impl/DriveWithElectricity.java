package com.nvelchev.designpatterns.strategypattern.behaviours.impl;

import com.nvelchev.designpatterns.strategypattern.behaviours.IDriveBehaviour;

public class DriveWithElectricity implements IDriveBehaviour {
    @Override
    public String drive() {
        return "I drive with electricity.";
    }
}
