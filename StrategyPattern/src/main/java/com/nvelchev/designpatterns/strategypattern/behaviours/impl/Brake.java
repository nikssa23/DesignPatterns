package com.nvelchev.designpatterns.strategypattern.behaviours.impl;

import com.nvelchev.designpatterns.strategypattern.behaviours.IBrakeBehaviour;

public class Brake implements IBrakeBehaviour {

    @Override
    public String brake() {
        return "I stop with standard brakes.";
    }
}
