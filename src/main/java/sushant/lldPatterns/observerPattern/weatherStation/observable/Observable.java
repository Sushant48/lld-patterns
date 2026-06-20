package sushant.lldPatterns.observerPattern.weatherStation.observable;

import sushant.lldPatterns.observerPattern.weatherStation.observer.Display;

public interface Observable {
    void add(Display display);
    void remove(Display display);
    void notifyALl();
    void setData(double data);
}