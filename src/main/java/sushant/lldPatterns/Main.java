package sushant.lldPatterns;

import sushant.lldPatterns.observerPattern.weatherStation.observable.TemperatureObservable;
import sushant.lldPatterns.observerPattern.weatherStation.observer.Display;
import sushant.lldPatterns.observerPattern.weatherStation.observer.MobileDisplay;
import sushant.lldPatterns.observerPattern.weatherStation.observer.WebDisplay;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        TemperatureObservable tempObservable = new TemperatureObservable();

        Display observer1 = new MobileDisplay(tempObservable);
        Display observer2 = new WebDisplay(tempObservable);

        tempObservable.add(observer1);
        tempObservable.add(observer2);

        tempObservable.setData(10);
        tempObservable.setData(20);
        tempObservable.setData(20);
        tempObservable.setData(30);
    }
}