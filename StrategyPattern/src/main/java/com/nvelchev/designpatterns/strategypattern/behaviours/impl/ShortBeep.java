package com.nvelchev.designpatterns.strategypattern.behaviours.impl;

import com.nvelchev.designpatterns.strategypattern.behaviours.IBeepBehaviour;

public class ShortBeep implements IBeepBehaviour {
    @Override
    public String beep() {
        return "Beeeeeeeeeeep";
    }
}
