package com.nvelchev.designpatterns.strategypattern.behaviours.impl;

import com.nvelchev.designpatterns.strategypattern.behaviours.IBrakeBehaviour;

public class BrakeWithAir implements IBrakeBehaviour{
    @Override
    public String brake() {
        return "I stop with air brake.";
    }
}
