package com.nvelchev.designpatterns.decoratorpattern;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Tomato sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }
}
