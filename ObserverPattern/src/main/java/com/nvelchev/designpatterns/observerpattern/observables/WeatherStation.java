package com.nvelchev.designpatterns.observerpattern.observables;

import com.nvelchev.designpatterns.observerpattern.observers.IObserver;

import java.util.HashSet;
import java.util.Set;

public class WeatherStation implements IObservable {

    private float temperature = 0.0f;

    Set<IObserver> observers = new HashSet<>();

    @Override
    public void add(IObserver iObserver) {
        observers.add(iObserver);
    }

    @Override
    public void remove(IObserver iObserver) {
        observers.remove(iObserver);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }

    public float getTemperature() {
        return this.temperature;
    }

    public void changeTemperature() {
        for (int i = 0; i < 20; i++) {
            this.setNewTemperature(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void setNewTemperature(float newTemperature) {
        this.temperature = newTemperature;
        this.notifyObservers();
    }

}
