package com.xshalk.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private List<Float> temperatures;
    private Observable observable;
    private float max = Float.MIN_VALUE;
    private float min = Float.MAX_VALUE;
    private float ave = 0;

    public StatisticsDisplay(Observable weatherData) {
        temperatures = new ArrayList<>();
        this.observable = weatherData;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperatures = " + ave + "/" + max + "/" + min);
    }
//
//    @Override
//    public void update(Object... arg) {
//        float temp = (float) arg[0];
//        max = Math.max(max, temp);
//        min = Math.min(min, temp);
//        ave = (ave * temperatures.size() + temp) / (temperatures.size() + 1);
//        temperatures.add(temp);
//        display();
//    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData data = (WeatherData)o;
            float temp = data.getTemperature();
            max = Math.max(max, temp);
            min = Math.min(min, temp);
            ave = (ave * temperatures.size() + temp) / (temperatures.size() + 1);
            temperatures.add(temp);
            display();
        }
    }
}
