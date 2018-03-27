package com.nvelchev.designpatterns.observerpattern.observers;

import com.nvelchev.designpatterns.observerpattern.observables.WeatherStation;

public class PhoneDisplay implements IObserver {

    private WeatherStation weatherStation = null;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        // do something with new state of object
        System.out.println("Update phone display with new temperature: " + this.weatherStation.getTemperature());
    }
}
