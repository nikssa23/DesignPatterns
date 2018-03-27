package com.nvelchev.designpatterns.observerpattern;

import com.nvelchev.designpatterns.observerpattern.observables.WeatherStation;
import com.nvelchev.designpatterns.observerpattern.observers.PhoneDisplay;
import com.nvelchev.designpatterns.observerpattern.observers.SocketReporter;

public class Main {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        SocketReporter socketReporter = new SocketReporter(weatherStation);

        weatherStation.add(phoneDisplay);
        weatherStation.add(socketReporter);

        weatherStation.changeTemperature();

    }
}
