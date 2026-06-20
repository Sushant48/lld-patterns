package org.example.observerPattern.weatherStation.observable;

import org.example.observerPattern.weatherStation.observer.Display;

import java.util.ArrayList;
import java.util.List;

public class TemperatureObservable implements Observable{

    private List<Display> displays = new ArrayList<>();
    private double temp = 0;

    @Override
    public void add(Display display) {
        displays.add(display);
    }

    @Override
    public void remove(Display display) {
        displays.remove(display);
    }

    @Override
    public void notifyALl() {
        for(Display display : displays){
            display.update();
        }
    }

    @Override
    public void setData(double temp) {
        boolean notifyAll = false;
        if(this.temp != temp){
            notifyAll = true;
        }

        this.temp = temp;

        if(notifyAll)
            notifyALl();
    }

    public double getTemp(){
        return temp;
    }
}
