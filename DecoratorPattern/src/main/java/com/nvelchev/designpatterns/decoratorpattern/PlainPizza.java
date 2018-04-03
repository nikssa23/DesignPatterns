package com.nvelchev.designpatterns.decoratorpattern;

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain pizza description";
    }

    @Override
    public double getCost() {
        return 10.000;
    }
}
