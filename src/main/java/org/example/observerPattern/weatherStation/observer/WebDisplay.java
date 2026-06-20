package org.example.observerPattern.weatherStation.observer;

import org.example.observerPattern.weatherStation.observable.TemperatureObservable;

public class WebDisplay implements Display{

    public TemperatureObservable temperatureObservable;

    public WebDisplay(TemperatureObservable obj){
        temperatureObservable = obj;
    }

    @Override
    public void update() {
        double temp = temperatureObservable.getTemp();
        displayToWeb(temp);
    }

    private void displayToWeb(double temp) {
        System.out.println("Displayed temperature to web: " + temp);
    }

}
