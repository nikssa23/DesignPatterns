package com.nvelchev.designpatterns.observerpattern.observers;

import com.nvelchev.designpatterns.observerpattern.observables.WeatherStation;

public class SocketReporter implements IObserver {

    WeatherStation weatherStation = null;

    public SocketReporter(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("Send temperature over socket. Temperature: " + this.weatherStation.getTemperature());
    }
}
