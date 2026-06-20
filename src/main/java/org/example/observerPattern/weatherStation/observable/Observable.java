package org.example.observerPattern.weatherStation.observable;

import org.example.observerPattern.weatherStation.observer.Display;

public interface Observable {
    void add(Display display);
    void remove(Display display);
    void notifyALl();
    void setData(double data);
}