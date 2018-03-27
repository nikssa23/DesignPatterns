package com.nvelchev.designpatterns.observerpattern.observables;

import com.nvelchev.designpatterns.observerpattern.observers.IObserver;

public interface IObservable {

    void add(IObserver iObserver);

    void remove(IObserver iObserver);

    void notifyObservers();
}
