package com.nvelchev.designpatterns.strategypattern.behaviours.impl;

import com.nvelchev.designpatterns.strategypattern.behaviours.IBrakeBehaviour;

public class BrakeWithABS implements IBrakeBehaviour{
    @Override
    public String brake() {
        return "I stop with ABS.";
    }
}
