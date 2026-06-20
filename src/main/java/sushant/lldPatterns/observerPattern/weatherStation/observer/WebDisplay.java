package sushant.lldPatterns.observerPattern.weatherStation.observer;

import sushant.lldPatterns.observerPattern.weatherStation.observable.TemperatureObservable;

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
