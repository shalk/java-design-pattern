package com.xshalk.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditonDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditonDisplay(Observable weatherData) {
        this.observable = weatherData;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditons: " + temperature + "F degrees and "
                + humidity + "% humidity");
    }


//
//    @Override
//    public void update(Object... arg) {
//        this.temperature = (float) arg[0];
//        this.humidity = (float) arg[1];
//        display();
//    }

    @Override
    public void update(java.util.Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData data = (WeatherData) o;
            this.temperature =  data.getTemperature();
            this.humidity = data.getHumidity();
            display();
        }
    }
}
