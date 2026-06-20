package sushant.lldPatterns.observerPattern.weatherStation.observer;

import sushant.lldPatterns.observerPattern.weatherStation.observable.TemperatureObservable;

public class MobileDisplay implements Display{

    public TemperatureObservable temperatureObservable;

    public MobileDisplay(TemperatureObservable obj){
        temperatureObservable = obj;
    }

    @Override
    public void update() {
        double temp = temperatureObservable.getTemp();
        displayToMobile(temp);
    }

    private void displayToMobile(double temp) {
        System.out.println("Displayed temperature to mobile: " + temp);
    }

}
